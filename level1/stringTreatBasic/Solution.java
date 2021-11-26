package level1.stringTreatBasic;

/**
 * 2021-11-27
 * 프로그래머스 level1 : 문자열 다루기 기본
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("123567"));
	}
	
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
        	answer = s.matches("^[0-9]*$") ? true : false;
        }else {
        	answer = false;
        }
        
		return answer;
    }
}
