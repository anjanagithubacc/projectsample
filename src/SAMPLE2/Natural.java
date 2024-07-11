package SAMPLE2;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit");
int l=sc.nextInt();
int s=0;
for(int i=0;i<=l;i++)
{
	s=s+i;
}
System.out.println("Sum="+s);
	}

}
