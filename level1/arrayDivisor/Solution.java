package level1.arrayDivisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2021-11-26 
 * 프로그래머스 level1 : 나누어 떨어지는 숫자 배열
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		System.out.println(Arrays.toString(st.solution(arr, divisor)));
		
		int[] arr2 = {2, 36, 1, 3};
		divisor = 1;
		System.out.println(Arrays.toString(st.solution(arr2, divisor)));
		
		int[] arr3 = {3, 2, 6, 10};
		divisor = 10;
		System.out.println(Arrays.toString(st.solution(arr3, divisor)));
	}
	
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        
        if(list.size() == 0) {
        	list.add(-1);
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
       
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
