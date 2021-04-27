import java.util.ArrayList;

public class PettingZoo {
	
	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add( new Alligator("Casper"));
		animals.add( new Cow("Wilbur"));
		animals.add( new Duck("Donald"));
		
		for (Animal animal : animals) {
			animal.makeSound();
		}
		
	}
}

class Alligator extends Animal {
	
	public Alligator (String name) {
		super(name, 4, false);
	}
	
	public void makeSound() {
		System.out.println("Grrrraaargghhh!!!!");
	}
}


class Cow extends Animal {
	
	public Cow (String name) {
		super(name, 4, true);
	}
	
	public void makeSound() {
		System.out.println("Muuuhhhh!");
	}
}

class Duck extends Animal {
	
	public Duck (String name) {
		super(name, 2, false);
	}
	
	public void makeSound() {
		System.out.println("Quack, quack");
	}
}

abstract class Animal {
	private String name;
	private final Integer numberOfLegs;
	private final Boolean isMammal;
	
	public Animal(String name, Integer numberOfLegs, Boolean isMammal) {
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.isMammal = isMammal;
	}
	
	abstract public void makeSound();
	
	public String getName() {
		return this.name;
	}
	public Integer getNumberOfLegs() {
		return this.numberOfLegs;
	}
	public Boolean getIsMammal() {
		return this.isMammal;
	}
	
	
	public String setName(String name) {
		return this.name = name;
	}
	
}