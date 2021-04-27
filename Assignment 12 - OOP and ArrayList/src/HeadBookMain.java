public class HeadBookMain {

    public static void main(String[] args) {
        HeadBookUser markZ = HeadBookUser.builder()
                .email("mark@zuckerberg.com")
                .password("IAmNotALizardMan123")
                .build();

        HeadBookUser larryP = HeadBookUser.builder()
                .email("larry@page.com")
                .password("Don'tBeEvil")
                .build();

        HeadBookUser elonM = HeadBookUser.builder()
                .email("elon@musk.com")
                .password("There'sNoEvilAIUnderTheBed")
                .build();


        markZ.addFriend(elonM);
        elonM.addFriend(larryP);


        markZ.displayAllFriends();
        larryP.displayAllFriends();
        elonM.displayAllFriends();
    }
}
