import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); //수열의 개수
        int[] s = new int[n]; //수열
        int current = 1; //현재수, 어차피 오름차수 수열해야하고, 첫번쨰는 원래 1이 들어가야함.
        
        for(int i=0;i<s.length;i++) {
        	s[i] = sc.nextInt();
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length;i++) {
        	while(current <= s[i]) {
        		stack.push(current++);
        		sb.append("+\n");
        	}
        	if(stack.peek() == s[i]) {
        		stack.pop();
        		sb.append("-\n");
        	}else {
        		System.out.println("NO");
                return;
        	}
        	
        }
        
        
        System.out.println(sb.toString());
        
    }
}
