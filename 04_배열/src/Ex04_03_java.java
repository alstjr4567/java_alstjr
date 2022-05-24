
public class Ex04_03_java {

	public static void main(String[] args) {
		
		//int[] arr = {9,8,7};
		//int[] aar = new int[] {9,8,7};
		int[] arr = new int[3];
		arr[0] = 9;
		arr[2] = 8;
		arr[2] = 7;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		for(int x : arr) {
			System.out.println(x);
		}
		}
	}
}
