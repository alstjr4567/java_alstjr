
public class Ex04_02_1차원 {

	public static void main(String[] args) {
		
int[] score = {79,88,91,33,100,55,95};
		
		System.out.println(score.length); // 7
		
		int i,sum=0,max,min;
		for(i=0;i<score.length;i++) {
			System.out.print(score[i] + " ");
			sum = sum + score[i];
		}
		System.out.println();
		System.out.println("sum:" + sum);
		System.out.println("평균:"+sum/score.length);
		
		max = score[0]; 
		min = score[0]; 
		for(i=1;i<score.length;i++) {
			if(max < score[i])
				max = score[i];
			
			if(min > score[i])
				min = score[i];
		}
		
		System.out.println("가장 큰값:" + max);
		System.out.println("가장 작은값:"+min);
		
		
		
		
		
		System.out.println("==============");
		
		sum=0;
		for(int t : score) {
			System.out.print(t+" ");
			sum = sum + t;
		}
		System.out.println();
		System.out.println("sum:" + sum);
		System.out.println("평균:"+sum/score.length);
		System.out.println();
		
	}//main

}

// 