import java.util.*;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long count = 1;
        long answer =0;

        
        while(num >= 0) {
            num -= count;
            count++;
            answer++;
        }
        System.out.println(answer-1);
    }//main
}
