package level1.addMaxtirx;

import java.util.Arrays;

/**
 * 2021-11-13
 * 이영우
 * 프로그래머스 level1 : 행렬의 덧셈
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution at = new Solution();
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{4,5}};
		
		int[][] result = at.solution(arr1, arr2);
		
		System.out.println(Arrays.deepToString(result));
		
	}
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j]; 
			}
		}
        
        return answer;
    }

}
