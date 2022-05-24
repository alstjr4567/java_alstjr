
public class Ex03_04_switch_case {

	public static void main(String[] args) {
		
		int n=1;
		if(n==1) {
			System.out.println("1입니다.");
		}
		else if(n==2){
			System.out.println("2입니다.");
		}
		else if(n==3){
			System.out.println("3입니다.");
		}
		else {
			System.out.println("1~3이 아닙니다.");
		}
		
		System.out.println();
		
		switch(n+1) {
		case 1 : System.out.println("1입니다.");
				break;
		case 2 : System.out.println("2입니다."); 
				break;//빠져나간다 브레이크 더이상 밑으로 내려가고싶지않으면 브레이크
		case 3 : System.out.println("3입니다.");
				break;
		default: System.out.println("1~3이 아닙니다.");
				break;//맨마지막은 break굳이 없어도 상관없다
		}
		
		System.out.println("switch~case 공부중");
		
		String fruit="banana";
		switch(fruit) {
				case"apple":System.out.println("사과");
							break;
				case"banana":System.out.println("바나나");
							break;
				default:System.out.println("그 밖의 과일");
		}
		
		//if(fruit=="apple")
		
		System.out.println();
		
		char ch='a';
		switch(ch) {
		case 'm' : 
		case 'M' : System.out.println("Morning"); break;
		case 'a' : 
		case 'A' : System.out.println("Afternoon"); break;
		case 'e' : 
		case 'E' : System.out.println("Evening"); break;
		default : System.out.println("잘못 입력하셧음");
		}
				
		
	}

}

/*

switch(정수or정수형변수or문자열)
	case 정수1:실행1;
			  break;
	case 정수2:실행2;
			  break;
	case 정수n:실행n;
			  break;
	default : 실행3;
			  break;

*/