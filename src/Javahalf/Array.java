package Javahalf;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] a=new int[4]; a[0]=10; a[1]=20; a[2]=3; a[3]=4; for(int i=0;i<4;i++) {
		 * System.out.println(a[i]); }
		 */
	//scanner class
	int[] a=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	for(int i=0;i<5;i++) {
		 a[i]=sc.nextInt();
	}
	System.out.println("The numbers are:");
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
	sc.close();
}
}
