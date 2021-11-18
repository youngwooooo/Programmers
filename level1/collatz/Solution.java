package level1.collatz;

/**
 * 2021-11-18
 * 프로그래머스 level1 : 콜라츠 추측
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int result = st.solution(626331);
		System.out.println(result);
	}
	
	public int solution(long num) {
		int answer = 0;
        int cnt = 0;
        
        while(true) {
        	// num이 1이면
        	if(num == 1) {
        		answer = 0;
        		break;
        	}
        	
        	// num이 짝수이면
        	if(num % 2 == 0) {
        		num = num / 2;
        		cnt++;
                
        		if(num == 1) {
        			answer = cnt;
        			break;
        		}else if(num % 2 == 1) {
        			num = num * 3 + 1;
        			cnt++;
        		}
        		
        	}
        	
        	// num이 홀수이면
        	if(num % 2 == 1) {
        		num = num * 3 + 1;
        		cnt++;
        		
        		if(num == 1) {
        			answer = cnt;
        			break;
        		}else if(num % 2 == 0) {
        			num = num / 2;
        			cnt++;
        		}
        		
        	}
        	
        	System.out.println(num);
        	
        	// 500번 수행해도 num이 1이 아닐 때
        	if(cnt > 500) {
        		if(num != 1) {
        			answer = -1;
        			break;
        		}
        	}
        }
        
        return answer;
    }	
}
