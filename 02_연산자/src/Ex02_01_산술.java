import java.util.Scanner;

public class Ex02_01_산술 {
	public static void main(String[] args) {
		
		int num1, num2;
		num1=10;
		num2=20;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1입력:");
		num1=sc.nextInt();
		
		System.out.println("숫자2입력:");
		num2=sc.nextInt();
		
//		10+20=30
//		10-20=30
//		10/20=30
//		10*20=30
		System.out.println(num1+"+"+num2+"="+(num1+num2)); //문자열뒤에 +는 연결이다(연산의 덧셈x 연결의 덧셈)
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		System.out.printf("%d/%d=%.2f",num1,num2,(double)num1/num2);
		// 17/3=5.67
		System.out.println(num1 +"%"+ num2 +"=" +(num1%num2));
		
	}

}
