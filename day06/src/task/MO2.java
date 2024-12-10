package task;

import java.util.Scanner;

public class MO2 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
								      
					      int money =0, choice = 0, num = 0;
					      int cola = 1500, si = 1500, power = 2000;
					      
					      System.out.print("돈을 넣어주세요 : ");
					      money = sc.nextInt();
					      
					      String menu = ("음료의 번호를 선택하세요 \n" 
					    		  		+ "1. 콜라 : 1500\n" 
					    		  		+ "2. 사이다 : 1500\n" 
					    		  		+ "3. 파워에이드 : 2000\n" 
					    		  		+ "4. 잔액반환\n" 
					    		  		+ "선택 : ");
					      
					      System.out.println(menu);
					      choice = sc.nextInt();
					      
					      while(!(choice == 4)) {      
					         switch(choice) {
					         case 1:
					            System.out.println("콜라 몇 개?");
					            num = sc.nextInt();
					            System.out.println(num + "개 선택함. 가격은 " + (num * cola) + "원");
					            System.out.println();
					            if(money < num*cola) {
					               System.out.println("!!잔액 부족!!");
					               System.out.println();
					              // System.out.println(menu);
					               choice = sc.nextInt();
					               break;
					            }
					            money = money - (num * cola);
					            System.out.println("*****당신의 잔액 : " + money + "*****");
					            System.out.println();
					            System.out.println(menu);
					            choice = sc.nextInt();
					            break;
					         case 2:
					            System.out.println("사이다 몇 개?");
					            num = sc.nextInt();
					            System.out.println(num + "개 선택함. 가격은 " + (num * si) + "원");
					            System.out.println();
					            if(money < num*si) {
					               System.out.println("!!잔액 부족!!");
					               System.out.println();
					               System.out.println(menu);
					               choice = sc.nextInt();
					               break;
					            }
					            money = money - (num * si);
					            System.out.println("*****당신의 잔액 : " + money + "*****");
					            System.out.println();
					            System.out.println(menu);
					            choice = sc.nextInt();
					            break;
					         case 3:
					            System.out.println("파워에이드 몇 개?");
					            num = sc.nextInt();
					            System.out.println(num + "개 선택함. 가격은 " + (num * power) + "원");
					            System.out.println();
					            if(money < num*power) {
					               System.out.println("!!잔액 부족!!");
					               System.out.println();
					               System.out.println(menu);
					               choice = sc.nextInt();
					               break;
					            }
					            money = money - (num * power);
					            System.out.println("*****당신의 잔액 : " + money + "*****");
					            System.out.println();
					            System.out.println(menu);
					            choice = sc.nextInt();
					            break;
					         }
					         
					      }
					      System.out.println("잔돈 반환 완료..");
					      System.out.println("프로그램 종료");
					      
					   }
					
}
			
