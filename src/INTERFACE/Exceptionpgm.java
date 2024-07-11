package INTERFACE;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		//filenotfoundexception
		FileInputStream f=new FileInputStream("E://book.exe");
		//nullpointerexception
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//Arithemetic exception
		try
		{
			int a=3,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
}
}
