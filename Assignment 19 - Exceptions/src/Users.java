import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Users {
    private Map<String, User> users;

    public Users(String filePath) {
        try {
            this.users = loadFromFile(filePath);
        } catch (FileNotFoundException e) {
            System.console().printf("User file not found :/%n");
        }
    }

    public User getUser(String cpr) {
        return this.users.getOrDefault(cpr, new User(null,null));
    }

    public Boolean exist(String normalizedCpr) {
        return users.containsKey(normalizedCpr);
    }

    @Override public String toString() {
        return users.toString();
    }

    private Map<String, User> loadFromFile(String filePath) throws FileNotFoundException {
        Map<String, User> users = new HashMap<>();

        File usersFile = new File(filePath);
        Scanner usersScanner = new Scanner(usersFile);

        if (usersScanner.hasNextLine()) {
            usersScanner.nextLine(); // Skip .tsv header
        }

        while (usersScanner.hasNextLine()) {
            String[] userLine = usersScanner.nextLine().split("\t");

            if (userLine.length >= 2) {
                String cpr = Cpr.normalize( userLine[0] );
                String password = userLine[1];

                users.put(cpr, new User( cpr, password ));
            }
        }
        return users;
    }

}
