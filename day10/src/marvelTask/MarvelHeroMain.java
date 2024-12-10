package marvelTask;

public class MarvelHeroMain {
	 public static void main(String[] args) {
	      
	      //아이언맨(ironMan)과 헐크(hulk) 객체를 만들고 정보출력
	      
		 MarvelHero pr = new MarvelHero("아이언맨" , "로봇", 20 );
		 System.out.println(pr);
		 pr.printInfo();
		 
	   }
	}

