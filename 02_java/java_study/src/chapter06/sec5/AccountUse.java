package chapter06.sec5;

public class AccountUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account dad = new Account();
		dad.name = "홍길동";
		dad.accountName = "튼튼적금";
		dad.balance = 1000;

		dad.deposit();
		dad.widthdraw();
	}

}
