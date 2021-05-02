import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void isValidPassword() {
        assertTrue( Password.isValidPassword("1234564321", "hejmeddig123456") );
        assertTrue( Password.isValidPassword("1234561234", "password1234") );
        assertTrue( Password.isValidPassword("1234561234", "password1234-AAAB") );


        assertFalse( Password.isValidPassword("1234561234", "hejmeddig1234561234") ); // has cpr, fail
        assertFalse( Password.isValidPassword("1234561234", "kode1234-AAAA") ); // four repeats, fail
        assertFalse( Password.isValidPassword("1234561234", "password") ); // no numbers, fail
        assertFalse( Password.isValidPassword("1234561234", "k0d3") ); // too short, fail
        assertFalse( Password.isValidPassword("1234561234", "0hN0TooManyæøå")); // illegal chars, fail
    }
}