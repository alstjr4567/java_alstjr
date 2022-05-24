class Calculator{
	int x;
	int y;
	
	//두 정수의 덧셈을 리턴하는 add 메서드 정의
	int add(int a,int b){
		return a+b;
	}//
	
	static int multiply(int a,int b) {
		int c = a * b;
		System.out.println("c:" + c);
		return c;
	}//
}

public class Ex05_04_메서드 {
	public static void main(String[] args) {

		//main 자바가상머신이라는게 설치가된다 가상머신에 의해 main메서드가 자동호출된다
		//소문자로써야함 main
		Calculator c1 = new Calculator();
		c1.x=100;
		c1.y=200;
		
		int result = c1.add(10,20);
		//int result=Calculator.add(10,20); 에러
		
		System.out.println("result:" + result);
		
		//5,6곱셈출력
		//int result2 = c1.multiply(5,6);
		int result2 = Calculator.multiply(5, 6);
		System.out.println("result2:"+result2);
		
		int result3=sub(100,11,22);
		System.out.println("result3:" + result3);
		
Ex05_04_메서드 e = new Ex05_04_메서드();
		
		int result4 = e.sub2(100,11,22);
		System.out.println("result4:" + result4);
		
	}//main끝
	
	static int sub(int x,int y, int z) {
		int result = x - y -z; // 67
		return result; // return 67
	}//sub끝
	
		int sub2(int x,int y,int z) {
			int result = x-y-z;//67
			return result; // return 67
		}//sub끝

}

//static 메서드에서는 static 메서드만 호출할 수 있다.
//staitc 메서드가 포함된 클래스의 객체를 만들어 메서드에 접근하면
//syatic 붙지 않은 메서드도 호출할 수 있다.
 
