
public class Ex05_03_�޼��� {

	public static void main(String[] args) {// main �޼�������
		
		//int a=10;
		show();// show �޼��� ȣ��
		System.out.println("������");
		show();
		System.out.println("�󸶹�");
		show(); //�빮��x ��ҹ��� �Ȱ��� �ؾ���.
		//���Ǵ� �ѹ��� ȣ���� ������
		System.out.println("-------");

		add(3,4);  // ȣ��
		add(100,200);  // ȣ��
		System.out.println("********");

		int a = sub(100,11,22); // �޼��� ȣ��
		//int a = 67;
		System.out.println("a:" + a);
		
		//5,20�� �Ѱܼ� ���ϱ� ����� ���Ϲ޾� ����ϴ� �޼��� ����
		
		int mul = multiply(5,20);
		System.out.println("mul:" + mul);
		
	}// main �޼�������
	
	static int multiply(int a,int b) {
		int c = a * b;
		System.out.println("c:" + c);
		return c;
	}
	
	static void show(){//show �޼��� ���� ���ȣ �Ұ�ȣ �����
		System.out.println("show�޼��� ���Ǻκ�");
		System.out.println("��ſ� �ڹ� ����");
	}//show �޼��� ���� ��

	//int x = 3
	//int y = 4		
	//�Ű����� or parameter : x,y
	static void add(int x, int y) { // add �޼��� ���� 
		System.out.println("�� ���� ��:"+(x+y));
		return; // ȣ���� ������ ���ư���
	}

	static int sub(int x,int y, int z) {
		int result = x - y -z; // 67
		return result; // return 67
	}

}

//�޼���:
//	�۾��� �����ϵ��� ���������� �ۼ��� ���α׷�
//	�޼��� ���� �κ��� �ʿ��� �� ���� ȣ���ؼ� ����� �� �ִ�.
//	�޼��� ���� �κ� ó���� ������ ȣ���� ������ ���ư���.

//��ħ���
//����
//������� ����������
//��� �� ���
//������ ����
//������
//��Ź �۰�
//�п�
//����
//���
//TV
//������� ����������
//��� �� ���
//������ ����
//������
//��Ź �۰�
//�п�
//����
//���

/*
�������
instance ����
*/