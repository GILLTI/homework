package interfaceTest4;

public class BasicHeater2 implements Heater{

	@Override
	public void on() {
		System.out.println("on");
		
	}

	@Override
	public void off() {
		System.out.println("off");
		
	}

	@Override
	public void turbo() {
	System.out.println("tttttttt");	
		
	}
 
}
