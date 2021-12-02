package level1.selectAndSum;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 2021-12-02
 * 프로그래머스 level1 : 두 개 뽑아서 더하기
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] numbers = {2, 1, 3, 4, 1};
		int[] numbers2 = {5, 0, 2, 7};
		System.out.println(Arrays.toString(st.solution(numbers)));
		System.out.println(Arrays.toString(st.solution(numbers2)));
	}
	
	public int[] solution(int[] numbers) {
        int[] answer = {};
        // 중복을 제거하고 정렬해서 담을 TreeSet 객체
        Set<Integer> set = new TreeSet<Integer>(); 
        
        // 순차적으로 더해서 set에 저장 
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        // answer를 set의 길이만큼 초기화
        answer = new int[set.size()];
        // answer의 인덱스로 사용하기 위한 변수
        int idx = 0;
        // answer에 set값 저장
        for(Integer result : set) {
        	answer[idx] = result;
        	idx++;
        }
        
        return answer;
    }
}
