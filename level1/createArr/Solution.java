package level1.createArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2021-11-20
 * ���α׷��ӽ� level1 : �ڿ��� ������ �迭�� �����
 */
public class Solution {
	// ��� Ȯ���� ����
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(Arrays.toString(st.solution(12345)));
	}
	
	public int[] solution(long n) {
		// String���� ��ȯ
		String nStr = String.valueOf(n);
		// String[]�� ����
		String[] nStrArr = nStr.split("");
		int[] answer = new int[nStrArr.length];
		
		// String[]�� ���� �������� list�� ����
		List<String> list = new ArrayList<String>();
		for(int i=nStrArr.length-1; i>=0; i--) {
			list.add(nStrArr[i]);
		}
		// list�� ���� int�� ����ȯ�Ͽ� answer�� ����
		for(int i=0; i<list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
		
        
        return answer;
    }
}
