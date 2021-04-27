import java.util.InputMismatchException;

public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String s) {
        super(s);
    }
}
