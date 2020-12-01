import java.util.Scanner;

public class CompareFloat {

	public static void main(String[] args) {
		float firstFloat = getFloat(1);
		float secondFloat = getFloat(2);
		int precision = 3; // how many decimal places
		
		double firstDouble = firstFloat * (Math.pow(10, precision));
		double secondDouble = secondFloat * (Math.pow(10, precision));
		
		if (Math.floor(firstDouble) == Math.floor(secondDouble)) {
			System.out.println("Same up to " + precision + " decimal places.");
		} else {
			System.out.println("Different with " + precision + " decimal place precision.");
		}
	}

	private static float getFloat(int firstOrSecond) {
		Scanner scanner = new Scanner(System.in);
		float number;
		
		System.out.println("Input floating point number " + firstOrSecond + " : ");
		if (scanner.hasNextFloat()) { 
			number = scanner.nextFloat();	
		} else number = 0; // need to fix this one, not sure how to handle input error
		
		if (firstOrSecond == 2)
			scanner.close();
		return number;
	}
}
