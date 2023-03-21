package study;
import java.util.*;

public class Baekjoon_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subJect_count = sc.nextInt();
		
		//이 값은 1000보다 작거나 같으니까 
		if(subJect_count >1000) {
			return;
		}
		int[] subject_score = new int[subJect_count];
		for(int i=0;i<subject_score.length;i++) {
			subject_score[i] = sc.nextInt();
		}
		int maxScore = subject_score[0]; //최고점
		
		for(int i=0;i<subject_score.length;i++) {
			if(subject_score[i] > maxScore) {
				maxScore = subject_score[i];
			}
		}

		double[] sejun = new double[subJect_count];
		
		for(int i=0;i<subject_score.length;i++) {
			double a = (double) maxScore * 100;
			sejun[i] = (double)(subject_score[i]/a);
		}
		
		double sejun_total = 0;
		for(int i=0;i<subject_score.length;i++) {
			sejun_total += sejun[i];
		}
		
		double sejun_avg = sejun_total / subJect_count;
		
		System.out.println(sejun_avg*10000);
		
		
		
	}

}
