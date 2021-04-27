public class Cpr {

    public static String normalize(String cpr) {
        // this is raw user input
        // iterate characters in the cpr string
        // only save the numbers
        // so we don't fail in case of spaces and dashes used as formatting

        StringBuilder cprNumbers = new StringBuilder();
        for (char c : cpr.toCharArray()) {
            if (c >= '0' && c <= '9') {
                cprNumbers.append(c);
            }
        }

        return cprNumbers.toString();
    }

}
