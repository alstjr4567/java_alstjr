class Var{
	static int a; // static 변수
	int b; //instance 변수
	void increment() {//지역~
		int c=0; //지역변수 지역변수는 자동으로 초기화되지않는다
		a++;
		b++;
		c++; 
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}//~지역
}//Var

//class는 동네 다른동네 있는 메서드를 호출할때는 객체를 만들어라

public class Ex05_07_변수 {

	public static void main(String[] args) {
		
		//호출
		Var v1 = new Var();// 객체
		v1.increment();
		v1.increment();
		System.out.println();
		
		Var v2 = new Var();
		v2.increment();
		v2.increment();
		System.out.println();
		
		Var v3 = new Var();// 객체
		v3.increment();
		v3.increment();
		System.out.println();
		
	}

}
