package level1.dartGame;

/**
 * 2021-12-07
 * 프로그래머스 leve1 : 다트 게임
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("1S2D*3T"));
	}
	
	public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int idx = 0;
        String temp	 = "";
        
        char[] chArr = dartResult.toCharArray();
        for(int i=0; i<chArr.length; i++) {
        	// 1. chArr[i]가 0 ~ 9 일 때
        	if(chArr[i] >= '0' && chArr[i] <= '9') {
        		// 1-1. temp에 문자열 하나씩 더해주기
        		temp += String.valueOf(chArr[i]);
        	// 2. chArr[i] 가 S, D, T 일 때	
        	}else if(chArr[i] == 'S' || chArr[i] == 'D' || chArr[i] == 'T') {
        		// 2-1. temp를 int로 변환
        		int s = Integer.parseInt(temp);
        		
        		// 2-2. 식 계산
        		if(chArr[i] == 'S') s = (int) Math.pow(s, 1);
        		if(chArr[i] == 'D') s = (int) Math.pow(s, 2);
        		if(chArr[i] == 'T') s = (int) Math.pow(s, 3);
        		
        		// 2-3. score[idx]에 s 저장
        		score[idx] = s;
        		// 2-4. 저장 후 idx 증가
        		idx++;
        		// 2-5. temp 비우기
        		temp = "";
        	
        	// 3. 나머지
        	}else {
        		// 3-1. chArr[i]가 * 일 때
        		if(chArr[i] == '*') {
        			// 3-1-1. 해당 점수에 *2
        			score[idx-1] *= 2;
        			// 3-1-2. 이전 점수에 *2
        			if(idx-2 >= 0) {
        				score[idx-2] *= 2;
        			}
        		// 3-2. chArr[i]가 # 일 때
        		}else {
        			// 해당 점수에 *-1
        			score[idx-1] *= -1;
        		}
        	}
        }
        
        // 4. answer에 score 값 다 더해서 저장
        for(int i=0; i<score.length; i++) {
        	answer += score[i];
        }
        
        return answer;
    }
	
}
