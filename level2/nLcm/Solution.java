package level2.nLcm;

import java.util.Arrays;

/**
* 2021-12-08
* 프로그래머스 level2 : N개의 최소공배수
*/
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {2,6,8,14};
		System.out.println(st.solution(arr));
	}
	
	public int solution(int[] arr) {
		// 오름차순 정렬
		Arrays.sort(arr);
		
		// 첫 두수를 비교하기 위해 arr[0]을 answer에 저장
        int answer = arr[0];
        
        // arr[1]부터 for문을 돌린다
        for(int i=1; i<arr.length; i++) {
        	// 두 수의 최소공약수
        	int gcd = gcd(answer, arr[i]);
        	
        	// 두 수의 최소 공배수 : 두 수의 곱 / 두 수의 최소공약수
        	answer = (answer * arr[i]) / gcd;
        }
        
        return answer;
    }
	
	// 최소공약수를 구하는 함수
	public int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}
