package level1.plusDigit;

/**
 * 2021-11-20 
 * ���α׷��ӽ� level1 : �ڸ��� ���ϱ�
 */
public class Solution {
	// ��� Ȯ���� ����
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(123));
	}
	
	public int solution(int n) {
        int answer = 0;
        // String���� ����ȯ
        String nStr = String.valueOf(n);
        // String[]�� ���
        String[] nStrArr = nStr.split("");
        // int�� ����ȯ�ؼ� answer�� �����ֱ�
        for(int i=0; i<nStrArr.length; i++) {
        	answer += Integer.parseInt(nStrArr[i]);
        }
        
        return answer;
    }
}
