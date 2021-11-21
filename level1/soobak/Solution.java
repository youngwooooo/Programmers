package level1.soobak;

/**
 * 2021-11-21 
 * 프로그래머스 level1 : 수박수박수박수박수박수?
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(3));
	}
	
	public String solution(int n) {
        String answer = "";
        
        for(int i=1; i<=n; i++) {
        	answer += i % 2 != 0 ? "수" : "박";
        }
        
        return answer;
    }
}
