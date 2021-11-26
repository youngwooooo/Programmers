package level1.stringDesc;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("Zbcdefg"));
	}
	
	public String solution(String s) {
        String answer = "";
        
        // list에 s를 숫자로 변환하여 저장
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<s.length(); i++) {
        	int sInt = s.charAt(i);
        	list.add(sInt);
        }
        
        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i=0; i<list.size(); i++) {
        	int sInt = list.get(i);
        	char ch = (char) sInt;
        	answer += ch;
        }
        
        return answer;
    }
}
