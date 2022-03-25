package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2022-03-25
 * 알고리즘 : 정렬
 * 프로그래머스 level2 : H-Index
 */
public class HIndex {
    public static void main(String[] args) {
        int[] citations = {0, 0, 0};
        HIndex st = new HIndex();
        System.out.println(st.solution(citations));
    }

    public int solution(int[] citations) {
        int answer = 0;

        // citations를 list로 복사
        List<Integer> list = new ArrayList<>();
        for(Integer i : citations){
            list.add(i);
        }
        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());

        int hIndex = 0; // h-index
        for(int i=0; i<list.size(); i++){
            int citation = list.get(i);
            if(citation > hIndex){ // 인용된 논문 횟수가 h-index보다 크면
                hIndex++; // h-index 증가
            }else if(hIndex >= citation){ // h-index가 인용된 논문 횟수보다 크거나 같아지면 멈추기
                break;
            }
            answer = hIndex; // answer에 담기
        }

        return answer;
    }
}
