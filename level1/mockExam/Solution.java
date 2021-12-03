package level1.mockExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2021-12-03 
 * 프로그래머스 level1 : 모의고사
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] answers = {1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2};
		System.out.println(Arrays.toString(st.solution(answers)));
		int[] answers2 = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		System.out.println(Arrays.toString(st.solution(answers2)));
	}
	
	public int[] solution(int[] answers) {
        int[] answer = {};
        // 수포자1,2의 규칙을 초기화 할 변수
        int num = 1;
        // 수포자마다 정답을 찍는 규칙대로 배열 세팅
        int[] suposa1 = new int[answers.length];
        for(int i=0; i<answers.length; i++) {
        	suposa1[i] = num;
        	num++;
        	if(num > 5) {
        		num = 1;
        	}
        }
        
        int[] suposa2 = new int[answers.length];
        num = 1;
        for(int i=0; i<answers.length; i++) {
        	if(i % 2 == 0) {
        		suposa2[i] = 2;
        	}else {
        		if(suposa2[i] != 1) {
        			suposa2[i] = num;
        			num++;
        			if(num == 2) {
        				num = 3;
        			}
        			if(num > 5) {
        				num = 1;
        			}
        		}
        	}
        }
        
        int[] suposa3 = new int[answers.length];
        for(int i=0; i<answers.length; i++) {
        	if(i % 10 == 0 ||i % 10 == 1) {
        		suposa3[i] = 3;
        	}else if(i % 10 == 2 || i % 10 == 3) {
        		suposa3[i] = 1;
        	}else if(i % 10 == 4 || i % 10 == 5) {
        		suposa3[i] = 2;
        	}else if(i % 10 == 6 || i % 10 == 7) {
        		suposa3[i] = 4;
        	}else if(i % 10 == 8 || i % 10 == 9) {
        		suposa3[i] = 5;
        	}
        }	
        
        // 수포자마다 정답 개수를 저장할 변수
        int suposa1Cnt = 0;
        int suposa2Cnt = 0;
        int suposa3Cnt = 0;
        
        // 정답 개수 세팅
        for(int i=0; i<answers.length; i++) {
        	suposa1[i] = suposa1[i] == answers[i] ? suposa1Cnt++ : 0;
        	suposa2[i] = suposa2[i] == answers[i] ? suposa2Cnt++ : 0;
        	suposa3[i] = suposa3[i] == answers[i] ? suposa3Cnt++ : 0;
        }
        
        // 최대 값(최대 개수) 찾기
        int max = Math.max(Math.max(suposa1Cnt, suposa2Cnt), suposa3Cnt);
        
        // 가장 많은 정답을 맞춘 수포자를 저장할 ArrayList 객체
        List<Integer> result = new ArrayList<Integer>();
        // 가장 많은 정답을 맞춘 수포자 result에 담기
        if(max == suposa1Cnt) result.add(1);
        if(max == suposa2Cnt) result.add(2);
        if(max == suposa3Cnt) result.add(3);
        
        // 만약, 정답 개수가 같으면 오름차순으로 정렬
        Collections.sort(result);
        
        // answer를 result의 길이로 초기화
        answer = new int[result.size()];
        // answer에 담기
        for(int i=0; i<result.size(); i++) {
        	answer[i] = result.get(i);
        }
        
        return answer;
    }
}
