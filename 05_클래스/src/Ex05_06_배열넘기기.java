
public class Ex05_06_배열넘기기 {

	
	public static void main(String[] args) {
		int a=1, b=2, c=3;
		int[] arr = {1,2,3};//arr는 주소가 들어온다 방3개의
		
		sub(a,b,c);
		Ex05_06_배열넘기기 ex = new Ex05_06_배열넘기기();
		ex.sub2(arr[0], arr[1], arr[2]);
		ex.sub3(arr);
		System.out.println("----");
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println();
		}//main()

	static void sub(int x,int y,int z){
		System.out.println("sub 메서드");
		System.out.println(x+","+y+","+z);
		//return;
	}
	
	void sub2(int i, int j, int k){//int는 방이다
		System.out.println("sub 메서드");
		System.out.println(i+","+j+","+k);
		
	}
	void sub3(int[]x){//int는 방이다
		System.out.println("sub3 메서드");
		for(int t : x) {
			System.out.println(t+" ");
		}
		System.out.println();
		
		x[1]=100;
		int i;
		for(i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
		System.out.println();
		//return;
	}
}

