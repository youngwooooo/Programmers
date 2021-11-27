package level1.getMiddleString;

/**
 * 2021-11-27
 * 프로그래머스 level1 : 가운데 글자 가져오기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("abcdefghi"));
		System.out.println(st.solution("qwer"));
		System.out.println(st.solution("qwerty"));
	}
	
	public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        int idx = Math.round(s.length() / 2);
        
        if(s.length() % 2 != 0) {
        	answer = sArr[idx];
        }else {
        	answer = sArr[idx-1] + sArr[idx]; 
        }
        
        return answer;
    }
}
