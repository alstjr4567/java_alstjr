
public class Ex04_01_1차원 {

	public static void main(String[] args) {
		
		//int a=10,b=20,c=30; (전부 int라 4바이트로 만들어진다.)
		//System.out.println(a);//10

		//배열:같은타입에 데이터를 한 묶음으로 묶어서 관리하는 것
		
		int[] a = {10,20,30,40,50};// 참조변수(참조값or주소값 이라고도 함)
		//1번int[] a = {10,20,30,40,50}; //5개 각각 4바이트씩, 묶어서 각각관리하는것
		//[]이걸써야 배열됨, 같은타입만 한묶음의 배열로 만들수있다.
		//2번int[] a = new int[] {10,20,30,40,50};//1번도 되고 2번도 된다
//		int[] a = new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
		//a[1]=222; //이렇게 바꿀순있다
		//a[5]=123; //지금4번방밖에 없는데 5번방에 넣으라고하면 안됨,수정할수있지만 추가할수 없다

		System.out.println(a);
		System.out.println(a.length);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);// 집을 index라고 한다 
		//System.out.println(a[5]);
		System.out.println("----------");//경계선
		int i;
		for(i=0;i<a.length;i++) { //i<옆에 =쓰면 안됨
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("----------");
		
		for(int x : a){
			System.out.println(x);
		}
		
		System.out.println("***********");
		
		//1.1 2.2 3.3 실수 3개를 한묶음의 배열로 만들어 반복문써서 출력
		
		//double[] b = {1.1,2,3.3};
		//double[] b = new double[]{1.1,2,3.3};
		double[] b = new double[3];
		b[0]=1.1;
		b[1]=2.2;
		b[2]=3.3;
		System.out.println(b);
		for(i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		
		for(double t : b) {
			System.out.println(t);
		}
		
		
		
	}//main
}
