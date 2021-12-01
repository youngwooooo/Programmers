package level1.remainderResult1;

import java.util.ArrayList;
import java.util.List;

/**
 * 2021-12-01 
 * 프로그래머스 level1: 나머지가 1이 되는 수 찾기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(100));
	}
	
	public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
        	if(n % i == 1) {
        		list.add(i);
        	}
        }
        answer = list.get(0);
        
        return answer;
    }
}
