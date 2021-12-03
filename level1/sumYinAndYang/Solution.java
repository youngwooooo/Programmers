package level1.sumYinAndYang;

/**
 * 2021-12-03
 * 프로그래머스 level1 : 음양 더하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		System.out.println(st.solution(absolutes, signs));
	}
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++) {
        	answer = signs[i] == true ? answer + absolutes[i] : answer - absolutes[i];
        }
        
        return answer;
    }
}
