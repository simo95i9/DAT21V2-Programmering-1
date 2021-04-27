import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;

import java.util.InputMismatchException;

public class Main {
    private static final TextIO textIO = TextIoFactory.getTextIO();
    private static final TextTerminal<?> terminal = textIO.getTextTerminal();

    private static Boolean isValidInput = false;
    private static final Users users = new Users("resources/users.tsv") ;

    public static void main(String[] args)  {
        while (!isValidInput) {
            String cpr = textIO.newStringInputReader()
                    .read("Please enter CPR: ");

            String password = textIO.newStringInputReader()
                    .withInputMasking(true)
                    .read("Please enter password: ");

            try {
                isValidInput = NemIdAuthorizer.isValidInput(users, cpr, password);
            } catch (InputMismatchException e) {
                terminal.printf("CPR should be 10 digits long, please try again.%n");
                continue;
            } catch (NoSuchUserException e) {
                terminal.printf("That user doesn't exist, please try again.%n");
                continue;
            }

            if (isValidInput) {
                terminal.printf("Valid input, thank you.%n");
            }
        }
    }
}
