package level1.gymClothes;

import java.util.Arrays;

/**
 * 2021-12-05
 * 프로그래머스 level1 : 체육복
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5}; 
		System.out.println(st.solution(n, lost, reserve));
			
		n = 5;
		int[] lost2 = {2, 4};
		int[] reserve2 = {3}; 
		System.out.println(st.solution(n, lost2, reserve2));
		
		n = 7;
		int[] lost3 = {1, 2, 3, 4, 5, 6, 7};
		int[] reserve3 = {1, 2, 3}; 
		System.out.println(st.solution(n, lost3, reserve3));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 여분의 체육복을 도난당해서 빌려 줄 수 없는 사람 or 체육복을 빌린 사람 = 체육수업이 가능한 사람
        int can = 0;
        
        // 정렬해주지 않으면 테스트 13, 18번이 실패
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		// 여분의 체육복이 있지만 도난 당했다면 
        		if(lost[i] == reserve[j]) {
        			// 체육 활동은 가능하므로 can을 1 증가, lost[i]를 -1로 변경
        			can++;
        			lost[i] = -1;
        			// 체육복을 빌려줄 수 없기 때문에 reserve[j]를 -1로 변경
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j]) {
        			// 체육복을 빌렸기 때문에 체육활동을 할 수 있음
        			can++;
        			// 빌려준 사람은 다른 사람에게 또 빌려줄 수 없으므로 -1로 변경
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        answer = n - lost.length + can;
        
        return answer;
    }
}