package level1.clawCraneGame;

import java.util.Stack;

/**
 * 2021-1207
 * 프로그래머스 level1 : 크레인 인형뽑기 게임
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] board = {
							{0,0,0,0,0},
							{0,0,1,0,3},
							{0,2,5,0,1},
							{4,2,4,4,2},
							{3,5,1,3,1}
						};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(st.solution(board, moves));
	}
	
	public int solution(int[][] board, int[] moves) {
		/* moves와 board의 규칙
		 * -------------------------------------------------------------
		 * moves[0] == 1 -> board[0~4][0] -> board[0~4][moves[0] - 1]
		 * moves[1] == 2 -> board[0~4][1] -> board[0~4][moves[1] - 1]
		 * moves[2] == 3 -> board[0~4][2] -> board[0~4][moves[2] - 1]
		 * moves[3] == 4 -> board[0~4][3] -> board[0~4][moves[3] - 1]
		 * moves[4] == 5 -> board[0~4][4] -> board[0~4][moves[4] - 1]
		 * -------------------------------------------------------------
		 */

		int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<moves.length; i++) {
        	for(int j=0; j<board.length; j++) {
        		if(board[j][moves[i] - 1] != 0) {
        			// 1. stack이 비었으면
        			if(stack.isEmpty()) {
        				// 1-1. 뽑은 인형 넣기
        				stack.push(board[j][moves[i] - 1]);
        				
        			// 2. stack이 비어있지 않으면
        			}else {	
        				// 2-1. 가장 최근에 들어온 인형과 뽑아온 인형이 같을 때
        				if(stack.peek() == board[j][moves[i] - 1]) {
        					// 2-1-1. 인형 제거	
        					stack.pop();
        					// 2-1-2. 같으면 인형 2개가 사라지므로 answer 2 더하기
        					answer += 2;
        					
        				// 2-2. 가장 최근에 들어온 인형과 뽑아온 인형이 다를 때	
        				}else {
        					// 2-2-1. 인형 그대로 넣기
        					stack.push(board[j][moves[i] - 1]);
        				}
        			}
        			
        			// 3. 인형 뽑은 자리 0으로 만들기
        			board[j][moves[i] - 1] = 0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
