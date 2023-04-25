import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); //카드의 개수
    	int[] s = new int[n+1];
    	Queue<Integer> que = new LinkedList<>();
    	for(int i=1;i<s.length;i++) {
    		s[i] = i;
    		que.add(s[i]);
    	}
    	
    	while(que.size()>1) {
    		que.poll();
    		que.add(que.poll());
    	}
    	System.out.println(que.peek());
    }
}
