
public class Ex04_문자형 {
	public static void main(String[] args) {
		
		char ch;
		ch='A'; // 1글자만 넣을수있다 아무것도 안들어가도 안됨
		System.out.println("ch:" +ch);
		System.out.println(ch+1); 
		// A+1=66
		// 2byte(4byte)+4byte
		// 65+1=66
		// 아스키코드값
		// A:65
		// B:66
		// C:67
		// a:97
		// b:98
		
		System.out.println((char)(ch+1));
		
		//논리형 자료형
		boolean b1;
		b1= true; // true 참
		System.out.println("b1:" +b1);
		
		b1=5>3;
		System.out.println("b1:" +b1);
		String s="apple";
		System.out.println("s:"+s);
		
				
	}

}

/*
문자형 자료형
char : 2byte 0 ~ 65,535

아스키코드값
A:65
B:66
C:67

a:97
b:98

논리형 자료형
b
*/