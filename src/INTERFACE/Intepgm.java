package INTERFACE;
interface car
{
	public void acceleration();
	public void speedlimit();
}
class Maruthi implements car
{
	@Override
	public void acceleration() {
		System.out.println("Maruthi acceleration");
	}
	@Override
	public void speedlimit() {
		System.out.println("Maruthi spelimit");
	}	
}
class  Suzki implements car
{
	@Override
	public void acceleration() {
		System.out.println("Suzki acceleration");
	}
	@Override
	public void speedlimit() {
		System.out.println("Suzki spedlimit");
	}	
}
public class Intepgm {
public static void main(String[] args) {
	Maruthi  m=new Maruthi();
	Suzki s=new Suzki();
	m.acceleration();
	m.speedlimit();
	s.acceleration();
	s.speedlimit();
		}
}
