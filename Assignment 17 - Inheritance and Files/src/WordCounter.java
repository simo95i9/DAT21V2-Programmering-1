import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("resources/warandpeace.txt");
		
		// return immediately if this test fails 
		if ( !file.exists() || !file.isFile() || !file.canRead() ) {
			System.out.println("Couldn't read file :/");
			return;
		}
		
		Integer wordCounter = 0;
		
		Scanner scanner = new Scanner(file);
		
		while ( scanner.hasNextLine() ) {
			wordCounter += scanner.nextLine().strip().split(" ").length;
		}
		
		scanner.close();
		
		System.out.printf("%s contains %,d %s%n", file.getName(), wordCounter, (wordCounter == 1 ? "word" : "words") );
	}

}
