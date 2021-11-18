package level1.arrAvg;

/**
 * 2021-11-18 
 * 프로그래머스 level1 : 평균 구하기
 */
public class Solution {
	public static void main(String[] args) {
		Solution aa = new Solution();
		int[] arr = {1, 2, 3, 4};
		double answer = aa.solution(arr);
		System.out.println(answer);
	}
	public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        answer = sum / arr.length;     
        
        return answer;
    }
}
