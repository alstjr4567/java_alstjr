import java.util.Scanner;

public class Ex03_01_ifelse {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1입력:");//print옆에ln 있으면 아래로 없으면 옆으로
		a = sc.nextInt();
		System.out.print("숫자2입력:");
		b = sc.nextInt();

		if(a>b) {
			System.out.println("a가 b보다 크다.");
			System.out.println("하하하");
			//참일때 한줄이면 중괄호 생략가능
		}
		if(a<b) {
			System.out.println("b가 a보다 크다.");
			System.out.println("호호호");
		}
		//else if(a==b)
		else {
			System.out.println("a와 b가 같다.");
			System.out.println("헤헤헤");
		}
		
		System.out.println("if 공부중");
		
	}

}
/*


조건식이 참이면 {} 안의 문장이 실행된다.
조건식이 참이 아니면 {} 아의 문장이 실행안된다.
if(조건식) {
	실행할문장1;
	실행할문장2;
}
else if(조건식){
실행할문장1;
실행할문장2;
}
else(조건식){
실행할문장1;
실행할문장2;
}


*/