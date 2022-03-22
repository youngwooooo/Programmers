package level2.ddang;

/**
 * 2022-03-22
 * 프로그래머스 level2 : 땅따먹기
 */
public class Solution {
    // 결과 확인을 위함
    public static void main(String[] args) {
        Solution st = new Solution();
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 100}, {4, 3, 2, 1}};
        System.out.println(st.solution(land));
    }

    int solution(int[][] land) {
        int answer = 0;
        // 테스트 성공, 제출 실패
        /*int max = -1;
        int idx = -1;

        // land[0][0] ~ land[0][i]의 최대값과 최대값의 인덱스 구하기
        for(int i=0; i<land[0].length; i++) {
            if(max < land[0][i]) {
                max = land[0][i];
                System.out.println("max : " + max);
                idx = i;
            }
        }
        // answer에 max 값 저장
        answer += max;
        System.out.println("answer : " + answer);
        // max를 0으로 초기화
        max = -1;

        // land[1][j] ~ land[i][j]의 최대값과 최대값의 인덱스 구하기
        for(int i=1; i<land.length; i++) {
            for(int j=0; j<land[i].length; j++) {
                // 최대값 인덱스의 값을 0으로 변환
                land[i][idx] = 0;
                if(max < land[i][j]) {
                    max = land[i][j];
                    idx = j;
                }
            }
            answer += max;
            max = -1;
        }*/

        // 테스트 성공, 제출 성공
        /*System.out.println("land[0][0] : "  + land[0][0]);
        System.out.println("land[0][1] : "  + land[0][1]);
        System.out.println("land[0][2] : "  + land[0][2]);
        System.out.println("land[0][3] : "  + land[0][3]);
        System.out.println("=======================================");*/

        for(int i = 1; i < land.length; i++) {
            // 이전 행에서 현재칸을 제외한 칸의 최대값을 더함
            land[i][0] += maxScore(land[i-1][1], land[i-1][2], land[i-1][3]);
            land[i][1] += maxScore(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += maxScore(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += maxScore(land[i-1][0], land[i-1][1], land[i-1][2]);

            /*System.out.println("land[" + i +"][0] : "  + land[i][0]);
            System.out.println("land[" + i +"][1] : "  + land[i][1]);
            System.out.println("land[" + i +"][2] : "  + land[i][2]);
            System.out.println("land[" + i +"][3] : "  + land[i][3]);
            System.out.println("=======================================");*/
        }

        for(int score : land[land.length - 1]){
            answer = Math.max(answer, score);
        }

        return answer;
    }

    // 각 행의 최대값을 구하기 위한 메서드
    public int maxScore(int a, int b, int c) {
        int max = 0;

        max = Math.max(Math.max(a, b), c);

        return max;
    }

}
