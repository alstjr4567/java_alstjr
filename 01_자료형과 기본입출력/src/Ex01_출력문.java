
public class Ex01_출력문 {
	public static void main(String[] args) {
		
		System.out.println("가나다라"); // print옆에 ln는 엔터효과
		System.out.print("a"); // 이명령어는 console창에 출력하는 명령어다
		System.out.println("b"); // 한글자는 '',"" 상관없음 두글자이상은""로 해야함
		System.out.println("안녕\t하세요\n\n저의이름'김민석'입니다.");
		System.out.println("1+2");
		System.out.println("1+2");
		System.out.println(10);// 연산은 ""들어가야함 그냥숫자는 ""필요없음
		System.out.println("즐거운"+"자바"+"수업");// +는 연결
		System.out.println("1"+"2");
		
		int a=123;
		char b='A';
		double c=98.765;
		String d="아이유";
		//정수 : %d
		//실수 : %f
		//문자 : %c
		//문자열 : %s
		
		System.out.println("a:"+123);
		System.out.println("b:"+a);
		System.out.println("c:"+98.765);
		System.out.println("d:"+d);
		
		System.out.println("a:"+a);
		System.out.printf("a:%d\n",a);
		
		
		System.out.println("b:"+b);
		System.out.printf("b:%c\n",b);
		
		System.out.println("c:"+c);
		System.out.printf("c:%f\n",c);
		System.out.printf("c:%.1f\n",c);
		System.out.printf("c:%7.1f\n",c); //전체자리 .소수아래자리
		//				("7"은전체자리 칸수 7칸 ".1"은 .뒤에 1이 칸수 1칸이란 소리 소수아래자리가 1칸)
		
		System.out.println("d:"+d);
		System.out.printf("저의 이름은:%5s",d); // 5는 총칸수 빈칸까지 합해서
	}
}
/*

; :(세미콜론)
, :(콜론)
\t: tab탭
\n: 엔터abstract
"": 문자열
'': 문자, 문자상수

cmd 창에서 실행법
cd C:\Java-kms\01_자료형과 기본입출력\src
javac Ex01_출력문.java
java Ex01_출력문

*/