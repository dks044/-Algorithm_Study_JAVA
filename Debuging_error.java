package study;
import java.util.*;

public class Debuging_error {
	
	//4가지 오류가 숨어있는 코드
	public static void main(String[] args) {
		//TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int answer = 0;
		int A[] = new int[100001];
		int S[] = new int[100001];
		
		//Integer.MAX_VALUE : int타입에 들어갈 수 있는 최댓값
		for(int i=1;i<10000;i++) {
			A[i] = (int) (Math.random() * Integer.MAX_VALUE);
			S[i] = S[i - 1] + A[i];
		}
		
		for(int t=1;t < testcase; t++) 
		{
			int query = sc.nextInt();
			for(int i=0; i<query;i++) 
			{
				int start = sc.nextInt();
				int end = sc.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(testcase + " "+answer);
			}
		}

	}

}
