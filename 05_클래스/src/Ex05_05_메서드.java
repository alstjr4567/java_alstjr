import java.util.Scanner;

//
class Syudent{
	int kor;
	int eng; // �������
	int math;
	//���� 3���������ִ� �ڷ����������. class�� �����.

	//�հ踦 �����ϴ� sum �޼���
	//	int sum(int k,int e,int m){
	//		return k + eng + m;
	//	}

	int sum(){ // �Ű�����
		return kor + eng + math;
	}

	int avg() {//avg����
		//return(kor+eng+m)/3;
		return sum() / 3;
	}
}

public class Ex05_05_�޼��� {

	public static void main(String[] args) {

		int kor,eng,m;

		//Student s = new Student(); ������ ������۾� ��ü�� �����
		Student s = null ;//�ּҰ������ϴµ� ������ּҰ� ���� �𸣰ٴ�.. �׷� null�� �ִ´�
		s = new Student();


		Scanner sc = new Scanner(System.in);

		System.out.print("��������:");
		s.kor = sc.nextInt(); // 70

		System.out.print("��������:");
		s.eng = sc.nextInt(); // 80

		System.out.print("��������:");
		s.math = sc.nextInt(); //90

		//int hap = s.sum(kor, eng, m);
		int hap = s.sum();
		System.out.println("hap:" + hap);

		int avg = s.avg(); 
		System.out.println("avg:" + avg);
	}

}
