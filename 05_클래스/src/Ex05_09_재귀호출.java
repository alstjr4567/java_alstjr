
public class Ex05_09_¿Á±Õ»£√‚ {

	public static void main(String[] args) {

		System.out.println("4 factorial : " + factorial(4)); // 4!=4*3*2*1
	}

	static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
		
	}
}
