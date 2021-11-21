package level1.createWeirdString;

/**
 * 2021-11-21 
 * 프로그래머스 level1: 이상한 문자 만들기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		st.solution("try hello world");
	}
	
	public String solution(String s) {
        String answer = "";
        // 공백을 포함해서 한 글자씩 자르기
        String[] sArr = s.split("");
        // 대/소문자 구분을 위한 변수
        int idx = 0;
        
        for(int i=0; i<sArr.length; i++) {
        	// 단어별로 확인해야 하므로 공백 일 때, 0으로 초기화
        	if(sArr[i].equals(" ")) {
        		idx = 0;
        	// 짝수
        	}else if(idx % 2 == 0) {
        		sArr[i] = sArr[i].toUpperCase();
        		idx++;
        	// 홀수
        	}else {
        		sArr[i] = sArr[i].toLowerCase();
        		idx++;
        	}
        	answer += sArr[i];
        }
        
        return answer;
    }
}
