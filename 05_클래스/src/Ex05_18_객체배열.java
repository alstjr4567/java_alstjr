
public class Ex05_18_��ü�迭 {

	public static void main(String[] args) {
		
		//Book��ü �������� 3���� �迭�� ����
		
		Book b1 = new Book();
		
		Book b2 = new Book("HTML","������",3000);
		
		Book b3 = new Book("DB",5000);
		
		Book[]bk=new Book[3];//�ּҰ� ��� ��3��¥�� �迭�� �����
		bk[0]=new Book();
		bk[1]=new Book("HTML","������",3000);
		bk[2]=new Book("DB",5000);
		
//		Book[] bk = {new Book(), ���� ó�� ������ �̷��� ������ ����.
//				new Book("HTML","������",3000),
//				new Book("DB",5000)};
		
		for(int i=0;i<bk.length;i++) {
			bk[i].show();
			System.out.println();
		}
		
	}

}
