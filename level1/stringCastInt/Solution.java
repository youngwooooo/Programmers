package level1.stringCastInt;

/**
 * 2021-11-21 
 * 프로그래머스 level1 : 문자열을 정수로 바꾸기
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("-1234"));
	}
	
	public int solution(String s) {
        return Integer.parseInt(s);
    }
}
