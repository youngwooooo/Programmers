package level1.createPrimeNumber;

/**
 * 2021-12-04
 * 프로그래머스 level1 : 소수 만들기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = {1,2,7,6,4};
		System.out.println(st.solution(nums));
	}
	
	// 소수 판별을 위한 메서드
	public boolean check(int sum) {
		boolean result = true;
		// 소수는 2부터 n-1까지 나누어서 나머지가 0일 경우 소수
		for(int i=2; i<sum; i++) {
			if(sum % i == 0) {
				result = false;
			}
		}
		return result;
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			// 서로 다른 3개의 수 더하기
        			sum = nums[i] + nums[j] + nums[k];
        			// 소수 판별하여 answer 증가
        			if(check(sum)) {
        				answer++;
        			}
        		}
        	}
        }
        
        return answer;
    }
}
