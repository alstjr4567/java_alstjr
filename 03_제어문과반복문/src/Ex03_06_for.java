import java.util.Scanner;

public class Ex03_06_for {

	public static void main(String[] args) {

		int i;
		for(i=1;i<=10;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}


		System.out.println();

		//		3*1=3
		//		3*2=6
		//		  :
		//		3*9=27

		Scanner sc = new Scanner(System.in);
		System.out.println("단입력");
		int dan = sc.nextInt();
		if(dan%2 ==0) {
			for(i=1;i<=9;i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}
		}

		else {
			System.out.println("홀수단입니다.");
		}
	}

}
