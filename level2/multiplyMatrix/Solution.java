package level2.multiplyMatrix;

import java.util.Arrays;

/**
 * 2021-12-10
 * 프로그래머스 level2 : 행렬의 곱셈
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		// 3X2 행렬
		int[][] arr1 = {
				{1, 4}, 
				{3, 2}, 
				{4, 1}
		};
		// 2X2 행렬
		int[][] arr2 = {
				{3, 3},
				{3, 3}
		};
		
		// 앞 행렬의 열의 개수와 뒤 행렬의 행의 개수가 같아야 곱할 수 있다.
		// 행렬의 곱 = (3X2)(2X2)
		System.out.println(st.solution(arr1, arr2));
	}
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		// new int[arr1 행의 수][arr2 열의 수]
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // arr1 행의 개수
        for(int i=0; i<arr1.length; i++) {
        	// arr2 열의 개수
        	for(int j=0; j<arr2[0].length; j++) {
        		// arr1 열의 개수 or arr2 행의 개수
        		for(int k=0; k<arr1[0].length; k++) {
        			// answer[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0];
        			answer[i][j] += arr1[i][k] * arr2[k][j];
        		}
        	}
        }
        
        System.out.println(Arrays.deepToString(answer));
        
        return answer;
    }
}
