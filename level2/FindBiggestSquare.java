package level2;

/**
 * 2022-03-23
 * 프로그래머스 level2 : 가장 큰 정사각형
 */
public class FindBiggestSquare {
    public static void main(String[] args) {
        int[][] board = {
                //{0,1,1,1},
                //{1,2,1,1},
                //{1,1,1,1},
                //{0,0,1,0}
                //{0,1,1,1},
                {1},
        };
        FindBiggestSquare st = new FindBiggestSquare();
        System.out.println(st.solution(board));

    }

    public int solution(int[][] board) {
        int answer = 0;
        int side = 0; // 한 변의 길이

        // board = {1} 일 때
        if (board.length == 1 && board[0].length == 1) {
            return 1;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    int left = board[i][j - 1]; // 왼쪽
                    int leftUp = board[i - 1][j - 1]; // 왼쪽 상단
                    int up = board[i - 1][j]; // 상단
                    int min = Math.min(left, Math.min(leftUp, up)); // 최소값

                    board[i][j] = min + 1; // 현재 위치
                    side = Math.max(side, min + 1);
                }
            }
        }

        answer = side * side;

        return answer;
    }
}
