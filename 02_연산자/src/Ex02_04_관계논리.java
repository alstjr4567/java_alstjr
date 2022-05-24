
public class Ex02_04_관계논리 {
	public static void main(String[] args) {
		int a=10, b=20;
		
		boolean c = a >= b; //=은 뒤에다 써야함
		System.out.println("a>b:"+c);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//and 연산자 양쪽모두 참이거나 거짓이여야 한다
		boolean result = a>10 && b>10; //f&&t
		System.out.println("result:"+result);
		
		result=a>10|| b>10; // f||t
		System.out.println("result:"+ result);
		
		//t&&t:t
		//f||f:f
		
		result = !(a>3);//10>3 !(true)
		System.out.println("result:"+result);
	}

}
