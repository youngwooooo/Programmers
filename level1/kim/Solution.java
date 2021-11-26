package level1.kim;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] seoul = {"Jane", "Kim"};
		System.out.println(st.solution(seoul));
	}
	
	public String solution(String[] seoul) {
        String answer = "";
        int idx = Arrays.asList(seoul).indexOf("Kim");
        
        answer = "김서방은 " + idx + "에 있다"; 
        
        return answer;
    }
}
