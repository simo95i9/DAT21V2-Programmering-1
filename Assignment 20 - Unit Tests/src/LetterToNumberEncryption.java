public class LetterToNumberEncryption {

    public static void main(String[] args) {
        System.out.println("fromStringToNumber(\"lobster\") = " + fromStringToNumber("lobster"));
    }

    public static String fromStringToNumber(String s) {
        StringBuilder sb = new StringBuilder();
        s.toUpperCase().chars().forEach( (int c) -> sb.append( c - 'A'));
        return sb.toString();
    }
}

