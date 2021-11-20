package level1.desc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 2021-11-20
 * 프로그래머스 level1 : 정수 내림차순으로 배치하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(8000000000L));
	}
	
	public long solution(long n) {
        long answer = 0;
        
        // String으로 형변환
        String nStr = String.valueOf(n);
        // String[]에 담기
        String[] nStrArr = nStr.split("");
        
        // Collection 활용을 위한 List
        List<String> list = new ArrayList<String>();
        for(String s : nStrArr) {
        	list.add(s);
        }
        
        // 내림차순으로 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        // 결과를 String에 담기
        String answerStr = "";
        for(String s : list) {
        	answerStr += s;
        }
        
        // Long으로 형변환
        answer = Long.parseLong(answerStr);
        
        return answer;
    }
}
