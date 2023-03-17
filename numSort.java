package complexity;

import java.util.*;

//n개의 수가 주어졌을떄 오름차순 정렬
public class numSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_list_size = sc.nextInt();
		int[] num_list = new int[num_list_size];
		
		for(int i=0;i<=num_list.length-1;i++) {
			num_list[i] = sc.nextInt();
		}
		
		Arrays.sort(num_list);
		
		for(int i=0;i<=num_list.length-1;i++) {
			System.out.println(num_list[i]);
		}
		
		
	}

}
