import java.util.Scanner;

public class Ex03_03_ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,math;
		
		System.out.print("이름입력=>");
		String name = sc.next(); //문자열을 읽겠다
		
		System.out.print("국어점수=>");
		kor = sc.nextInt(); //정수를 읽겟다
		
		System.out.print("영어점수=>");
		eng = sc.nextInt();
		
		System.out.print("수학점수=>");
		math = sc.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("---------------------------");
		
		int total = kor +eng + math;
		System.out.println("총합:"+ total);
		
		double avg=(double)total/3; //163/3.0=54.3333
		System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f\n",avg); 
		
		if(avg>=80 && avg<90) {
			System.out.println("A학점");
		}
		//avg>=80 && avg<90
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg<60 && avg<80) {
			System.out.println("D학점");
		}
		else if(avg<60) {
			System.out.println("F학점");
		}
		
		
	}

}
