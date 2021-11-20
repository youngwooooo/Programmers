package level1.deleteMin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2021-11-20 
 * 프로그래머스 level1 : 제일 작은 수 제거하기 
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {4,10,1};
		System.out.println(Arrays.toString(st.solution(arr)));
	}
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        // Collection을 사용하기 위한 List
        List<Integer> list = new ArrayList<Integer>();
        
        if(arr.length == 1) {
        	// 길이가 1일 때, answer의 길이는 arr의 길이와 동일하고 -1을 담아 리턴
        	answer = new int[arr.length];
        	answer[0] = -1;
        }else {
        	// 길이가 1이 아닐 때, 최소값을 빼기 때문에 answer의 길이는 arr의 길이 -1 
        	answer = new int[arr.length-1];
        	// list에 answer 담기
        	for(int i=0; i<arr.length; i++) {
        		list.add(arr[i]);
        	}
        	
        	// 최소값 
        	int min = Collections.min(list);
        	// 최소값의 index
        	int minIdx = list.indexOf(min);
        	// 최소값 제거
        	list.remove(minIdx);
        	
        	// answer에 담기
        	for(int i=0; i<list.size(); i++) {
        		answer[i] += list.get(i);
        	}
        	
        }
        
        return answer;
    }
}
