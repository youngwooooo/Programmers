package level1.sumNoneNum;

import java.util.ArrayList;
import java.util.List;

/**
 * 2021-12-03
 * 프로그래머스 level1 : 없는 숫자 더하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(st.solution(numbers));
	}
	
	public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++) {
        	list.add(numbers[i]);
        }
        
        for(int i=0; i<=9; i++) {
        	if(!list.contains(i)) {
        		answer += i;
        	}
        }
        
        return answer;
    }
}
