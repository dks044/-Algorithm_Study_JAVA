package study;
import java.util.*;

public class Debuging_error {
	public static boolean chkPrime(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> int_arr = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (chkPrime(i)) {
                int_arr.add(i);
            }
        }
        for (int temp : int_arr) {
            System.out.println(temp);
        }
    }
}
