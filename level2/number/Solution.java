package level2.number;

/**
 * 2021-12-13
 * 프로그래머스 level2 : 숫자의 표현
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(15));
	}
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
        	int sum = 0;
        	for(int j=i; j<=n; j++) {
        		sum += j;
        		if(sum == n) {
        			answer++;
        			break;
        		}else if(sum > n) {
        			break;
        		}
        	}
        }
        
        return answer;
    }
}

