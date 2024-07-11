package Javahalf;
import java.util.Scanner;
public class Stringarray {
public static void main(String[] args) {
String s[]=new String[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the names");
for(int i=0;i<4;i++)
{
	s[i]=sc.next();
}
System.out.println("The names are: ");
//for(int i=0;i<4;i++)
//	
//	{
//	System.out.println(s[i]);
//	}	
for(String v:s)
{
	System.out.println(v);
}
	}
}
