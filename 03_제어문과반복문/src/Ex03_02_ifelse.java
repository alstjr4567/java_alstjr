import java.util.Scanner;

public class Ex03_02_ifelse {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력:");
		n = sc.nextInt();
		//if(n==1 || n==2 || n==10 ) {
			if(n>=1 && n<=10) {//1<n && n<=10 : 1<=n && n<=10
			System.out.println("입력한 숫자는 1~10사이의 숫자입니다.");
		}
		
		else if(n>=11 && n<=20) {
		System.out.println("입력한 숫자는 11~20사이의 숫자입니다.");
		}
		
		else {//else옆에 안써도됨
			System.out.println("입력한 숫자는 1보다 작거나 20보다 큰 숫자");
		}
		System.out.println("if~else공부중");
		
		if(n%5==0) {// 0 5 10 15
			System.out.println("5의 배수");
			
		if(n%10==0) {// 0 10 20
			System.out.println("10의 배수");
		}
		}
	}
}
