import java.util.Scanner;

public class Ex05_입력문 {
	public static void main(String[] args) {
		
		//int kor = 70;
		//int eng = 80;
		//int math = 90;
		
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,math;
		
		System.out.println("이름입력=>");
		String name = sc.next(); //문자열을 읽겠다
		
		System.out.print("국어점수=>");
		kor = sc.nextInt(); //정수를 읽겟다
		
		System.out.print("영어점수=>");
		eng = sc.nextInt();
		
		System.out.print("수학점수=>");
		math = sc.nextInt();
		
		System.out.println("--------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("--------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("--------------------------");
		
		int total = kor +eng + math;
		System.out.println("총합:"+ total);
		
		double avg=(double)total/3; //163/3.0=54.3333
		System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f",avg); // 소수점아래 두자리 출력
		
		
		//스캐너장치를 통해(장치이름은 내마음 현재는 "sc") console창에 입력해야 결과가나옴
		
	}

}
