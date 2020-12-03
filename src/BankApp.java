
public class BankApp {

	public static void main(String[] args) {
		BankAccount[] customers = new BankAccount[4];
		
		customers[0] = new BankAccount(100, "Harish", 200);
		customers[1] = new BankAccount(101, "Michael", 3000);
		customers[2] = new BankAccount(102, "Sean", 20000);
		customers[3] = new BankAccount(103, "Emmanuel", 2000);
		
		int[] customerOrderArray = getDecreasingOrderArray(customers);
		
		// display
		for (int i=0; i<customers.length; i++) {
			for (int j=0; j<customers.length; j++) {
				if ( customerOrderArray[j]==i ) {
					System.out.println(customers[j].toString());
				}
			}
		}
		
	}

	public static int[] getDecreasingOrderArray(BankAccount[] customers) {
		int[] customerOrderArray = new int[4];
//		int[] customerEqualArray = new int[4];
		
		for (int i=0; i < customers.length; i++) {
			int noBigger = 0; 
			
			for (int j=0; j < customers.length; j++) {
//				if ( customerBal == customers[j].getBal() ) {
//					noEqual++;
//				}
				if ( customers[i].getBal() < customers[j].getBal() ) {
					noBigger++;
				}
			}
			
			customerOrderArray[i] = noBigger;
			
//			if (noEqual > 1) {
//				customerEqualArray[i] = noEqual - 1;
//			}
		}
				
//		for (int i =0; i<customerEqualArray.length; i++) {
//			int noEqual = customerEqualArray[i];
//			int j = i+1;
//			while (noEqual>0 && j<customerEqualArray.length) {
//				if ( customers[i].getBal() == customers[j].getBal() ) {
//					noEqual--;
//					customerOrderArray[j] = customerOrderArray[j]+1;
//					customerEqualArray[j] = customerEqualArray[j]-1;	
//				}
//				
//				j++;
//			}
//			// Just for consistency purposes 
//			customerEqualArray[i] = 0;
//		}
		
		return customerOrderArray;
	}

}
