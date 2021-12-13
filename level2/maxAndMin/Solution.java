package level2.maxAndMin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2021-12-13
 * 프로그래머스 level2 : 최대값과 최솟값
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("-1 2 -3"));
	}
	
	public String solution(String s) {
        String answer = "";
        long max = 0;
        long min = 0;
        
        String[] arr = s.split(" ");
        
        List<Long> list = new ArrayList<Long>();
        for(int i=0; i<arr.length; i++) {
        	list.add(Long.parseLong(arr[i]));
        }
        
        Collections.sort(list);
        
        if(list.get(0) == list.get(list.size()-1)) {
        	max = list.get(0);
        	min = max;
        }else {
        	max = list.get(list.size()-1);
        	min = list.get(0);
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}
