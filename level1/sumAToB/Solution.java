package level1.sumAToB;

public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(3, 5));
		System.out.println(st.solution(3, 3));
		System.out.println(st.solution(5, 3));
	}

	public long solution(int a, int b) {
		long answer = 0;
		if (a < b || a == b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}

		return answer;
	}
}
