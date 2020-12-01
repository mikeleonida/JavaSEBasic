import java.util.Scanner;

public class WeekdayName {

	public static void main(String[] args) {
		int weekdayInteger = getWeekdayNumber();
		
		if (weekdayInteger < 0) {
			System.out.println("Invalid weekday.");
			return;
		}
		
		weekdayInteger = weekdayInteger % 7;
		
		switch (weekdayInteger) {
		case 0 :
			System.out.println("Sunday");
			break;
			
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		default :
			System.out.println("Invalid weekday.");
		}
	}

	private static int getWeekdayNumber() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input weekday number between 1 and 7: ");
		
		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			scanner.close();

			return number;
		}
		
		scanner.close();
		return -1;
	}
}
