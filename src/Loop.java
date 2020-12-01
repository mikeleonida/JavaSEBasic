
public class Loop {
	public static void main(String[] args) {
		int no = 1;
		int lastNo = 10;
	
		while(no <= lastNo) {
			System.out.print(no + ", ");
			no ++;
		}
		
		no = 100;
		do {
			System.out.println("\n\nIside do_while");
			System.out.println("no = " + no);
		} while(no <= lastNo);
		
		for(no = 1; no<=10; no++) {
			System.out.print(no + ", ");
		}
	}
}
