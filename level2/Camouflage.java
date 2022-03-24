package level2;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022-03-24
 * 알고리즘 : 해시
 * 프로그래머서 level2 : 위장
 */
public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}
                            , {"bluesunglasses", "eyewear"}
                            , {"green_turban", "headgear"}
                            , {"white_shirts", "t-shirts"}
                            , {"black_shirts", "t-shirts"}};
        Camouflage st = new Camouflage();
        System.out.println(st.solution(clothes));
    }
    public int solution(String[][] clothes) {
        int answer = 1; // 곱셉을 위해 1로 세팅
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1]; // 옷 종류

            if(map.get(type) != null){ // key 중복 o
                map.put(type, map.get(type) + 1); // 해당 key 값을 1 증가시킨다.
            }else { // key 중복 x
                map.put(type, 1); // 해당 key 값을 1로 설정
            }
        }

        /*
            옷을 입는 경우의 수
            - 옷 종류(옷 개수) : headgear(2), eyewear(1), t-shirts(2)
            - 계산식 : (headgear 개수 + 1) * (eyewear 개수 + 1 ) * (t-shirts 개수 + 1) - 1
            - 1을 더한 이유 : 다른 옷은 입지만 해당 옷을 입지 않았을 경우
         */
        for(String s : map.keySet()){
            answer *= map.get(s) + 1;
        }

        // 옷을 하나도 안입을 경우의 수를 빼준다.(1가지의 옷은 꼭 입어야함)
        return answer - 1;
    }
}
