import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LetterToNumberEncryptionTest {

    @Test
    void fromStringToNumber() {
        assertEquals("012", LetterToNumberEncryption.fromStringToNumber("abc"));
        assertEquals("111411819417", LetterToNumberEncryption.fromStringToNumber("lobster"));
        assertEquals("012345678910111213141516171819202122232425", LetterToNumberEncryption.fromStringToNumber("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}

