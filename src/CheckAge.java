import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		int age = getAge();
		if (age < 0)
			System.out.println("Invalid age entered.");
		else if (age < 18) 
			System.out.println("Person is a minor.");
		else 
			System.out.println("Person is an adult.");
	}
	
	private static int getAge() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input age to be checked: ");
		
		if (scanner.hasNextInt()) {
			int age = scanner.nextInt();
			scanner.close();
			
			if (age >= 0)
				return age;
		}
		
		return -1;
	}

}
