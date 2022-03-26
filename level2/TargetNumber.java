package level2;

/**
 * 2022-03-26
 * 알고리즘 : DFS/BFS
 * 프로그래머스 level2 : 타겟 넘버
 */
public class TargetNumber {
    // 전역 변수
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        TargetNumber st = new TargetNumber();
        System.out.println(st.solution(numbers, target));
    }
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    /*
        dfs 재귀 함수
        - numbers : 정수 배열
        - target : 타겟 넘버
        - idx : 현태 위치
        - sum : 합계
    */
    public void dfs(int[] numbers, int target, int idx, int sum){
        // numbers.length까지 탐색이 끝났을 때
        if(idx == numbers.length){
            if(sum == target){  // 합계가 타겟넘버와 같을 때 answer를 증가
                answer++;
            }else { // 합계가 타겟넘버와 같지 않으면 그냥 종료
                return;
            }
        }else {  // 탐색 중이라면
            // numbers[idx] 값을 기존 sum에 더하면서 탐색
            dfs(numbers, target, idx+1, sum + numbers[idx]);
            // numbers[idx] 값을 기존 sum에서 빼면서 탐색
            dfs(numbers, target, idx+1, sum - numbers[idx]);
        }

    }
}
