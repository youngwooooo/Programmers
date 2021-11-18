package level1.commonFactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * 2021-11-18 
 * ���α׷��ӽ� leve1 : �ִ������� �ּҰ����
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] result = st.solution(1, 1);
		System.out.println(Arrays.toString(result));
		
	}
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // n�� ����� ���� List
        List<Integer> nArr = new ArrayList<Integer>();
        // m�� ����� ���� List
        List<Integer> mArr = new ArrayList<Integer>();
        // n�� m�� �ߺ��� ����� ���� List
        List<Integer> sameArr = new ArrayList<Integer>();
        
        // n�� ��� ���ϱ�
        for(int i=1; i<=n; i++) {
        	if(n % i == 0) {
        		nArr.add(i);
        	}
        }
        // m�� ��� ���ϱ�
        for(int i=1; i<=m; i++) {
        	if(m % i == 0) {
        		mArr.add(i);
        	}
        }
        // n�� m�� �ߺ��� ��� ���ϱ�
        for(int i=0; i<nArr.size(); i++) {
        	for(int j=0; j<mArr.size(); j++) {
        		if(nArr.get(i).equals(mArr.get(j))) {
        			sameArr.add(nArr.get(i));
        		}
        	}
        }
        // n�� m�� �ߺ��� ������ ����� ���� TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.addAll(nArr);
        ts.addAll(mArr);
        
        // �ִ�����
        int gcf = Collections.max(sameArr);
        answer[0] = gcf;
        // �ּҰ���� : (n*m) / �ִ�����
        int lcm = (n*m) / gcf;
        answer[1] = lcm;
        
        return answer;
    }
}
