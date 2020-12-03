import java.util.HashMap;
import java.util.Map;

// this solution uses HashMap
public class Bank {
	
	private static Map<Integer, BankAccount> displayDecrCustList = new HashMap<Integer, BankAccount>();
	private static BankAccount[] customers = new BankAccount[4];
	
	public static void main(String[] args) {
		customers[0] = new BankAccount(100, "Harish", 2000);
		customers[1] = new BankAccount(101, "Michael", 20000);
		customers[2] = new BankAccount(102, "Sean", 2000);
		customers[3] = new BankAccount(103, "Emmanuel", 20000);

		processArrayDecrOrder();
		
		// display
		for (int i=0; i<customers.length; i++) {
			System.out.println(displayDecrCustList.get(i));
		}
	}

	public static void processArrayDecrOrder() {
		int[] customerOrderArray = new int[4];
		int[] customerEqualArray = new int[4];
		
		for (int i=0; i < customers.length; i++) {
			int noBigger = 0; 
			int noEqual = 0;
			double customerBal =customers[i].getBal();
			
			for (int j=0; j < customers.length; j++) {
				if ( customerBal == customers[j].getBal() ) {
					noEqual++;
				}
				if ( customerBal < customers[j].getBal() ) {
					noBigger++;
				}
			}
			customerOrderArray[i] = noBigger;
			
			if (noEqual > 1) {
				customerEqualArray[i] = noEqual - 1;
			}
		}
			
		// resolve order of display for accounts with same balance
		for (int i =0; i<customerEqualArray.length; i++) {
			int noEqual = customerEqualArray[i];
			int j = i+1;
			while (noEqual>0 && j<customerEqualArray.length) {
				if ( customers[i].getBal() == customers[j].getBal() ) {
					noEqual--;
					customerOrderArray[j] = customerOrderArray[j]+1;
					customerEqualArray[j] = customerEqualArray[j]-1;	
				}
				
				j++;
			}
			// Just for consistency purposes 
			customerEqualArray[i] = noEqual;
		}
		
		for (int i=0; i<customerOrderArray.length; i++) {
			displayDecrCustList.put(customerOrderArray[i], customers[i]);
		}
		
		return;
	}

}
