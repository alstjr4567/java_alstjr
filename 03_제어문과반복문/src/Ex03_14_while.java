import java.util.Scanner;

public class Ex03_14_while {

	public static void main(String[] args) {
		
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("수 입력:");
		num = sc.nextInt();
		
		if(num < 0)
			break; //반복횟수를 알수없을때는 break
		
		sum += num;
		
		}
		
		System.out.println("sum:" + sum);
		
	}//main

}
