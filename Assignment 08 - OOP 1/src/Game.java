import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

//Exercise 3
public class Game {
    public static void main(String[] args) {
        Cat myCat = new Cat("Floyd", Mood.HAPPY, Hunger.FULL, Energy.SLEEPY);
        myCat.greet();

        Cat myOTherCat = new Cat("Tom", Mood.ANGRY, Hunger.FULL, Energy.PLAYFUL);
        myOTherCat.greet();

        LocalDate myBirthday = LocalDate.of(1968, Month.APRIL, 1);
        Person myPerson = new Person("Henry", myBirthday,8.5, Hunger.HUNGRY);
        myPerson.greet();

        LocalDate myOtherBirthday = LocalDate.of(1997, Month.NOVEMBER, 11);
        Person myOtherPerson = new Person("Simon", myOtherBirthday,8.0, Hunger.HUNGRY);
        myOtherPerson.greet();
    }
}

//Exercise 1
class Cat {
    // All the attributes a cat could ever have
    private String name;
    private Mood mood;
    private Hunger hunger;
    private Energy energy;

    // Constructor takes all the inputs and just puts them into the instance attributes.
    Cat(String name, Mood mood, Hunger hunger, Energy energy) {
        this.name = name;
        this.mood = mood;
        this.hunger = hunger;
        this.energy = energy;
    }

    // Print the greeting
    public void greet() {
        System.out.println(this.greeting());
    }

    // Construct the greeting, get the cat's attributes using accessor methods
    private String greeting() {
        return "Hi there, I'm " + this.name() + " and I'm a " + this.mood() + " and " + this.energy() + " cat :3";
    }

    // Accessors for attributes
    public String name() {
        return this.name;
    }
    public Mood mood() {
        return this.mood;
    }
    public Hunger hunger() {
        return this.hunger;
    }
    public Energy energy() {
        return this.energy;
    }
}

//Exercise 2
class Person {
    // All the attributes a person could ever have
    private String name;
    private LocalDate birthday;
    private double shoeSize;
    private Hunger hunger;

    // Constructor takes all the inputs and just puts them into the instance attributes.
    Person(String name, LocalDate birthday, double shoeSize, Hunger hunger) {
        this.name = name;
        this.birthday = birthday;
        this.shoeSize = shoeSize;
        this.hunger = hunger;
    }

    // Print the greeting
    public void greet() {
        System.out.println(this.greeting());
    }

    // Construct the greeting, get the person's attributes using accessor methods
    private String greeting() {
        return
                "My name is " + this.name() + ", " +
                "I'm " + this.age() + " years old and " +
                "I'll kick your butt with my size " + this.shoeSize + " foot!";
    }

    // Calculate how old the person is using ChronoUnit
    public long age() {
        LocalDate then = this.birthday();
        LocalDate now = LocalDate.now();
        return ChronoUnit.YEARS.between(then, now);
    }

    // All the accessor methods
    public String name() {
        return this.name;
    }
    public LocalDate birthday() {
        return this.birthday;
    }
    public double shoeSize() {
        return this.shoeSize;
    }
    public Hunger hunger() {
        return this.hunger;
    }
}

enum Mood {
    HAPPY("happy"),
    ANGRY("angry"),
    SAD("sad");

    private final String description;

    Mood(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}

enum Hunger {
    FULL("full"),
    HUNGRY("hungry");

    private final String description;

    Hunger(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}

enum Energy {
    PLAYFUL("playful"),
    SLEEPY("sleepy");

    private final String description;

    Energy(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}


