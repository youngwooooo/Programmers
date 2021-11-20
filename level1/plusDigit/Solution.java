package level1.plusDigit;

/**
 * 2021-11-20 
 * 프로그래머스 level1 : 자릿수 더하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(123));
	}
	
	public int solution(int n) {
        int answer = 0;
        // String으로 형변환
        String nStr = String.valueOf(n);
        // String[]에 담기
        String[] nStrArr = nStr.split("");
        // int로 형변환해서 answer에 더해주기
        for(int i=0; i<nStrArr.length; i++) {
        	answer += Integer.parseInt(nStrArr[i]);
        }
        
        return answer;
    }
}
