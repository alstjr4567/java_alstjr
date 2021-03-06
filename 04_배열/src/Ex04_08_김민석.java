import java.util.Scanner;

public class Ex04_08_김민석 {

	public static void main(String[] args) {

		int studentNum,i,j,max,min,sum,temp;
		int[] score = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.print("선택>");
			int num = sc.nextInt();
			/*
			switch(num) {
			case 1 : 
				System.out.print("1.학생수 입력>");
				studentNum = sc.nextInt();
				score = new int[studentNum];
				break;
			case 2:
			case 2:
					
			}
			*/
			
			if(num == 1) {
				System.out.print("1.학생수 입력>");
				studentNum = sc.nextInt();
				score = new int[studentNum];
			}
			else if(num == 2) {
				System.out.println("2.점수입력");
				if(score == null) {
					System.out.println("1번먼저 진행하세요");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print("score["+i+"]>");
					score[i] = sc.nextInt();
				}

			}
			else if(num == 3) {
				System.out.println("3.점수리스트");
				if(score == null) {
					System.out.println("1번먼저 진행하세요");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println("score["+i+"]>"+score[i]);
				}
			}
			else if(num == 4) {
				System.out.println("4.분석");
				if(score == null) {
					System.out.println("1번먼저 진행하세요");
					continue;
				}

				max = score[0];
				min = score[0];
				sum = score[0];
				for(i=1;i<score.length;i++) {
					if(max < score[i]){
						max = score[i];
					}
					if(min > score[i]) {
						min = score[i];
					}
					sum += score[i];
				}
				System.out.println("최고점수:" + max);
				System.out.println("최하점수:" + min);
				System.out.println("합계:" + sum);
				System.out.println("평균:" + sum/score.length);
				System.out.printf("평균2:%.1f\n",(double)sum/score.length);

				for(i=0;i<score.length-1;i++) {
					for(j=i+1;j<score.length;j++) {
						if(score[i] > score[j]) {
							temp = score[j];
							score[j] = score[i];
							score[i] = temp;
						}
					}
				}

				for(i=0;i<score.length;i++) {
					System.out.print(score[i]+ " ");
				}
				System.out.println();
				System.out.println("최고점수:"+score[score.length-1]);
				System.out.println("최하점수:"+score[0]);
				
				sum = 0;
				for( int x : score) {
					sum += x;
				}
				System.out.println("sum:" + sum);
			}
			else if(num == 5) {
				System.out.println("5.종료");
				break;
			}
			else {
				System.out.println("1~5사이의 번호만 선택 가능합니다.");
			}
		}//while

		System.out.println("프로그램을 종료합니다.");

	}//main
}

/*
과제
2,3,4 전에 1.학생수 입력받기
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>1
학생수>5
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:0
scores[1]:0
scores[2]:0
scores[3]:0
scores[4]:0
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>2
scores[0]>76
scores[1]>32
scores[2]>45
scores[3]>99
scores[4]>10
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:76
scores[1]:32
scores[2]:45
scores[3]:99
scores[4]:10
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>4
최고점수:99
최하점수:10
합계:262
평균:52
10 32 45 76 99 

==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>5
프로그램 종료

 */