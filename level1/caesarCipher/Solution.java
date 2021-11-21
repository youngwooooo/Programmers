package level1.caesarCipher;

/**
 * 2021-11-21 
 * 프로그래머스 level1: 시저 암호
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("A", 13));
		System.out.println(st.solution("z", 1));
		System.out.println(st.solution("Z", 10));
		System.out.println(st.solution("a B z", 4));
		System.out.println(st.solution(" aBZ", 20));
		System.out.println(st.solution("y X Z", 4));
	}
	
	public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++) {
        	// 한 글자씩 비교
        	char ch = s.charAt(i);
        	// 소문자 처리
        	if(ch >= 'a' && ch <= 'z') {
        		// n의 길이만큼 밀어냈을 때 'z'보다 커지면
        		if(ch + n > 'z') {
        			ch = (char) (ch + (n - 26));
        			answer += ch; 
        		}else {
        			ch = (char) (ch + n);
        			answer += ch;
        		}
        	// 대문자 처리
        	}else if(ch >= 'A' && ch <= 'Z') {
        		if(ch + n > 'Z') {
        			ch = (char) (ch + (n - 26));
        			answer += ch; 
        		}else {
        			ch = (char) (ch + n);
        			answer += ch;
        		}
        	// 공백은 밀어도 공백이니깐 그대로 넣어주기
        	}else {
        		answer += ch;
        	}
        }
        
        return answer;
    }
	
}
