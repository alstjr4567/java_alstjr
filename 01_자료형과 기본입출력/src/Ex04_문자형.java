
public class Ex04_������ {
	public static void main(String[] args) {
		
		char ch;
		ch='A'; // 1���ڸ� �������ִ� �ƹ��͵� �ȵ��� �ȵ�
		System.out.println("ch:" +ch);
		System.out.println(ch+1); 
		// A+1=66
		// 2byte(4byte)+4byte
		// 65+1=66
		// �ƽ�Ű�ڵ尪
		// A:65
		// B:66
		// C:67
		// a:97
		// b:98
		
		System.out.println((char)(ch+1));
		
		//���� �ڷ���
		boolean b1;
		b1= true; // true ��
		System.out.println("b1:" +b1);
		
		b1=5>3;
		System.out.println("b1:" +b1);
		String s="apple";
		System.out.println("s:"+s);
		
				
	}

}

/*
������ �ڷ���
char : 2byte 0 ~ 65,535

�ƽ�Ű�ڵ尪
A:65
B:66
C:67

a:97
b:98

���� �ڷ���
b
*/