
public class Ex03_04_switch_case {

	public static void main(String[] args) {
		
		int n=1;
		if(n==1) {
			System.out.println("1�Դϴ�.");
		}
		else if(n==2){
			System.out.println("2�Դϴ�.");
		}
		else if(n==3){
			System.out.println("3�Դϴ�.");
		}
		else {
			System.out.println("1~3�� �ƴմϴ�.");
		}
		
		System.out.println();
		
		switch(n+1) {
		case 1 : System.out.println("1�Դϴ�.");
				break;
		case 2 : System.out.println("2�Դϴ�."); 
				break;//���������� �극��ũ ���̻� ������ ����������������� �극��ũ
		case 3 : System.out.println("3�Դϴ�.");
				break;
		default: System.out.println("1~3�� �ƴմϴ�.");
				break;//�Ǹ������� break���� ��� �������
		}
		
		System.out.println("switch~case ������");
		
		String fruit="banana";
		switch(fruit) {
				case"apple":System.out.println("���");
							break;
				case"banana":System.out.println("�ٳ���");
							break;
				default:System.out.println("�� ���� ����");
		}
		
		//if(fruit=="apple")
		
		System.out.println();
		
		char ch='a';
		switch(ch) {
		case 'm' : 
		case 'M' : System.out.println("Morning"); break;
		case 'a' : 
		case 'A' : System.out.println("Afternoon"); break;
		case 'e' : 
		case 'E' : System.out.println("Evening"); break;
		default : System.out.println("�߸� �Է��ϼ���");
		}
				
		
	}

}

/*

switch(����or����������or���ڿ�)
	case ����1:����1;
			  break;
	case ����2:����2;
			  break;
	case ����n:����n;
			  break;
	default : ����3;
			  break;

*/