
public class Ex04_05_2차원 {

	public static void main(String[] args) {
		
		//int[]a={10,20,30,40,50,};
		
		int[][] arr = {//1번째 방법
				{80,72,63,83},
				{92,21,},
				{99,49,59}
		};
//		int[][] arr = new int[][]{ 2번째 방법
//				{80,72,63,83},
//				{92,21,},
//				{99,49,59}
//		};
		
//		int[][] arr = new int[3][4];
//		arr[0][0]=80;
//		arr[1][1]=21;
//		arr[2][0]=99;
		
//		int[][] arr = new int[5]
		
//		int[][] arr = new int[3][];
//		arr[0]= new int[4];
//		arr[1]= new int[2];//1행에는 방두개 1열밖에 없다 2행접근 안됨
//		arr[2]= new int[3];
//		
//		arr[0][0]=80;
//		arr[1][1]=21;
//		arr[2][0]=99;
		
		System.out.println(arr.length);
		System.out.println("arr[0].length"+arr[0].length);
		System.out.println("arr[1].length"+arr[1].length);
		System.out.println("arr[2].length"+arr[2].length);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[2][0]);
		//System.out.println(arr[2][3]); 3은 없어서 에러가 발생한다.
		
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");//j행j열
			}
			System.out.println();
		}
		
		System.out.println();
		
//		int[]t={80,72,63,83};
//		int[]t={92,21,};
//		int[]t={99,49,59};
		
		for(int[] t : arr) {
			for(int x : t) {
				System.out.println(x+" ");
			}
			System.out.println();
		}
		
	}//main

}
