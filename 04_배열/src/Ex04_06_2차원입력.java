import java.util.Scanner;

public class Ex04_06_2차원입력 {

	public static void main(String[] args) {		
		
		int[][] arr = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		arr[0][0]=10;
//		arr[0][0]=sc.nextInt();
//		arr[0][1]=sc.nextInt();
//		arr[0][2]=sc.nextInt();
//		arr[1][0]=sc.nextInt();
//		arr[1][1]=sc.nextInt();
//		arr[1][2]=sc.nextInt();
		
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print("입력:");
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		int sum=0;
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
				System.out.println(sum);
				sum=0;
			}	
	}//main
}
