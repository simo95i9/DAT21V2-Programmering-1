import java.util.Arrays;
import java.util.function.Predicate;

public class Password {

    private static final String NUMBERS = "0123456789";
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String SPECIALS = "{}!#\"$’%^&,*()_+-=:;?.@";
    private static final Integer MAX_REPEATS = 4;
    private static final Integer MIN_LENGTH = 6;
    private static final Integer MAX_LENGTH = 40;

    /*
    1. Skal være mellem 6 og 40 tegn
    2. Skal indeholde både bogstaver og tal
    3. Må ikke indeholde visse specialtegn, herunder æ, ø og å
    4. Må ikke indeholde det samme tegn 4 gange i træk
    5. Må hverken starte eller slutte med et blanktegn
    6. Må ikke indeholde dit cpr- eller NemID-nummer
    7. Der skelnes ikke mellem store og små bogstaver.
    8. Tilladte specialtegn er: { } ! # " $ ’ % ^ & , * ( ) _ + - = : ; ? . og @.
    */

    static Boolean isValidPassword(String CPR, String password) {
        Boolean hasNumbers = stringHasCharactersInCharacterSet(password, NUMBERS);
        Boolean hasLetters = stringHasCharactersInCharacterSet(password, LETTERS);
        Boolean hasSpecials = stringHasCharactersInCharacterSet(password, SPECIALS);
        Boolean hasIllegalCharacters = stringHasCharactersOutsideCharacterSet(password, NUMBERS+LETTERS+SPECIALS);
        Boolean hasRepeats = hasRepeats(password, MAX_REPEATS);
        Boolean hasRightLength =  numberIsInRange(password.length(), MIN_LENGTH, MAX_LENGTH);
        Boolean hasCPR = password.contains(CPR);

        return  hasLetters
                && hasNumbers
                && hasRightLength
                && !hasRepeats
                && !hasIllegalCharacters
                && !hasCPR;
    }

    private static Boolean hasRepeats(String string, Integer repeats) {
        return Arrays.stream(string.split("")) // Split string into letters
                .distinct() // Only include unique letters
                .map( c -> string.contains( c.repeat(repeats) )) // For each letter, check if it occurs x times in a row
                .reduce(false, Boolean::logicalOr); // Do a logical OR on the results to find if any the checks was true
    }

    private static Boolean stringHasCharactersOutsideCharacterSet(String string, String characterSet) {
        return !Arrays.stream(string.split("")) // Split string into letters
                .distinct() // Only include unique letters
                .allMatch( characterSet::contains ); // Find if all test were true and flip boolean, i.e. at least one was outside the character set.
    }

    private static Boolean stringHasCharactersInCharacterSet(String string, String characterSet) {
        // For each letter, check if it's contained in the character set
        return Arrays.stream(string.split("")) // Split string into letters
                .distinct() // Only include unique letters
                .anyMatch( characterSet::contains); // Find if any test were true, i.e. at least one were in the character set.

    }

    private static Boolean numberIsInRange(Integer number, Integer min, Integer max) {
        return number >= min && number <= max;
    }

}