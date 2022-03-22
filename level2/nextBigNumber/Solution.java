package level2.nextBigNumber;

/**
 * 2021-03-22
 * 프로그래머스 Level2 : 다음 큰 숫자
 */
public class Solution {
    public static void main(String[] args) {
        Solution st = new Solution();
        System.out.println(st.solution(78));
    }

    public int solution(int n) {
        int answer = 0;
        // Integer.bitCount(int i) : i를 2진수로 바꾼 값의 1의 개수를 세어준다.
        int cnt1 = Integer.bitCount(n);

        /*
            1. n을 증가
            2. 증가된 n을 2진수로 바꾼 값의 1의 개수 구하기 = cnt2
            3. cnt1과 cnt2가 같아지면 answer에 증가된 n을 담고 끝내기
        */
        while (true){
            n++;
            int cnt2 = Integer.bitCount(n);
            if(cnt1 == cnt2){
                answer = n;
                break;
            }
        }

        return answer;
    }
}
