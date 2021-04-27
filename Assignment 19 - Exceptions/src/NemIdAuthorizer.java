import java.util.InputMismatchException;

public class NemIdAuthorizer {
    public static Boolean isValidInput(Users users, String cpr, String password) throws InputMismatchException, NoSuchUserException {
        String normalizedCpr = Cpr.normalize(cpr);

        if (normalizedCpr.length() != 10) {
            throw new InputMismatchException("Input is not 10 digits long");
        }

        if ( !users.exist(normalizedCpr) ) {
            throw new NoSuchUserException();
        }

        return true;
    }
}
