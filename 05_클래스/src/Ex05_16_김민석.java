
public class Ex05_16_김민석 {
	private String title;
	private String singer;
	private String genre;
	private int price;

	public static void main(String[] args) {

		Music m1 = new Music(); // 생성자 통한 초기화(INVU, 태연 , 발라드, 1000)
		Music m2 = new Music("that that","싸이","댄스",2000); //생성자 통한 초기화
		Music m3 = new Music();//setter 통한 초기화("어머나","장윤정","트로트",3000)
	
		//과제
		//m1 getter 통한 출력
		//m2, m3 display() 메서드에서 한번에 출력
		
	}

}
