import java.util.Scanner;

public class Ex05_10_��μ� {

	public static void main(String[] args) {
		
		//���� 2�� �Է�
				int a, b;
				
				//3 4 :3�� 4��
				//5 3 :5�� 3��
				
				Scanner sc = new Scanner(System.in);
				System.out.print("��:"); // 4
				a = sc.nextInt();
				System.out.print("����:"); // 3
				b = sc.nextInt();
				
				int result = recursive(a,b);
				System.out.println("result:" + result);
				
				int result2 = recursive2(a,b);
				System.out.println("result2:" + result2);
			}
			
			static int recursive(int x,int y){ // 4 3
				if(y==0)
					return 1;
				else
					return x * recursive(x,y-1); 
			}
			
			static int recursive2(int x,int y) { // 4 3
				
				int mul = 1;
				for(int i=1;i<=y;i++) { // i=1 2 3
					mul = mul * x;
				}
				return mul;
	}

}

//���� 2���Է�
//int a,b;
//3 4: 3�� 4���� ���ϴ°�\
//5 3: 5��3���� ���ϴ°�