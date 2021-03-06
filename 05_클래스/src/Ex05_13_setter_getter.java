class Book{//내가만들어쓰는 자료형 class
	private String title;
	private String author;
	private int price;
	// 여기 Book(){}가 숨어잇다. 객체를 생성햇기때문 내가 만들이지않아도 따로정의하지 않아도
	//기본생성자 디폴트생성자가 존재한다
	
	Book(){
		title = "JSP";
		author = "써니";
		price = 1000;
	}
	
	Book(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	Book(String title,int price){
		this.title = title;
		this.author = "윤아";
		this.price = price;
	}
	
	
	void setTitle(String t){//setter 셋터 메서드
		title = t;
	}
	
	void setAuthor(String a) {
		author = a;
	}
	
	void setPrice(int p) {
		price=p;
	}
	String getTitle(){// getter 겟터 메서드
		return title;
	}
	
	String getAuthor(){
		return author;
	}
	
	int getPrice(){
		return price;
	}
	
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}// 하나의 file에 class는 꼭잇어야함

public class Ex05_13_setter_getter {
	public static void main(String[] args) {
		
		Book bk1 = new Book();
		//bk1.title = "자바";
		//bk1.author = "홍길동";
		//bk1.price = 3000;
		
		bk1.setTitle("자바");
		bk1.setAuthor("홍길동");
		bk1.setPrice(3000);
		
		Book bk2 = new Book();
		//bk2.title = "데이터베이스";
		//bk2.author = "태연";
		//bk2.price = 5000;
		
		bk2.setTitle("데이터베이스");
		bk2.setAuthor("태연");
		bk2.setPrice(5000);
		
		//System.out.println(bk1.title);
		System.out.println(bk1.getTitle());
		System.out.println(bk1.getAuthor());
		System.out.println(bk1.getPrice());
		bk1.show();
		
		System.out.println("--------------");
		
//		System.out.println(bk2.title);
		System.out.println(bk2.getTitle());
		System.out.println(bk2.getAuthor());
		System.out.println(bk2.getPrice());
		bk2.show();
	}
}