import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String[] args) {
		int year = getYear();
		boolean isLeap = isLeapYear(year);
		System.out.println(year + " is" + (isLeap ? " " : " not ") + "a leap year");
	}

	public static boolean isLeapYear (int year) {
        if (year<0) {
            return false;
        }
        if ((year % 4) != 0) {
            return false;
        } else if ((year % 100) != 0) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        }

        return false;
    }
	
	private static int getYear() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input year to be checked: ");
		
		if (scanner.hasNextInt()) {
			int year = scanner.nextInt();
			scanner.close();
			
			if (year >= 0)
				return year;
		}
		
		return -1;
	}
}
