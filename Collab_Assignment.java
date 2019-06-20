import java.util.Scanner;

public class Collab_Assignment {

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);

		System.out.println("Hello! Please tell me your name: ");
		String name = userInputScanner.nextLine();
		System.out.println("Hello " + name +"!");
		
		userInputScanner.close();
	}

}
