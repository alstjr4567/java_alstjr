
public class Ex03_15_±è¹Î¼® {

	public static void main(String[] args) {
		int i,j;
		for(i=2;i<10;i++) {
			if(i%2==1)
				continue;

			for(j=1;j<=9;j++) {
				if(i<j)
					continue;
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();

		}
		
		

		
	}

}
