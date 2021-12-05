package level1.numStringToEnglish;

/**
 * 2021-12-05
 * 프로그래머스 level1 : 숫자 문자열과 영단어
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("1zerotwozero3"));
	}
	
	public int solution(String s) {
        int answer = 0;
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
        	s = s.replace(numStr[i], String.valueOf(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
