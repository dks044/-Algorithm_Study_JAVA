package study;
import java.util.*;

public class Backjoon_11720 {
	
	//N개의 숫자가 공백없이 쓰여질떄, 이 숫자를 모두 합해서 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_list_size = sc.nextInt();
		
		String num = sc.next();
		if(num.length() > num_list_size) {
			num = sc.next();
		}
		//toCharArray(). 는 문자열을 한 글자씩 쪼개서 
		//이를 char타입의 배열에 집어넣어주는 친절한 메소드이다
		char[] num_sum = num.toCharArray();
		int sum = 0;
		for(int i=0;i<num_sum.length;i++) {
			sum += num_sum[i] - '0';
		}
		System.out.println(sum);
		
		
	}

}
