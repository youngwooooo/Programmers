package level1.budget;

import java.util.Arrays;

/**
 * 2021-12-04
 * 프로그래머스 level1 : 예산
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] d = {2,2,3,3};
		int budget = 10;
		System.out.println(st.solution(d, budget));
	}
	
	public int solution(int[] d, int budget) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(d);
        // d의 길이만큼 budget에서 빼주면서 budget이 0보다 크거나 같을 때 answer을 1씩 증가시켜준다.
        for(int i=0; i<d.length; i++) {
        	budget -= d[i];
        	
        	if(budget >= 0) {
        		answer++;
        	}
        }
        
        return answer;
    }
}
