package level1.xAndN;
/**
 * 2021-11-13
 * �̿���
 * ���α׷��ӽ� level1 : x��ŭ ������ �ִ� n���� ���� 
 */
public class Solution {
	public static void main(String[] args) {
		// ��� Ȯ���� ����
		Solution xn = new Solution();
		long[] resultArr = xn.solution(10, 3);
		
		for(int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
		
	}
	 public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = num * (i+1);
        	
        }
        
        return answer;
	 }
}
