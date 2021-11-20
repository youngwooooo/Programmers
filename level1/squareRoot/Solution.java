package level1.squareRoot;

/**
 * 2021-11-20 
 * 프로그래머스 level1 : 정수 제곱근 판별
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(10));
	}
	
	public long solution(long n) {
        long answer = 0;
        // Math.sqrt(n) : 루트 n
        for(long i=1; i<=Math.sqrt(n); i++) {
        	if(n % i == 0) {
        		// Math.pow(a, b) : a의 b제곱
        		answer = Math.pow(i, 2) == n ? (long)Math.pow((i+1), 2): -1;
        	}
        }
        
        return answer;
    }
}
