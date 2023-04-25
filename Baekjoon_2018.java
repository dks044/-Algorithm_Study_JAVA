import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 1;
		int s = 1;
		int e = 1;
		int sum = 1;
		
		//e(end_index)가 n(ex:15)이 될떄까지.(15가 될떄까지 +1 반복함)
		while(e != n) {
			if(sum > n) {
				sum = sum - s;
				s +=1;
				
			}else if(sum == n) {
				e +=1;
				sum= sum+e;
				count +=1;
				
			}else {
				e +=1;
				sum = sum+e;
			}
		}
		
		System.out.println(count);

	}
}
