package level1.squareRoot;

/**
 * 2021-11-20 
 * ���α׷��ӽ� level1 : ���� ������ �Ǻ�
 */
public class Solution {
	// ��� Ȯ���� ����
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(10));
	}
	
	public long solution(long n) {
        long answer = 0;
        // Math.sqrt(n) : ��Ʈ n
        for(long i=1; i<=Math.sqrt(n); i++) {
        	if(n % i == 0) {
        		// Math.pow(a, b) : a�� b����
        		answer = Math.pow(i, 2) == n ? (long)Math.pow((i+1), 2): -1;
        	}
        }
        
        return answer;
    }
}
