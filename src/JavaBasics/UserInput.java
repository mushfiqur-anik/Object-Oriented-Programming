package JavaBasics;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		// Variables & declarations
		Scanner keyboard = new Scanner(System.in);
		String name;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("My name is " + name);
	}

}
