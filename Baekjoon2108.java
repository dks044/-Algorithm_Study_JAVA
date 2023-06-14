

import java.util.*;



public class Main {

    public static void main(	String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long num = sc.nextInt();
    	long[] math_arr = new long[(int)num]; 
    	for(int i =0;i<num;i++) math_arr[i] = sc.nextLong();
    	//1)산술평균 - N개들의 합을 n으로 나눈값
    	long sum=0;
    	for(long l: math_arr) sum+=l; 
    	System.out.println(Math.round((double)sum/num));
    	//2)중간값
    	Arrays.sort(math_arr);
    	System.out.println(math_arr[math_arr.length/2]);
    	//3)최빈값(그중 두번쨰)
    	if(math_arr.length==1) System.out.println(math_arr[0]);//배열크기가 1일경우
    	else {
    		//최빈값 구하기
    		HashMap<Long,Long> map = new HashMap<>();
    		for(long l : math_arr) {
    			if(!map.containsKey(l)) {
    				map.put(l,1L);
    			}else {
    				map.put(l, map.get(l)+1L);
    			}
    		}
    		long many_num =0; //최빈값
    		for(long l : map.values()) if(l > many_num) many_num = l;
    		//최빈값이 1이 최대일경우
    		if(many_num==1) System.out.println(math_arr[1]);//그냥 배열의 2번쨰작은값출력
    		else {//최빈값 2이상이 있을경우
    			ArrayList<Long> many_arr = new ArrayList<>();
    			for(Map.Entry<Long, Long> entry : map.entrySet()) {
    				if(many_num == entry.getValue()) many_arr.add(entry.getKey());
    			}
    			Collections.sort(many_arr,Collections.reverseOrder());
    			if(many_arr.size()>1) {
    				System.out.println(many_arr.get(many_arr.size()-2));
    			}else {
    				System.out.println(many_arr.get(0));	
    			}
    			
    		}
    	}
    	//4)범위 : N개들의 수중 최댓값과 최솟값 차이
    	//배열사이즈가 1개밖에 없을경우
    	if(math_arr.length==1) System.out.println(0);
    	else {
    		long max = math_arr[0];
        	long min = math_arr[0];
        	for(int i=1;i<math_arr.length;i++) {
        		if(max < math_arr[i]) max = math_arr[i];
        		if(min > math_arr[i]) max = math_arr[i];
        	}
        	System.out.println(Math.abs(max-min));
    	}
    	
    	
    	
    }//main
}
