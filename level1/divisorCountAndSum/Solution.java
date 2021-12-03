package level1.divisorCountAndSum;

/**
 * 2021-12-03 
 * 프로그래머스 level1 : 약수의 개수와 덧셈
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(13, 17));
	}
	
	public int solution(int left, int right) {
        int answer = 0;
        // 약수의 개수를 저장할 변수
        int count = 0;
        
        for(int i=left; i<=right; i++) {
        	for(int j=1; j<=i; j++) {
        		// 약수 찾기
        		if(i % j == 0) {
        			count++;
        		}
        	}
        	
        	// 약수가 짝수 일 때 answer에 i 더한 후, count 초기화
        	if(count % 2 == 0) {
        		answer += i;
        		count = 0;
        	// 약수가 짝수 일 때 answer에 i 뺀 후, count 초기화
        	}else {
        		answer -= i;
        		count = 0;
        	}
        	
        }
        
        return answer;
    }
}
