package level1.stringSortMine;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2021-11-30
 * 프로그래머스 level1 : 문자열 내 마음대로 정렬하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] strings = {"sun", "bed", "car"};
		System.out.println(Arrays.toString(st.solution(strings, 1)));
	}
	
	public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 순서를 유지
				if(o1.charAt(n) > o2.charAt(n)) {
					return 1;
				// 사전순으로 정렬
				}else if(o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				// 앞, 뒤 인자를 바꾸기
				}else {
					return -1;
				}
			}
		});
        
        return strings;
    }
}
