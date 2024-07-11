package Javahalf;
import java.util.Scanner;
public class Sumarray {
public static void main(String[] args) {
int[] n=new int[5];
int s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
for(int i=0;i<5;i++)
{
	n[i]=sc.nextInt();
	s=s+n[i];
}
System.out.println("Sum is"+s);
}
}
