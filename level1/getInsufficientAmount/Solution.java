package level1.getInsufficientAmount;

/**
 * 2021-12-01 
 * 프로그래머스 level1 : 부족한 금액 계산하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(1, 1, 1));
	}
	
	public long solution(int price, int money, int count) {
        long answer = -1;
        long charge = 0;
        
        for(int i=1; i<=count; i++) {
        	charge += price * i;
        }
        
        if(charge > money) {
        	answer = charge - money;
        }else if(charge < money || charge == money){
        	answer = 0;
        }
        
        return answer;
    }
}
