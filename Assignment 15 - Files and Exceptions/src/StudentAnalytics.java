import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentAnalytics {
	public static void main(String[] args) throws FileNotFoundException {
		// Exercise 1
		// Print all the lines of students.csv
		System.out.println("\nExercise 1");
		printAllLines("resources/students.csv");
		
		
		// Exercise 2
		// Write a model that contains all the student data
		System.out.println("\nExercise 2");
		Student myStudent = new Student("name@example.com", "Name");
		System.out.println(myStudent);
		
		// Exercise 3
		System.out.println("\nExercise 3");
		ArrayList<Student> students = Student.fromCSVFile("resources/students.csv", ";");
		
		System.out.printf("Student with longest name: %s\n",        Student.findLongestName(students));
		System.out.printf("How many Simons are there: %s\n",        Student.howManySimons(students));
		System.out.printf("Average length of student name: %.2f\n", Student.averageNameLength(students));
		System.out.printf("Student with most names: %s\n",          Student.maxAmountOfNames(students));
		
	}
	
	// Exercise 1
	private static void printAllLines(String filePath) throws FileNotFoundException {
		File studentsFile = new File(filePath);
		
		Scanner studentsScanner = new Scanner(studentsFile);
		
		while (studentsScanner.hasNextLine()) {
			System.out.println(studentsScanner.nextLine());
		}
		
		studentsScanner.close();
	}
}



// Exercise 2
class Student {
	private static Integer idCounter = 0;
	private final Integer id;
	private String email;
	private String name;
	
	public Student(String email, String name) {
		this.email = email;
		this.name = name;
		this.id = Student.idCounter;
		
		Student.idCounter++;
	}
	
	// Getters and Setter for email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getter and Setter for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// Exercise 3
	public static ArrayList<Student> fromCSVFile(String filePath, String delimiter) throws FileNotFoundException {
		ArrayList<Student> students = new ArrayList<>();
		File studentsFile = new File(filePath);
		Scanner studentsScanner = new Scanner(studentsFile);
		
		
		while (studentsScanner.hasNextLine()) {
			String[] studentLine = studentsScanner.nextLine().split(delimiter);
			
			if (studentLine.length == 2) {
				String studentEmail = studentLine[0].strip();
				String studentName = studentLine[1].strip();
				
				students.add( new Student(studentEmail, studentName) );
			}
		}
		
		studentsScanner.close();
		
		return students;
	}
	
	// Exercise 3
	public static Student findLongestName(ArrayList<Student> students) {
		Student studentWithLongestName = new Student("", "");
		
		for (Student student : students) {
			if (student.getName().length() > studentWithLongestName.getName().length()) {
				studentWithLongestName = student;
			}
		}
		
		return studentWithLongestName;
	}
	
	// Exercise 3
	public static Integer howManySimons(ArrayList<Student> students) {
		Integer simonCounter = 0;
		
		for (Student student : students) {
			if (student.getName().split(" ")[0].equalsIgnoreCase("Simon")) {
				simonCounter++;
			}
		}
		
		return simonCounter;
	}
	
	// Exercise 3
	public static Double averageNameLength(ArrayList<Student> students) {
		Integer studentCount = students.size();
		Integer totalNameLength = 0;
		
		for (Student student: students) {
			totalNameLength += student.getName().length();
		}
		
		return totalNameLength.doubleValue() / studentCount;
	}
	
	// Exercise 3
	public static Student maxAmountOfNames(ArrayList<Student> students) {
		Student studentWithMostNames = new Student("", "");
		
		for (Student student : students) {
			if (student.getName().split(" ").length > studentWithMostNames.getName().split(" ").length) {
				studentWithMostNames = student;
			}
		}
		
		return studentWithMostNames;
	}
	
	
	@Override
	public String toString() {
		return String.format("Student{id=%d email='%s' name='%s'}", this.id, this.email, this.name);
	}
}
