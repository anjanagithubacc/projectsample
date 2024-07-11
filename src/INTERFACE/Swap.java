package INTERFACE;

public class Swap {

	public static void main(String[] args) {
		String s1="anu",s2="nynu";
		System.out.println("Before swap");
		System.out.println("s1="+s1+  "s2="+s2);
		System.out.println("After swap");
		String t=s1;
		s1=s2;
		s2=t;
		System.out.println("s1=" +s1+ "s2="+s2);
		

	}

}
