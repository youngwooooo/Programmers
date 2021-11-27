package level1.hateSameInt;

import java.util.*;

/**
 * 2021-11-27 
 * 프로그래머스 level1 : 같은 숫자는 싫어
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {4,4,4,3,3};
		System.out.println(Arrays.toString(st.solution(arr)));
	} 
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        // 비교하기 위한 변수
        int first = arr[0];
        // 연속된 수를 하나만 남기고 저장할 List
        List<Integer> list = new ArrayList<Integer>();
        // 비교 변수를 list에 저장
        list.add(first);
        
        for(int i=0; i<arr.length; i++) {
        	// 비교 변수와 arr[i]가 같지 않을 때
        	if(first != arr[i]) {
        		// list에 arr[i] 저장
        		list.add(arr[i]);
        		// 비교 변수를 arr[i]로 바꾸기
        		first = arr[i];
        	}
        }
        
        // answer 초기화
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
