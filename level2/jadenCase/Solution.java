package level2.jadenCase;

/**
 * 2021-12-09
 * 프로그래머스 level2 : JadenCase 문자열 만들기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("3people unFollowed me"));
	}
	
	public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        // 소문자로 변환
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++) {
        	// 첫 번째 글자거나 이전 문자가 공백일 경우 해당 문자를 대문자로
        	if(i == 0 || s.charAt(i-1) == ' ') {
        		answer.append(String.valueOf(s.charAt(i)).toUpperCase());
        	// 나머지는 그냥 더해주기
        	}else {
        		answer.append(s.charAt(i));
        	}
        }
        
        return answer.toString();
    }
}
