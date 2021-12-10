package level2.fibonacci;

/**
 * 2021-12-10
 * 프로그래머스 level2 : 피보나치 수
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(44));
	}
	
	public int solution(int n) {
        int answer = 0;
        // 결과를 담을 배열
        int[] fibonacci = new int[n];
        
        for(int i=0; i<fibonacci.length; i++) {
        	if(i > 2) {
        		fibonacci[i] = (fibonacci[i-2] + fibonacci[i-1]) % 1234567;
        	}else {
        		fibonacci[i] = i;
        	}
        }
        
        answer = fibonacci[n-1];
        
        return answer;
    }	
}
