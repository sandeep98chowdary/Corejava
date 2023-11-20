package oopsdemo2;

public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount sAccountObj = new SavingsAccount("John", 500, 4);
		   
        System.out.println("\nSavings Account Details");
        System.out.println("------------------------");
        System.out.println("" + sAccountObj.getName()
        + " has an initial Balance of: " + sAccountObj.getBalance());
        sAccountObj.deposit(200); 
        sAccountObj.withdraw(300);// invokes base class methods
        System.out.println("" + sAccountObj.getName()
        + " at the end of transaction has a Balance of: "
        + sAccountObj.getBalance());

	}

}
