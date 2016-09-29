package overdrawnatthebank;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kbscanner = new Scanner(System.in);
System.out.println("Inital amount: ");
double bal = kbscanner.nextInt();
System.out.println("Name, without spaces: ");
String name = kbscanner.next();
Bankaccount myAccount = new Bankaccount(bal,name);		
		
		myAccount.deposit(505.22);
		System.out.println(myAccount.balance);
		myAccount.withdraw(100);
		System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
		
	}

}
