package study;
import java.util.Scanner;

public class Backjoon_11720_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num_list_size = sc.nextInt();
        String num = sc.next();
        
        // 입력된 문자열이 숫자인지 확인
        if(!num.matches("[0-9]+") || num.length() != num_list_size) {
            return;
        }
        
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            // 문자를 숫자로 변환하여 더해줌
            sum += Character.getNumericValue(num.charAt(i));
        }
        
        System.out.println(sum);
    }
}

