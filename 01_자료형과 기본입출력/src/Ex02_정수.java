
public class Ex02_���� {
	public static void main(String[] args) {
		System.out.println(1+2);
		
		int a; //int�� ���� a����(����)�� ���� ��� �뵵����Ѵ� ����
		int b; //����
		a=1; //�ʱ�ȭ
		b=2; //a���ڿ� 1�ִ°� b���ڿ� 2�ִ°� �ʱ�ȭ �Ѵ� �����, ������ �����ϰ� �ʱ�ȭ �ؾ��Ѵ�
		// ����+�ʱ�ȭ ������� ��� ������ �ƴ�
		
		System.out.println(a+b);
		System.out.println("a+b");
		System.out.println("a"+"b");
		
		byte b1=10; //���� 
		byte b2=20;
		int b3; //byte b3�� �Ʒ� ���꿡�� �����߻�
		b3 = b1+b2;
		System.out.println("b3="+b3);
		
		long x = 1000000;
		long y = 2000000;
		long z = (long)x*y; //2�� 8byte*4byte
		System.out.println("z="+z);
		
		}
}
/*

ȭ���̸� �����
ȭ���̸� ��Ŭ�� -Refactor-Rename���� �̸� ����
ȭ���̸� Ŭ�� F2Ű-�̸� ����
Ctrl+Alt+�� = ���ٵ��ÿ�
Ctrl+d = ���ٻ���
Ctrl+z = �ǵ�����

������ �ڷ���(type)
byte : 1byte -127~128
short : 2byte
int : 4byte -21��~21��
long: 8byte
int���� ���� �����͸� �����ϸ� ����� int�� �ȴ�.
*/