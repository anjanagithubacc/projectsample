package INTERFACE;
interface basicanimal
{
	public void  eat();
	public void sleep();
}
class Monkey implements basicanimal
{
public void jump()
{
	System.out.println("Monkey jump");
}
public void bite()
{
	System.out.println("Monkey bite");	
}
	@Override
	public void eat() {
		System.out.println("Monkey eat");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey sleep");
	}
	
}
class  Human implements basicanimal{
public void speak()
{
	System.out.println("human speak");
}
	@Override
	public void eat() {
		System.out.println("human eat");
	}

	@Override
	public void sleep() {
		System.out.println("human sleep");
	}
	
}
public class interfacepgm2 {

	public static void main(String[] args) {
		Monkey m=new Monkey();
		m.bite();
		m.eat();
		m.jump();
		m.sleep();
		Human h=new Human();
		h.eat();h.sleep();
		h.speak();
	}

}
