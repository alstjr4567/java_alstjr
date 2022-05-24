
public class Ex05_18_객체배열 {

	public static void main(String[] args) {
		
		//Book객체 종류별로 3개를 배열로 생성
		
		Book b1 = new Book();
		
		Book b2 = new Book("HTML","아이유",3000);
		
		Book b3 = new Book("DB",5000);
		
		Book[]bk=new Book[3];//주소가 담길 방3개짜리 배열을 만든것
		bk[0]=new Book();
		bk[1]=new Book("HTML","아이유",3000);
		bk[2]=new Book("DB",5000);
		
//		Book[] bk = {new Book(), 위에 처럼 쓰던가 이렇게 쓰던가 같다.
//				new Book("HTML","아이유",3000),
//				new Book("DB",5000)};
		
		for(int i=0;i<bk.length;i++) {
			bk[i].show();
			System.out.println();
		}
		
	}

}
