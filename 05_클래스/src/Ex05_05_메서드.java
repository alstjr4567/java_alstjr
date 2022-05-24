import java.util.Scanner;

//
class Syudent{
	int kor;
	int eng; // 멤버변수
	int math;
	//정수 3개담을수있는 자료형만들었다. class로 만든다.

	//합계를 리턴하는 sum 메서드
	//	int sum(int k,int e,int m){
	//		return k + eng + m;
	//	}

	int sum(){ // 매개변수
		return kor + eng + math;
	}

	int avg() {//avg정의
		//return(kor+eng+m)/3;
		return sum() / 3;
	}
}

public class Ex05_05_메서드 {

	public static void main(String[] args) {

		int kor,eng,m;

		//Student s = new Student(); 공간을 만드는작업 객체를 만든다
		Student s = null ;//주소가들어가야하는데 아직어떤주소가 들어갈지 모르겟다.. 그럼 null을 넣는다
		s = new Student();


		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수:");
		s.kor = sc.nextInt(); // 70

		System.out.print("영어점수:");
		s.eng = sc.nextInt(); // 80

		System.out.print("수학점수:");
		s.math = sc.nextInt(); //90

		//int hap = s.sum(kor, eng, m);
		int hap = s.sum();
		System.out.println("hap:" + hap);

		int avg = s.avg(); 
		System.out.println("avg:" + avg);
	}

}
