
public class Ex03_13_break_continue {

	public static void main(String[] args) {
		
		//1~10���
		int i;
		for(i=1;i<=10;i++) {
			if(i==5) {
				break; // �ݺ����� ����������.
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue; // ���������� ����.
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("---------------------");
		
		//while 1~10���
		
		i=1;
		while(i<=10) {
			if(i==5)
				break; // �ݺ����� ����������.
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		i=0;
		while(i<10) {
			i++;
			if(i==5)
				continue; // ���ǽ����� ����.
			System.out.print(i+" ");
		}
		
		
	}//main

}
