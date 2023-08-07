package chapter06.sec05;

public class Account {
	String name;
	String accountName;
	int balance;

	public void deposit(int amount) { // amount : 입금액
		balance += amount;
		System.out.printf("%s이 %d원을 입금하다.\n", name, balance);
	}

	public void widthdraw(int amount) { // amount : 출금액
		balance -= amount;
		System.out.printf("%s이 %d원을 출금하다.\n", name, balance);
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	
	

}
