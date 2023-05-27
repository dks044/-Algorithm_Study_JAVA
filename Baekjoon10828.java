
import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	sc.nextLine();
    	StringBuilder sb = new StringBuilder();
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<n;i++) {
    		String str = sc.nextLine();
    		if(str.contains("push")) {
    			stack.push(Integer.parseInt(str.substring(5).trim()));
    			continue;
    		}
    		switch(str) {
    			case "pop" :
    				sb.append(stack.empty() ? -1+"\n" : stack.pop()+"\n"); 
    			break;
    			case "size" :
    				sb.append(stack.size()+"\n");
    			break;
    			case "empty" :
    				sb.append(stack.empty() ? 1+"\n" : 0+"\n");
    			break;
    			case "top" :
    				sb.append(stack.empty() ? -1+"\n" : stack.peek()+"\n");
    			break;
    		}
    		
    	}
    	System.out.println(sb.toString());
    	sc.close();

    	
    	
    	
    }//main
}
