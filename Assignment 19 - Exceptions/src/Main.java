import java.io.Console;
import java.util.InputMismatchException;

public class Main {
    private static final Console console = System.console();
    private static Boolean isValidInput = false;
    private static final Users users = new Users("resources/users.tsv") ;

    public static void main(String[] args)  {
        while (!isValidInput) {
            console.printf("Please enter CPR: ");
            String cpr = console.readLine();

            System.out.print("Please enter password: ");
            String password = String.copyValueOf(console.readPassword());

            try {
                isValidInput = NemIdAuthorizer.isValidInput(users, cpr, password);
            } catch (InputMismatchException e) {
                console.printf("CPR should be 10 digits long, please try again.%n");
                continue;
            } catch (NoSuchUserException e) {
                console.printf("That user doesn't exist, please try again.%n");
                continue;
            }

            if (isValidInput) {
                console.printf("Valid input, thank you.%n");
            }
        }
    }
}
