package level1.lottosMaxAndMin;

import java.util.Arrays;

/**
 * 2021-12-05
 * 프로그래머스 level1 : 로또의 최고 순위와 최저 순위
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		System.out.println(Arrays.toString(st.solution(lottos, win_nums)));
	}
	
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 0의 개수
        int zeroCnt = 0;
        // 당첨 번호 맞은 개수
        int matchCnt = 0;
        
        for(int i=0; i<lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zeroCnt++;
        		continue;
        	}
        	
        	for(int j=0; j<win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) {
        			matchCnt++;
        			break;
        		}
        	}
        }
        
        // 알수없는 번호(0)가 정답일 때
        answer[0] = getRank(matchCnt + zeroCnt);
        // 알수없는 번호(0)가 정답이 아닐 때
        answer[1] = getRank(matchCnt);
        
        return answer;
    }
	
	// 순위를 리턴하는 함수
	public int getRank(int num) {
		switch(num){
			case 6:
				return 1;
			case 5:
				return 2;
			case 4:
				return 3;
			case 3:
				return 4;
			case 2:
				return 5;
			default: 
				return 6;
		}
	}
}
