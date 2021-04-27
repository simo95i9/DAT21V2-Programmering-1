import java.util.InputMismatchException;

public class NemIdAuthorizer {
    public static Boolean isValidInput(Users users, String cpr, String password) throws NoSuchUserException, IncorrectPasswordException, InvalidInputException {
        String normalizedCpr = Cpr.normalize(cpr);

        if (normalizedCpr.length() != 10) {
            throw new InvalidInputException("cpr should contain exactly 10 digits");
        }

        if ( !users.exist(normalizedCpr) ) {
            throw new NoSuchUserException("user doesn't found");
        }

        if ( !users.getUser(normalizedCpr).checkPassword(password) ) {
            throw new IncorrectPasswordException("incorrect password");
        }

        return true;
    }
}
