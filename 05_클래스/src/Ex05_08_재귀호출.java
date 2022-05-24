
public class Ex05_08_재귀호출 {//중요

	public static void main(String[] args) {
		show(3);
	}
	static void show(int cnt) {
		System.out.println("Hi~"+cnt);
		if(cnt == 1)
			return;
			
		show(--cnt);
	}
}
/*
static void show(int 3) {
	System.out.println("Hi~"+3);
	if(cnt == 1)
		return;
		
	show(2);
}

static void show(int 2) {
	System.out.println("Hi~"+2);
	if(cnt == 1)
		return;
		
	show(1);
}

static void show(int 1) {
	System.out.println("Hi~"+1);
	if(cnt == 1)
		return;
		
	show(1);
}
*/
