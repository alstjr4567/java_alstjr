class Product{//클래스는 같은 프로젝트안에 같은이름 있으면 안된다.
	//String company="농심";//넣고싶은걸 여기에 넣으면 다바꿀수잇다,그게아니라면 밑에(p1,p2)에 다 써야함
	static String company;
	private String name;
	private int price;
	Product(){//Product생성자 정의
		
	}
	void setName(String name){
		this.name = name;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	String getName(){//멤버변수에만
		return this.name;
	}
	
	int getPrice(){
		return price;
	}
}
public class Ex05_02_클래스 {
	public static void main(String[] args) {
		

Product p1 = new Product();
		
		Product p2 = new Product();
		
		Product.company="농심";
		p1.company="농심";
		//p1.name="새우깡";
		//p1.price=1000;
		p1.setName("새우깡");
		p1.setPrice(1000);
		
		p2.company="농심";
		//p2.name="브라보콘";
		//p2.price=2000;
		p2.setName("브라보콘");
		p2.setPrice(2000);
		
		System.out.println(p1.company);
		//System.out.println(p1.name);
		//System.out.println(p1.price);
		
		System.out.println(p1.getName());
		int p1_price = p1.getPrice();
		System.out.println(p1_price);
		
		
		
		System.out.println(p2.company);
		//System.out.println(p2.name);
		//System.out.println(p2.price);
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		System.out.println(Product.company);
		
	}
}

//클래스는 설계도다 설계도로 집을 만들순없다
//객체를 만든다는것은 실체를 만든다는것 고로 클래스만이 아니라 객체도 만들어야함
//
