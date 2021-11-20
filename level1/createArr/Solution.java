package level1.createArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2021-11-20
 * 프로그래머스 level1 : 자연수 뒤집어 배열로 만들기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(Arrays.toString(st.solution(12345)));
	}
	
	public int[] solution(long n) {
		// String으로 변환
		String nStr = String.valueOf(n);
		// String[]에 저장
		String[] nStrArr = nStr.split("");
		int[] answer = new int[nStrArr.length];
		
		// String[]의 값을 역순으로 list에 저장
		List<String> list = new ArrayList<String>();
		for(int i=nStrArr.length-1; i>=0; i--) {
			list.add(nStrArr[i]);
		}
		// list의 값을 int로 형변환하여 answer에 저장
		for(int i=0; i<list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
		
        
        return answer;
    }
}
