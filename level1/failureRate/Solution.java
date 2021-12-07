package level1.failureRate;

import java.util.HashMap;
import java.util.Map;

/**
 * 2021-12-07
 * 프로그래머스 level1 : 실패율
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(st.solution(N, stages));
	}
	
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // key : 스테이지 , value : 실패율을 담을 HashMap 객체
        Map<Integer, Double> hs = new HashMap<Integer, Double>();
        
        for(int i=1; i<=N; i++) {
        	int stage = i;				// 스테이지
        	int noClearPlayer = 0;		// 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
        	int stageReachedPlayer = 0;	// 스테이지에 도달한 플레이어 수
        	
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j] == stage) noClearPlayer++;
        		if(stages[j] >= stage) stageReachedPlayer++;
        	}
        	
        	// 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        	// 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0
        	double fail = 0;
        	if(noClearPlayer != 0 && stageReachedPlayer != 0) {
        		fail = (double) noClearPlayer / stageReachedPlayer;
        	}
        	
        	// HashMap에 담기(key : 스테이지, value : 실패율)
        	hs.put(stage, fail);
        	
        }
        System.out.println(hs);
        
        // key를 내림차순으로 answer에 담기
        for(int i=0; i<answer.length; i++) {
        	// 실패율이 0인 것이 있기 때문에 -1
        	double temp = -1;
        	// 가장 큰 value를 가진 key
            int maxKey = 0;
            
            // 비교하여 자신보다 큰 key값 리턴하기
        	for(Integer key : hs.keySet()) {
        		if(temp < hs.get(key)) {
        			temp = hs.get(key);
        			maxKey = key;
        		}
        	}
        	// answer에 key값 저장
        	answer[i] = maxKey;
        	// maxKey값 제거
        	hs.remove(maxKey);
        }
        
        return answer;
    }
}
