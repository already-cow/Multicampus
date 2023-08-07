package chapter07.sec01;

public class Account {
	private String name;
	private String accountName;
	private int balance;

	public Account() { // 멤버변수를 0으로 초기화

	}

	public Account(String n, String an, int b) { // 오버로딩
		name = n; // 매개변수로 전달된 값으로 초기화
		accountName = an;
		balance = b;
	}

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
