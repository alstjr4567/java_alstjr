
public class Ex03_08이중for {

	public static void main(String[] args) {
		int i,j;
		
		for(i=1; i<=3;i++) {
			
		for(j=6; j<=7;j++) {
			
			System.out.println(i+","+j);
			}//안쪽for
		System.out.println("----------------------------");
	}//바깥쪽for
	//for+for을 이중포문 이라함
	}
}
//단계별 하나씩 디버그