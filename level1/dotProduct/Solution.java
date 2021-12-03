package level1.dotProduct;

/**
 * 2021-12-03
 * 프로그래머스 level1 : 내적
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(st.solution(a, b));
	}
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++) {
        	answer += a[i] * b[i];
        }
        
        return answer;
    }
}
