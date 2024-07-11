package INTERFACE;

import java.util.Scanner;

interface  Bankk
{
	public void accountdetails();
	public void balance();
	public void withdraw();
	public void deposit();
}
class Sbi implements Bankk
{
	
 static Long bal=  (long) 20000;
Long withdraw,dep;
Scanner sc=new Scanner(System.in);
	@Override
	public void accountdetails() {
		System.out.println("Name:Anjana Sebastian");
		System.out.println("Bank name:SBI Bank");
		System.out.println("Account No:12086482");
		System.out.println("IFSC No:SBI56e890");
		
	
	}

	@Override
	public void balance() {
		System.out.println("Balance:"+bal);
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the withdrawal amount");
		withdraw=sc.nextLong();
		if(bal>=withdraw)
		{
			bal=bal-withdraw;
		}
		else if(bal<=withdraw)
		{
			System.out.println("Check the balance");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	
			}

	@Override
	public void deposit() {
	System.out.println("Enter your deposit amount");
	dep=sc.nextLong();
	bal=bal+dep;
	
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sbi b=new Sbi();
		char op;
		do
		{
			
		
		System.out.println("Enter your choice\n1...Account Details\n2...Deposit\n3...Withdraw\n");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				b.accountdetails();
				b.balance();
				break;
		case 2:
				b.deposit();
				b.balance();
				break;
		case 3:
				b.withdraw();
				b.balance();
				break;
				default:
					System.out.println("Invalid");
					break;
			
		}
		System.out.println("Do you want to continue yes / no");
		op=sc.next().charAt(0);
}while(op=='y');
	}

}
