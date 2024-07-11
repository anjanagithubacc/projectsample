package SAMPLE2;
class Vehicle
{
	public void drive()
	{
		System.out.println("Drive a vehicle");
	}
}
class Car extends Vehicle
{
	@Override
	public void drive()
	{
		System.out.println("Reparing a car");
	}
}
public class Pgm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();
c.drive();
Vehicle v=new Vehicle();
v.drive();
	}

}
