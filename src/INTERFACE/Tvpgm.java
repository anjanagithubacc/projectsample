package INTERFACE;
interface tvremote
{
	public void on();
	public void off();
public void volumeup();
public void volumedown();
public void chanelup();
public void chaneldown();
}
interface smarttv extends tvremote
{
	public void bluetooth();
	public void youtube();
}
class TV implements tvremote,smarttv
{

	@Override
	public void bluetooth() {
	System.out.println("Bluetooth");
	}

	@Override
	public void youtube() {
		System.out.println("youtube");
	}

	@Override
	public void on() {
		System.out.println("ON");
	}

	@Override
	public void off() {
		System.out.println("OFF");	
	}

	@Override
	public void volumeup() {
		System.out.println("Volumeup");
	}

	@Override
	public void volumedown() {
		System.out.println("Volumedown");
	}

	@Override
	public void chanelup() {
		System.out.println("Channelup");
	}

	@Override
	public void chaneldown() {
		System.out.println("Channeldown");
	}
	
}
public class Tvpgm {

	public static void main(String[] args) {
TV t=new TV();
t.bluetooth();
t.chaneldown();
t.chanelup();
t.youtube();
t.off();
t.on();
t.volumedown();
t.volumeup();
	}

}
