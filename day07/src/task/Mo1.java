//package task;
//
//public class Mo1 {
////  1번 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
//  System.out.println("1번 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈");
//  for (int i = 0; i < 10; i++) {//10번마다 줄바꿈
//     for (int j = 0; j < 10; j++) {//10번마다 탭으로 나눠서 출력하고 i X 10 + j X 1 해서 변수 없이 출력
//        System.out.print(i * 10 + j + 1 + "\t");
//     }
//     System.out.println();
//  }
//  System.out.println();
//
////  2번 A~F출력
//  System.out.println("2번 A~F출력");
//  int a = 'A';
//  for (int i = 0; i < 6; i++) {//A에서 F만큼 반복
//     System.out.print((char) (a + i) + " ");//자동 + 강제 사용해서 출력됨
//  }
//  System.out.println();
//  System.out.println();
//
////  3번 aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
//  // a-32 == A
//  // f
//  System.out.println("3번 aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력");
//  for (int i = 'a'; i <= 'z'; i++) {//반복문을 문자형으로 반복 a~z범위
//     if (i % 2 == 1)
//        System.out.print((char) (i));
//     else
//        System.out.print((char) (i - 32));//대분자는 -32해서 표현
//  }
//  System.out.println();
//  System.out.println();
//
////   4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
//  System.out.println("4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력");
//  int check = 0;//증가하다 5가 되면 줄바꿔주기
//  for (int i = 1; i <= 100; i++) {
//     if (i % 3 == 0 || i % 5 == 0) {//3의 배수와 5의 배수 or연산
//        System.out.print(i + "\t");
//        check++;
//     }
//     if (check == 5) {//줄바꿈
//        System.out.println();
//        check = 0;//초기화
//     }
//  }
//  System.out.println();
//  System.out.println();
//
////   4.2) 5의 배수 또는 5의 배수 숫자들의 합을 구하기
//  System.out.println("4.2) 5의 배수 또는 5의 배수 숫자들의 합을 구하기");
//  int sum = 0;//합산 저장
//  for (int i = 1; i <= 100; i++) {
//     if (i % 5 == 0) {//5의 배수들
//        System.out.print(i + " ");//5의 배수 출력
//        sum += i;//합산
//     }
//  }
//  System.out.println();
//  System.out.println("5의 배수 숫자들의 합 : " + sum);//합산 출력
//}
