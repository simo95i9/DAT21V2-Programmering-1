public class Main {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        boolean one = false;
        boolean two= false;
        boolean three= false;
        boolean four= false;
        boolean five= false;
        boolean six= false;
        boolean seven= false;
        boolean eight= false;
        boolean nine= false;
        boolean ten= false;

        try {
            one = yes == no || grade > amount;
            //two = amount == 40.0 || 50.0;  //error
            three = hiVal != loVal || loVal < 0;
            //four = True || hello.length() > 0; //error
            five = hello.isEmpty() && yes;
            six = grade <= 100 && !false;
            seven = !yes || no;
            //eight = grade > 75 > amount; //error
            nine = amount <= hiVal && amount >= loVal;
            ten = no && !no || yes && !yes;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("#1 " + one);
        System.out.println("#2 " + two);
        System.out.println("#3 " + three);
        System.out.println("#4 " + four);
        System.out.println("#5 " + five);
        System.out.println("#6 " + six);
        System.out.println("#7 " + seven);
        System.out.println("#8 " + eight);
        System.out.println("#9 " + nine);
        System.out.println("#10 " + ten);
    }
}
