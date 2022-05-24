
public class Ex05_12_overloading {

	public static void main(String[] args) {
int i = plus(3,5,10); // �޼��� ȣ��
		
		float j = plus(0.1f, 0.2F);
		
		double k = plus(1.1,2.2);
		
		System.out.println("int��:"+i);
		System.out.println("float��:"+j);
		System.out.println("double��:"+k);
		
		System.out.println();//�ý����� Ŭ��������?! out�� ��������.
		System.out.println(1);
		System.out.println(1.3);
		
	}
	
	static int plus(int a,int b,int c) {
		return a+b+c;
	}
	
	static float plus(float a,float b) {
		return a+b;
	}
	
	static double plus(double a,double b) {
		return a+b;
		

		// �����ε�(overloading): �ϳ��� �޼��� �̸����� �������� �޼��带 ���� �� �ְ� ���ִ� ���
		//    ����: -�޼��� �̸��� ���ƾ� �Ѵ�.
		//         -�Ű������� ������ �ڷ��� (Ÿ��)�� �޶����
		//����Ÿ���� �����ε��� ���ǿ� ���Ե��� �ʴ´�.
		//�� float,double,int�� ������ �ʴ´� ()�ȿ� Ÿ�Ը� ��
		//plus�� 3���ε��� �����ȶߴ� ������ ()���� Ÿ���� �ٸ��⶧����
		//�޼ҵ尡 ������ �������� ������ �ٸ��� �ϴ��� Ÿ���� �ٸ��� �ؾ���.
		
}
}