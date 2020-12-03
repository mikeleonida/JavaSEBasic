
public class BankAccount {
	private int accNo;
	private String name;
	private double bal;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accNo, String name, double bal) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}

	public int getAccNo() {
		return accNo;
	}

	private void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	private void setBal(double bal) {
		this.bal = bal;
	}
	
	// Business Logic -- processing
	public boolean deposit(double amt) {
		if (amt<0) {
			return false;
		}
		bal = bal + amt;
		return true;
	}
	
	public int withdraw(double amt) {
		if(amt < 0) {
			return -1;
		}
		if (amt > bal) {
			return 0;
		}
		bal = bal - amt;
		return 1;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", bal=" + 
				String.format( "%.2f", bal ) + "]";
	}
}
