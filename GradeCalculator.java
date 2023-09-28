import java.util.Scanner;
public class ClassGradeCalculator {
	
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       System.out.println("Welcome to Grade Calculator");

	       System.out.println("Please enter your name and surname: ");
	       String name = scanner.nextLine();
	       System.out.println("Enter the Math grade: ");
	       int math = scanner.nextInt();
	       System.out.println("Enter the Physics grade: ");
	       int physics = scanner.nextInt();
	       System.out.println("Enter the Chemistry  grade: ");
	       int chemistry = scanner.nextInt();
	       System.out.println("Enter the Turkish grade: ");
	       int turkish = scanner.nextInt();
	       System.out.println("Enter the History grade: ");
	       int history = scanner.nextInt();
	       System.out.println("Enter the Music grade: ");
	       int music = scanner.nextInt();

	       int total = (math + physics + chemistry + turkish + history + music);
	       double average = total / 6;

	       System.out.println("Your average is: " + average);

	       double passing_limit = 60.0;
	       String sonuc;
	       sonuc = (average>=passing_limit) ? "Congratulations "+name: "Take this class again "+name;

	       System.out.println(sonuc);
	    
	}
}
