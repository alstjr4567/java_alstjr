//class Calc{
//	static int max2(int a,int b) {
//		if(a>b)
//			return a;
//		else
//			return b;
//	}
//}

//class Math{
//	static double	PI
//	static int max(int a,int b) {
//		if(a>b)
//			return a;
//		else
//			return b;
//	}
//}

public class Ex05_11_Math {
	public static void main(String[] args) {
		int a=130,b=40;
		//int result = max2(a,b);
		
//		Calc c = new Calc();
//		int result = c.max2(a, b);
		
		//int result = Calc.max2(a,b);
		int result = Math.max(a, b);
		System.out.println("result:" + result);
		
		System.out.println(Math.max(1.2, 3.4));
		
		System.out.println(Math.PI);
		
		System.out.println(Math.abs(-3));
		System.out.println(Math.min(a, b));
		System.out.println(Math.pow(3, 4));
		double result2 = Math.pow(3, 4);
		System.out.println("result2:" + result2);
	}
	
//	static int max2(int a,int b) {
//		if(a>b)
//			return a;
//		else
//			return b;
//	}

}

//https://docs.oracle.com/en/java/javase/11/docs/api/index.html


