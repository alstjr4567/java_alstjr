import java.util.Scanner;

public class Ex05_10_±è¹Î¼® {

	public static void main(String[] args) {
		
		//Á¤¼ö 2°³ ÀÔ·Â
				int a, b;
				
				//3 4 :3ÀÇ 4½Â
				//5 3 :5ÀÇ 3½Â
				
				Scanner sc = new Scanner(System.in);
				System.out.print("¹Ø:"); // 4
				a = sc.nextInt();
				System.out.print("Áö¼ö:"); // 3
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

//Á¤¼ö 2°³ÀÔ·Â
//int a,b;
//3 4: 3ÀÇ 4½ÂÀ» ´õÇÏ´Â°Í\
//5 3: 5ÀÇ3½ÂÀ» ´õÇÏ´Â°Í