
public class Ex03_11_이중_for {

	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=0;i<5;i++) { // i= 0 1 2 3 4 
			for(j=0;j<5;j++) { // j= 0 1 2 3 4
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=0;i<5;i++) { // i= 0 1 2 3 4 
			for(j=0;j<=i;j++) { // j= 0 1 2 3 4
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) { // 공백 반복
				System.out.print(" ");
			}
			for(k=5;k>i;k--) { // *반복
				System.out.print("*");
			}
			System.out.println();
			
		}//바깥쪽for문
		
		System.out.println();
		
		
		for(i=0;i<5;i++) {
			
			for(j=4;j>i;j--) { // 4 3 2 1 >0
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		
	}//바깥쪽for문		
		
	}

}