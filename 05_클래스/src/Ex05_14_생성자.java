
class Member{
	private String id;
	private String passwd;
	
	Member(){//생성자 정의
		System.out.println("Member생성자");
		id = "park";
		passwd="5678";
	}
	
	Member(String i, String p){//생성자 오버로딩
		System.out.println("Member(String i,Stringp)");
		id=i;
		passwd = p;
	}
	
	void setId(String id){//정의
		this.id = id;
	}
	
	void setPasswd(String passwd){
		this.passwd = passwd;
	}
	
	String getId(){
		return id;
	}
	
	String getPasswd(){
		return passwd;
	}
}
public class Ex05_14_생성자 {//생성자 리턴타입이 없다(void쓰지않음 에러남 쓰면)
							//생성자의 이름은 클래스 이름과 똑같다 생성자는 메서드다

public static void main(String[] args) {
		
		Member m1 = new Member();
//		m1.id = "kim";
//		m1.passwd = "1234";
//		
//		System.out.println(m1.id);
//		System.out.println(m1.passwd);
		
//		m1.setId("kim");// 호출
//		m1.setPasswd("1234");
		
		System.out.println(m1.getId());
		System.out.println(m1.getPasswd());
		
		System.out.println("--------------------");
		
		Member m2 = new Member("choi","7777");//생성자 오버로딩을 할수잇다
		System.out.println(m2.getId());
		System.out.println(m2.getPasswd());
	}

}

// 생성자는 메서드다.
//클래스와 이름이 똑같은 메서드(대소문자도 똑같은)메서드
//리턴값이 없다. void도 쓰지않는다.
//생성자는 객체를 만들면 자동으로호출된다.
//생성자를 정의하지 않으면 기본생성자(default생성자)가 하나 자동으로 생성된다.

