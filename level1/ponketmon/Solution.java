package level1.ponketmon;

import java.util.HashSet;
import java.util.Set;

/**
 * 2021-12-05
 * 프로그래머스 level1 : 폰켓몬
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = {3,3,3,2,2,2};
		System.out.println(st.solution(nums));
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        // 내가 선택할 수 있는 폰켓몬 수
        int getCount = nums.length / 2;
        // 폰켓몬 종류 번호를 담을 HashSet
        Set<Integer> ponketmonKinds = new HashSet<Integer>();
        
        // nums를 중복없이 HashSet에 저장
        for(Integer ponketmon : nums) {
        	ponketmonKinds.add(ponketmon);
        }
        
        System.out.println(ponketmonKinds);
        
        // 폰켓몬 종류가 선택할 수 있는 폰켓몬 수보다 크면 선택할 수 있는 폰켓몬 수를 리턴
        // -> 선택할 수 있는 폰켓몬 수가 2이면 아무리 폰켓몬 종류가 많다해도 2개밖에 선택할 수 없음
        // ex {1, 2, 3, 4} -> {1,2} {1,3} {1,4} .... {3,4}
        if(getCount <= ponketmonKinds.size()) {
        	answer = getCount;
        // 폰켓몬 종류가 선택할 수 있는 폰켓몬 수보다 작으면 폰켓몬 종류를 리턴
        // -> 선택할 수 있는 폰켓몬 수가 3이면 같은 포켓몬을 중복해서 뽑을 수 밖에 없음
        //    즉, 가장 많은 종류의 폰켓몬을 선택하는 방법은 폰켓몬의 종류다.
        // ex) {3,3,3,2,2,2} -> {3,3,2} {2,2,3}
        }else {
        	answer = ponketmonKinds.size();
        }
        
        return answer;
    }
}
