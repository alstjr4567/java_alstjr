import java.util.Scanner;

public class Ex02_01_��� {
	public static void main(String[] args) {
		
		int num1, num2;
		num1=10;
		num2=20;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����1�Է�:");
		num1=sc.nextInt();
		
		System.out.println("����2�Է�:");
		num2=sc.nextInt();
		
//		10+20=30
//		10-20=30
//		10/20=30
//		10*20=30
		System.out.println(num1+"+"+num2+"="+(num1+num2)); //���ڿ��ڿ� +�� �����̴�(������ ����x ������ ����)
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));
		System.out.printf("%d/%d=%.2f",num1,num2,(double)num1/num2);
		// 17/3=5.67
		System.out.println(num1 +"%"+ num2 +"=" +(num1%num2));
		
	}

}
