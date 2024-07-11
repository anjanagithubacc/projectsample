package Stringpkg;

public class Stringoperation {

	public static void main(String[] args) {
String s1="hi";
String s5="ANJANA";
String s2="  welcome luminar";
String s3=new String("Hi");
String s4="Hello welcome to luminar";
		//concat
System.out.println(s1.concat(s2));
		//equals
System.out.println(s1.equals(s3));//bcz is represent to ways and stored memmory location is not same
System.out.println(s1.equalsIgnoreCase(s3));
		//touppercase
System.out.println(s1.toUpperCase());
		//tolowercase
System.out.println(s5.toLowerCase());
		//length
System.out.println(s1.length());//index start with 1
		//startwith
System.out.println(s4.startsWith("Hello"));
		//endwith
System.out.println(s2.endsWith("luminar"));
		//trim
System.out.println(s2.trim());
		//contain
System.out.println(s4.contains("welcome"));
		//split
String ar[]=s4.split(" ");
for(String a :ar)
{
	System.out.println(a);
}
		//substring
System.out.println(s5.substring(2,5));
		//charat
System.out.println(s1.charAt(1));
		//tochararray
	char[] c=s5.toCharArray();
	for(char h:c)
	{
		System.out.println(h);
	}
}

}
