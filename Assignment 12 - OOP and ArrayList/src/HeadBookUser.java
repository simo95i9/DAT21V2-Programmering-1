import java.util.ArrayList;

public class HeadBookUser {
    // Exercise 2
    // Write a class: HeadBookUser.
    // The class has the following attributes: e-mail, password, friends
    // The following methods: addToFriendList(HeadBookUser), displayAllFriends()
    // Test the methods with test-data.


    // Make attributes private for better encapsulation
    private String email;
    private String password; // Don't ever *actually* store a password in plaintext
    private ArrayList<HeadBookUser> friends;


    // Class constructor is private, we use a builder method to make a fluent interface for the class
    // https://belief-driven-design.com/fluent-interfaces-b11b901f1eb/
    private HeadBookUser(String email, String password) {
        this.email = email;
        this.password = password;
        this.friends = new ArrayList<>();
    }

    // Call this instead to begin building your user
    public static Builder builder() {
        return new Builder();
    }

    // Builder class has all the attributes needed to create a HeadBookUser object,
    // but obtains them one at a time through it's appropriately named methods,
    // it returns itself each time, so we can continue adding data to it by chaining .method() calls.
    public static class Builder {
        private String email;
        private String password;

        public Builder() { }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public HeadBookUser build() {
            return new HeadBookUser(this.email, this.password);
        }
    }


    // override toString(), important for displaying friends.
    @Override
    public String toString() {
        return "HeadBookUser { " + this.email + " }";
    }


    // Methods for the exercise
    public void displayAllFriends() {
        System.out.println(this.email + " has these friends " + this.friends);
    }
    public void addFriend(HeadBookUser newFriend) {
        // Add the new friend
        this.friends.add(newFriend);
    }

}
