package study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(); // s 문자열 길이
		int p = sc.nextInt(); // p 문자열 길이 (부분문자열 길이)
		String a_ = sc.next(); // s 문자열 입력
		
		int count = 0; // 좋은 수
		// 부분 문자열에 포함돼야할 A,C,G,T의 최소 개수
		int[] min_dna = new int[4];
		for(int i=0;i<min_dna.length;i++) {
			min_dna[i] = sc.nextInt();
		}
		
		StringBuilder sb = new StringBuilder();
		String temp ="";
		for(int i=0;i<s;i++) {
			if(i+p>s) break;
			temp = a_.substring(i, i+p);
			sb.append(temp);
			sb.append(" ");
		}
		
		String[] temp2 = sb.toString().split(" ");
		for(int i=0;i<temp2.length;i++) {
			int a_count =0; int c_count =0; int g_count =0; int t_count =0;
			for(int j=0;j<p;j++) {
				char ch = temp2[i].charAt(j);
				if(ch == 'A') a_count++;
				else if(ch == 'C') c_count++;
				else if(ch == 'G') g_count++;
				else if(ch == 'T') t_count++;
			}
			if(a_count == min_dna[0] && c_count == min_dna[1] && 
				g_count == min_dna[2] && t_count == min_dna[3]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
	}

}
