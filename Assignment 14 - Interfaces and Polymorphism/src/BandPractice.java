import java.util.*;

public class BandPractice {
	public static void main(String[] args) {
		List<Playable> myBand = new ArrayList<>();
		
		myBand.add(new Trumpet());
		myBand.add(new Guitar());
		myBand.add(new Drums());
		
		for (Playable instrument : myBand) {
			instrument.playSound();
		}
	}
}

interface Playable {
	public void playSound();
}

class Trumpet implements Playable {
	
	@Override
	public void playSound() {
		System.out.println("doot doot 🎺");
	}
}

class Drums implements Playable {
	
	@Override
	public void playSound() {
		System.out.println("badum tsss 🥁");
	}
}

class Guitar implements Playable {
	
	@Override
	public void playSound() {
		System.out.println("pling plong plang 🎸");
	}
}
