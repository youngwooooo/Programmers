package level1.cantFinishPlayer;

import java.util.HashMap;
import java.util.Map;

/**
 * 2021-12-03
 * 프로그래머스 level1 : 완주하지 못한 선수
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(st.solution(participant, completion));
	}
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 선수의 이름을 key로 수를 value로 저장할 HashMap 객체
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        // 마라톤 총 인원을 map에 저장
        for(String part : participant) {
        	// 동명이인이 있을 때(키가 중복될 때), 해당 동명이인의 value에 1을 더해준다
        	if(map.get(part) != null) {
        		map.put(part, map.get(part) + 1);
        	// 동명이인이 없을 때, value = 1
        	}else {
        		map.put(part, 1);
        	}
        }
        
        // 완주한 인원을 map에 저장
        for(String com : completion) {
        	// 완주한 인원은 value애 1을 빼기
        	map.put(com, map.get(com) - 1);
        }
        // 여기까지 정리했을 때 완주한 인원의 value = 0, 완주하지 못한 인원의 value = 1
        
        // 완주하지 못한 인원(value = 0)을 answer에 저장
        for(String key : map.keySet()) {
        	if(map.get(key) != 0) {
        		answer = key;
        	}
        }
        
        return answer;
    }
}
