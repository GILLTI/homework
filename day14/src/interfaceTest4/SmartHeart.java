package interfaceTest4;

public class SmartHeart implements Heater{

	@Override
	public void on() {
		System.out.println("음성으로키기");
		
	}

	@Override
	public void off() {
		System.out.println("음성으로 끄기");
		
	}

	@Override
	public void turbo() {
	System.out.println("음성으로 터보");	
		
	}
 
}
