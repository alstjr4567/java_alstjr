
public class Ex02_05_삼항 {

	public static void main(String[] args) {
		//삼항연산자(조건연산자)
		//조건문 ? 참일때 : 거짓일때
		
		int a=10, b=20;
		int result = a>b ? a:b;
		System.out.println("result:"+result);
		
		String s;
		//짝수는 다 나머지가 0이다
		s = a%2==0? "짝수" : "홀수";
		System.out.println("s:"+s);	
		
		}

}
/*
이항연산자
3+4
-% = += -= && || >= !=

단항연산자
- ++ --
*/