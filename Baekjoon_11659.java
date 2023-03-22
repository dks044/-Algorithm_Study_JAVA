package study;
import java.util.*;
public class Baekjoon_11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //수의 개수
		int m = sc.nextInt(); //합을 구해야 하는 횟수(질의 개수)
		
		int[] num_list = new int[n]; //수 n개의 배열
		int[] s = new int[n+1]; //합배열 (구간합 공식 적용을 위해 +1 하나더 해준다)

		
		for(int i=0;i<num_list.length;i++) {
			num_list[i] = sc.nextInt();
			if(i==1) {
				s[i] = num_list[0];
			}
			if(i>1) {
				s[i] = num_list[i-1];
			}
			if(i==num_list.length-1) {
				s[i+1]=num_list[i];
			}
		}
		int[] s_copy = s;
		for(int i=0;i<s.length;i++) {
			if(i==0) {
				s[0] = 0;
				continue;
			}
			if(i==1) {
				s[i]=num_list[i-1];
				continue;
			}
			s[i] = s[i-1] +s_copy[i];
		}
		
		
		//질의(m만큼 물어봄)
		for(int q=0; q<m; q++) {			
		    int i = sc.nextInt(); //i
		    int j = sc.nextInt(); //j
		    if(i < 1) {
		    	System.out.println(s[j] -s[0]);
		    }
		    System.out.println(s[j] - s[i-1]);
		}
}
}