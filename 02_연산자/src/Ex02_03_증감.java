
public class Ex02_03_증감 {
	public static void main(String[] args) {
		
		int a=5,aa, b=5,bb;
		
		//++ : 1증가시키는 연산자
		aa = --a;  //앞:먼저  
		//a=a-1;
		//aa=a
		
		bb = b--;  //뒤:나중에
		//bb=b;
		//b=b-1;
		
		System.out.println("a:"+a);
		System.out.println("aa:"+aa);
		
		System.out.println("b:"+b);
		System.out.println("bb:"+bb);
		
		int x = 5;
		System.out.println("x:"+x);
		//++x; // x=x+1
		//x+; // 에러
		System.out.println("x:"+x);
		
		int i=10;
		System.out.println(i);   //console=i(콘솔창에 i넣어라)
		System.out.println(i++); //console=i++
		System.out.println(++i); //console=++i
		System.out.println(++i); //console=++i
		System.out.println(i++); //console=i++
		System.out.println(i);   //console=i

	}

}
