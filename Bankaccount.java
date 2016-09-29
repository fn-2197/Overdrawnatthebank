package overdrawnatthebank;

public class Bankaccount {
public  double balance;
public  String name;
	public Bankaccount(double a, String b){
	balance = a;
	name = b;
}
	public void deposit(double a) {
		
balance += a;
	}
	public void withdraw(double a){
		balance -= a;
	}
}
