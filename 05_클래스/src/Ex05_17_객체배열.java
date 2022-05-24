
class Stu{
	String name;
	int kor;
	int eng;

	Stu(){  //default 생성자가 안써도 기본으로 들어와 있다.숨어잇음
		this.name="김세은";
		this.kor = 90;
		this.eng = 80;

	}

	Stu(String name){
		this.name = name;
		this.kor = 77;
		this.eng = 33;
	}

	Stu(String name,int kor,int eng){// 생성자가 만들어졌다면 default 생성자는 안만들어진다.
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}
	void display() {
		System.out.println(name+","+kor+","+eng);

	}

}//

public class Ex05_17_객체배열 {

	public static void main(String[] args) {

		int a=10,b=20,c=30;
		//int[] arr = {10,20,30};
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		Stu s1 = new Stu();
		Stu s2 = new Stu("수지");
		Stu s3 = new Stu("수영",60,80);

		s1.display();
		s2.display();
		s3.display();

		//Stu[] arr2 = {new Stu(),new Stu("수지"),new Stu("수영",60,80)};   

		Stu[] arr2 = new Stu[3];
		arr2[0] = new Stu();
		arr2[1] = new Stu("수지");
		arr2[2] = new Stu("수영",60,80);

		int i;
		for(i=0;i<arr2.length;i++) {
			arr2[i].display();

		}
	}

}
