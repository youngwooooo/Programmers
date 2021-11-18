package level1.xAndN;
/**
 * 2021-11-13
 * 이영우
 * 프로그래머스 level1 : x만큼 간격이 있는 n개의 숫자 
 */
public class Solution {
	public static void main(String[] args) {
		// 결과 확인을 위함
		Solution xn = new Solution();
		long[] resultArr = xn.solution(10, 3);
		
		for(int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
		
	}
	 public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = num * (i+1);
        	
        }
        
        return answer;
	 }
}
