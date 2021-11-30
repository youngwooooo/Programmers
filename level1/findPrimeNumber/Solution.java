package level1.findPrimeNumber;

import java.util.Arrays;

/**
 * 2021-11-30
 * 프로그래머스 level1 : 소수 찾기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(10));
	}
	
	public int solution(int n) {
        int answer = 0;
        // 정수와 배열의 순서를 맞추기 위함
        /* 1은 소수가 아니고 2~n의 수를 활용할 것이기 때문
         * int n = 2, 3, 4, 5, 6, 7, 8, 9, 10 -> 2부터 비교 시작
         * boolean[] arr = {0, 0, 2, 3, 4, 5, 6, 7, 8, 9, 10} -> arr[2]부터 비교 시작
         */
        boolean[] arr = new boolean[n+1];
        
        // arr[2] ~ arr[10]까지 true로 변환(숫자가 존재한다는 것을 알기 위함)
        for(int i=2; i<=n; i++) {
        	if(!arr[i]) {
        		arr[i] = true;
        	}
        }
        // 풀이 방법 : <에라토스테네스의 체 알고리즘>
        // n의 제곱근
        int root = (int) Math.sqrt(n);
        // 소수를 찾아 arr의 인덱스 값을 false로 바꾸기
        for(int i=2; i<=root; i++) {
        	if(arr[i]) {
        		for(int j=i; j*i<=n; j++) {
        			arr[i*j] = false;
        		}
        	}
        }	
        System.out.println(Arrays.toString(arr));
        // 소수일 때 answer의 값을 1씩 증가
        for(int i=2; i<=n; i++) {
        	if(arr[i]) {
        		answer++;
        	}
        }
        
        return answer;
    }
}
