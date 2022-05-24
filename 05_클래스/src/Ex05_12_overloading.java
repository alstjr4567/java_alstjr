
public class Ex05_12_overloading {

	public static void main(String[] args) {
int i = plus(3,5,10); // 메서드 호출
		
		float j = plus(0.1f, 0.2F);
		
		double k = plus(1.1,2.2);
		
		System.out.println("int합:"+i);
		System.out.println("float합:"+j);
		System.out.println("double합:"+k);
		
		System.out.println();//시스템이 클래스엿다?! out이 변수엿다.
		System.out.println(1);
		System.out.println(1.3);
		
	}
	
	static int plus(int a,int b,int c) {
		return a+b+c;
	}
	
	static float plus(float a,float b) {
		return a+b;
	}
	
	static double plus(double a,double b) {
		return a+b;
		

		// 오버로딩(overloading): 하나의 메서드 이름으로 여러개의 메서드를 만들 수 있게 해주는 기법
		//    조건: -메서드 이름이 같아야 한다.
		//         -매개변수의 개수와 자료형 (타입)이 달라야함
		//리턴타임은 오버로딩의 조건에 포함되지 않는다.
		//위 float,double,int는 보지도 않는다 ()안에 타입만 봄
		//plus가 3개인데도 에러안뜨는 이유는 ()안의 타입이 다르기때문에
		//메소드가 여러개 있을때는 개수를 다르게 하던가 타입을 다르게 해야함.
		
}
}