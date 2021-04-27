public class NoSuchUserException extends RuntimeException {

    public NoSuchUserException() {
        super("No such user found");
    }

}
