package study;
import java.util.*;


public class Baekjoon_11660 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //표의크기
		int m = sc.nextInt(); //질의 개수
		int temp = 0;
		int[][] graph = new int[n+1][n+1]; //합배열 공식을 매끄럽게 적용하기 위해 n+1 해줌.
		for(int i=1;i<=n;i++) { //인덱스 1부터 시작 1부터 배열의크기(n)
			for(int j=1;j<=n;j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		int[][] s = new int[n+1][n+1]; //합배열선언
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				s[i][j] = s[i][j-1] + s[i-1][j] - s[i-1][j-1] + graph[i][j];
			}
		}
		//m만큼 구간합 호출하기
		for(int i=1;i<=m;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int result = s[x2][y2] -s[x1 -1][y2] - s[x2][y1-1]+ s[x1-1][y1-1];
			
			System.out.println(result);
		}
	
		

		
		

	}

}
