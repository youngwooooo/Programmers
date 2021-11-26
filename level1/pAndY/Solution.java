package level1.pAndY;

/**
 * 2021-11-26 
 * 프로그래머스 level1 : 문자열 내 p와 y의 개수
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("sss"));
		System.out.println(st.solution("pPoooyY"));
		System.out.println(st.solution("Pyy"));
	}
	
	boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        
        String[] sArr = s.split("");
        for(int i=0; i<sArr.length; i++) {
        	if(sArr[i].equalsIgnoreCase("p")) {
        		pCnt++;
        	}else if(sArr[i].equalsIgnoreCase("y")) {
        		yCnt++;
        	}
        }
        
        if(pCnt == yCnt || pCnt == 0 && yCnt == 0) {
        	return answer;
        }else {
        	answer = false;
        	return answer;
        }
    }
}
