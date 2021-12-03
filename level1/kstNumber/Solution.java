package level1.kstNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(st.solution(array, commands));
	}
	public int[] solution(int[] array, int[][] commands) {
		// answer 초기화
        int[] answer = new int[commands.length];
        // i부터 j까지 자른 수를 저장할 ArrayList 객체 생성
        List<Integer> list = new ArrayList<Integer>();
        
        // array에서 가져올 값의 인덱스와 맞추기 위해 모두 -1씩 해준다
        for(int a=0; a<commands.length; a++) {
    		int i = commands[a][0] - 1;
    		int j = commands[a][1] - 1;
    		int k = commands[a][2] - 1;
    		
    		// array의 i부터 j까지의 값을 list에 저장
    		for(int b=i; b<=j; b++) {
    			list.add(array[b]);
    		}
    		// list 오름차순 정렬
    		Collections.sort(list);
    		// answer에 list의 k번째 값을 저장
    		answer[a] = list.get(k);
    		// list 비우기
    		list.clear();
        }
        
        return answer;
    }
}
