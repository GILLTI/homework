package casting2;

//7번 : 캐스팅의 특징
public class Cat extends Animal {
 
 //생성자
 public Cat(String name) {
    super(name);
 }

 // 메소드 오버라이딩
 @Override
 void crying() {
    System.out.println("야옹");
 }

}
