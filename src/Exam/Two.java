package Exam;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		int a[]=new int[4];
		int o=0,e=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for( i=0;i<4;i++) {
			 a[i]=sc.nextInt();
		}
		for( i=0;i<4;i++) {
			 if(a[i]%2==0)
			 {
				 System.out.println("Even numbers:"+a[i]);
			 }
			 else
			 {
				 System.out.println("Odd numbers:"+a[i]);
			 }}
		
		

	}

}
