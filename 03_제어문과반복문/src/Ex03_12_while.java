
public class Ex03_12_while {

	public static void main(String[] args) {
		
		
		//1~10출력
		int i;
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("for밖:" + i);
		
		System.out.println();
		
		i=100;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("while밖:" + i);
		
		i=1;
		while(i<=100) {
			if(i%7==0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println();
		
		System.out.println("do~while");
		
		i=100;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println("do~while문 밖:" + i);
	}

}

/*


for(초기식; 조건식; 증감식) {
	반복할 문장;
}
---
while(조건식) {
	반복할 문장;
	증감식;
}
---
초기식;
do{
	반복할 문장;
	증감식;
}while(조건식);
최소 한번은 실행해야 할 때 do~while문 사용

*/