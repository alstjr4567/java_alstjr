import java.util.Scanner;

public class Ex04_04_1���� {
	public static void main(String[] args) {
		

		int[] arr = new int[3];
		int i;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<arr.length;i++) { // i=0 1 2
			System.out.print("�Է�:");
			arr[i] = sc.nextInt();
		}
		
		for(i=0;i<arr.length;i++) { // i=0 1 2
			System.out.println(arr[i]);
		}
	}
}
