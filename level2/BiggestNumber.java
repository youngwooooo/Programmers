package level2;

import java.util.Arrays;

/**
 * 2022-03-25
 * 알고리즘 : 정렬
 * 프로그래머스 level2 : 가장 큰 수
 */
public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {0, 0 ,0};
        BiggestNumber st = new BiggestNumber();
        System.out.println(st.solution(numbers));
    }

    public String solution(int[] numbers) {
        String answer = "";
        // 문자열로 비교하기 위한 String 배열
        String[] arr = new String[numbers.length];
        // numbers[i] == 0 일 때 개수
        int zeroCnt = 0;

        // numbers를 arr로 복사
        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
            // numbers[i] == 0일 경우 zeroCnt 증가
            if(numbers[i] == 0){
                zeroCnt++;
            }
        }

        // 0의 개수가 numbers 길이과 같을 때, 즉 배열이 0으로만 이루어졌다면 0을 리턴
        if(zeroCnt == numbers.length){
            answer = String.valueOf(0);
            return answer;
        }

        // arr를 compareTo로 o1+o2 와 o2+o1을 비교하여 큰 수를 기준으로 내림차순
        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        for(String s : arr){
            answer += s;
        }

        return answer;
    }
}
