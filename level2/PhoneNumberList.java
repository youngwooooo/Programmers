package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2022-03-24
 * 알고리즘 : 해시
 * 프로그래머서 level2 : 전화번호 목록
 */
public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        PhoneNumberList st = new PhoneNumberList();
        System.out.println(st.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // for문을 활용한 방법
        /*Arrays.sort(phone_book); // 오름차순 정렬

        // startsWith()를 사용해 접두어가 맞는지 확인
        for(int i=0; i<phone_book.length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }*/

        // hash를 활용한 방법
        Map<String, Integer> map = new HashMap<>();

        // map에 담기
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }

        // substring()으로 key가 존재하는지 확인
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
