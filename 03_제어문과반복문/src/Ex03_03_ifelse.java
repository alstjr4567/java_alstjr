import java.util.Scanner;

public class Ex03_03_ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor,eng,math;
		
		System.out.print("�̸��Է�=>");
		String name = sc.next(); //���ڿ��� �аڴ�
		
		System.out.print("��������=>");
		kor = sc.nextInt(); //������ �аٴ�
		
		System.out.print("��������=>");
		eng = sc.nextInt();
		
		System.out.print("��������=>");
		math = sc.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("�̸�\t����\t����\t����");
		System.out.println("---------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("---------------------------");
		
		int total = kor +eng + math;
		System.out.println("����:"+ total);
		
		double avg=(double)total/3; //163/3.0=54.3333
		System.out.println("���:"+avg);
		System.out.printf("���:%.2f\n",avg); 
		
		if(avg>=80 && avg<90) {
			System.out.println("A����");
		}
		//avg>=80 && avg<90
		else if(avg>=80) {
			System.out.println("B����");
		}
		else if(avg>=70) {
			System.out.println("C����");
		}
		else if(avg<60 && avg<80) {
			System.out.println("D����");
		}
		else if(avg<60) {
			System.out.println("F����");
		}
		
		
	}

}
