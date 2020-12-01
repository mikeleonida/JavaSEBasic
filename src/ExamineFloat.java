import java.util.Scanner;

public class ExamineFloat {

	public static void main(String[] args) {
		float num = getFloat();
		boolean isSmall = false;
		boolean isLarge = false;
		
		if (num == 0) {
			System.out.println("zero");
			return;
		} else if (num > -1 && (num < 1)) {
			isSmall = true;
		} else if (num > 1000000 || (num < -1000000)) {
			isLarge = true;
		}
		
		if (num > 0) {
			System.out.print("positive ");	
		} else 
			System.out.print("negative ");
		
		printSmallOrLarge(isSmall, isLarge);
	}

	
	private static float getFloat() {
		Scanner scanner = new Scanner(System.in);
		float number;
		
		do {
			System.out.println("Input floating point number to be checked: ");
		} while (!scanner.hasNextFloat()); 
		
		number = scanner.nextFloat();
		scanner.close();
		
		return number;
	}
	
	private static void printSmallOrLarge (boolean isSmall, boolean isLarge) {
		if (isSmall) {
			System.out.print("small");
		} else if (isLarge) {
			System.out.print("large");
		}
	}
}
