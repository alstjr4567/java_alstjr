
public class Ex02_04_����� {
	public static void main(String[] args) {
		int a=10, b=20;
		
		boolean c = a >= b; //=�� �ڿ��� �����
		System.out.println("a>b:"+c);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//and ������ ���ʸ�� ���̰ų� �����̿��� �Ѵ�
		boolean result = a>10 && b>10; //f&&t
		System.out.println("result:"+result);
		
		result=a>10|| b>10; // f||t
		System.out.println("result:"+ result);
		
		//t&&t:t
		//f||f:f
		
		result = !(a>3);//10>3 !(true)
		System.out.println("result:"+result);
	}

}
