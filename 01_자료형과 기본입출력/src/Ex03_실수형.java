
public class Ex03_실수형 {
	public static void main(String[] args) {
		double d1 = 1.2;
		double d2;
		d2 = 3.4;
		
		double d3;
		d3 = d1+d2;
		System.out.println("d3=" + d3);
		
		double d4 = .123E3;//0.123 이렇게 써도됨 E=*10? 모르겟다 물어보기
		System.out.println("d4=" + d4);
		
		double d5 = .123E-3;
		System.out.println("d5=" + d5);
		// 0.000123 == 1.23E-4
		
		float f1;
		f1=0.0123f;
		System.out.println("f1=" +f1);
		
		float f2 = 3; //정수였던게 자동으로 실수로 바뀐다 : 자동형변환
		System.out.println("f2=" + f2);
		
		float i = (int)7.8; //강제형변환
		System.out.println("i=" +i);
		
	}
}
/*

실수형 자료형 
doudle : 8byte -1.7E308~+1.7E308
float : 4byte -3.4E385~+3.4E38

*/