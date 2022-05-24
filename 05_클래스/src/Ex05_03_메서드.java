
public class Ex05_03_메서드 {

	public static void main(String[] args) {// main 메서드정의
		
		//int a=10;
		show();// show 메서드 호출
		System.out.println("가나다");
		show();
		System.out.println("라마바");
		show(); //대문자x 대소문자 똑같이 해야함.
		//정의는 한번만 호출은 여러번
		System.out.println("-------");

		add(3,4);  // 호출
		add(100,200);  // 호출
		System.out.println("********");

		int a = sub(100,11,22); // 메서드 호출
		//int a = 67;
		System.out.println("a:" + a);
		
		//5,20을 넘겨서 곱하기 결과를 리턴받아 출력하는 메서드 정의
		
		int mul = multiply(5,20);
		System.out.println("mul:" + mul);
		
	}// main 메서드정의
	
	static int multiply(int a,int b) {
		int c = a * b;
		System.out.println("c:" + c);
		return c;
	}
	
	static void show(){//show 메서드 정의 대괄호 소괄호 써야함
		System.out.println("show메서드 정의부분");
		System.out.println("즐거운 자바 공부");
	}//show 메서드 정의 끝

	//int x = 3
	//int y = 4		
	//매개변수 or parameter : x,y
	static void add(int x, int y) { // add 메서드 정의 
		System.out.println("두 수의 합:"+(x+y));
		return; // 호출한 곳으로 돌아가라
	}

	static int sub(int x,int y, int z) {
		int result = x - y -z; // 67
		return result; // return 67
	}

}

//메서드:
//	작업을 수행하도록 독립적으로 작성된 프로그램
//	메서드 정의 부분이 필요할 때 마다 호출해서 사용할 수 있다.
//	메서드 정의 부분 처리가 끝나면 호출한 곳으로 돌아간다.

//아침기상
//세수
//냉장고에서 반찬꺼내기
//밥솥 밥 담기
//숟가락 놓기
//설겆이
//식탁 닦고
//학원
//공부
//취미
//TV
//냉장고에서 반찬꺼내기
//밥솥 밥 담기
//숟가락 놓기
//설겆이
//식탁 닦고
//학원
//공부
//취미

/*
멤버변수
instance 변수
*/