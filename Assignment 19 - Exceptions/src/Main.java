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
        terminal.setBookmark("");
        while (!isValidInput) {
            terminal.resetToBookmark("");

            String cpr = textIO.newStringInputReader()
                    .read("Please enter CPR: ");

            String password = textIO.newStringInputReader()
                    .withInputMasking(true)
                    .read("Please enter password: ");

            try {
                isValidInput = NemIdAuthorizer.isValidInput(users, cpr, password);
            } catch (InvalidInputException e) {
                textIO.newStringInputReader()
                        .withMinLength(0)
                        .read(String.format("CPR should be 10 digits long. Press enter to try again.%n"));
                continue;
            } catch (NoSuchUserException e) {
                textIO.newStringInputReader()
                        .withMinLength(0)
                        .read(String.format("That user doesn't exist. Press enter try again.%n"));
                continue;
            } catch (IncorrectPasswordException e) {
                textIO.newStringInputReader()
                        .withMinLength(0)
                        .read(String.format("Password is incorrect. Press enter to try again.%n"));
            }

            if (isValidInput) {
                terminal.printf("Valid input, thank you.%n");
            }
        }
    }
}
