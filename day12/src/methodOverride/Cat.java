package methodOverride;

public class Cat extends Animal{
	   
	//생성자
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//메소드 오버라이딩  alt + shift + s + v
	   @Override
	   void sound() {
	      System.out.println(this.name+"가 야옹하고 웁니다");
	   }
	   
	}