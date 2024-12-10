package interfaceTest4;

public class BasicHeater implements Heater{

	@Override
	public void on() {
		System.out.println("버튼으로 켜기");
		
	}

	@Override
	public void off() {
		System.out.println("버튼으로 끄기");
		
	}

	@Override
	public void turbo() {
	
		
	}

}
