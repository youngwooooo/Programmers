package level1.sumDivisor;

/**
 * 2021-11-21
 * 프로그래머스 levle1 : 약수의 합
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		st.solution(12);
	}
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
        	if(n % i == 0) {
        		answer += i;
        	}
        }
        
        return answer;
    }
}
