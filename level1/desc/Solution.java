package level1.desc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 2021-11-20
 * ���α׷��ӽ� level1 : ���� ������������ ��ġ�ϱ�
 */
public class Solution {
	// ��� Ȯ���� ����
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(8000000000L));
	}
	
	public long solution(long n) {
        long answer = 0;
        
        // String���� ����ȯ
        String nStr = String.valueOf(n);
        // String[]�� ���
        String[] nStrArr = nStr.split("");
        
        // Collection Ȱ���� ���� List
        List<String> list = new ArrayList<String>();
        for(String s : nStrArr) {
        	list.add(s);
        }
        
        // ������������ ����
        Collections.sort(list, Collections.reverseOrder());
        
        // ����� String�� ���
        String answerStr = "";
        for(String s : list) {
        	answerStr += s;
        }
        
        // Long���� ����ȯ
        answer = Long.parseLong(answerStr);
        
        return answer;
    }
}
