package level2.makeMin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2021-12-10
 * 프로그래머스 level2 : 최솟값 만들기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = {1, 2};
		int[] B = {3, 4};
		System.out.println(st.solution(A, B));
	}
	
	public int solution(int []A, int []B){
        int answer = 0;
        // Collections 클래스를 활용하여 B를 내림차순 하기 위한 ArrayList 객체
        List<Integer> BList = new ArrayList<Integer>();
        // B를 BList에 담기
        for(Integer n : B) {
        	BList.add(n);
        }
        
        // A 오름차순 정렬
        Arrays.sort(A);
        // BList(B) 내림차순 정렬
        Collections.sort(BList, Collections.reverseOrder());
        
        // A의 최솟값 X B의 최대값 = 최솟값
        for(int i=0; i<A.length; i++) {
        	// 최소값들을 누적해서 answer에 저장
        	answer += A[i] * BList.get(i);
        }
        
        return answer;
    }
}
