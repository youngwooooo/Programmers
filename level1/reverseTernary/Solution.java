package level1.reverseTernary;

/**
 * 2021-12-02
 * 프로그래머스 level1 : 3진법 뒤집기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(45));
		System.out.println(st.solution(125));
	}
	
	public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        do {
        	sb.append(String.valueOf(n % 3));
        	n = n / 3;
        }while(n > 0);
        
        answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}
