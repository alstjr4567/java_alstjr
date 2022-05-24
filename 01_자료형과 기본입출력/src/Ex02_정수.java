
public class Ex02_정수 {
	public static void main(String[] args) {
		System.out.println(1+2);
		
		int a; //int는 정수 a변수(상자)는 정수 담는 용도사용한다 선언
		int b; //선언
		a=1; //초기화
		b=2; //a상자에 1넣는걸 b상자에 2넣는걸 초기화 한다 라고함, 선언을 먼저하고 초기화 해야한다
		// 선언+초기화 노란색은 경고 에러는 아님
		
		System.out.println(a+b);
		System.out.println("a+b");
		System.out.println("a"+"b");
		
		byte b1=10; //선언 
		byte b2=20;
		int b3; //byte b3은 아래 연산에서 에러발생
		b3 = b1+b2;
		System.out.println("b3="+b3);
		
		long x = 1000000;
		long y = 2000000;
		long z = (long)x*y; //2조 8byte*4byte
		System.out.println("z="+z);
		
		}
}
/*

화일이름 변경법
화일이름 우클릭 -Refactor-Rename에서 이름 변경
화일이름 클릭 F2키-이름 변경
Ctrl+Alt+↓ = 복붙동시에
Ctrl+d = 한줄삭제
Ctrl+z = 되돌리기

정수형 자료형(type)
byte : 1byte -127~128
short : 2byte
int : 4byte -21억~21억
long: 8byte
int보다 작은 데이터를 연산하면 결과는 int가 된다.
*/