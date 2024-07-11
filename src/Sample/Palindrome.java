package Sample;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s3=sc.next();
int len=s3.length()-1;
String rev="";
for(int i=len;i>=0;i--)
{
	rev=rev+s3.charAt(i);
}
if(s3.equalsIgnoreCase(rev))
{
System.out.println("Palindrome");
}
else
{
	System.out.println("Not palindrome");
}
	}

}
