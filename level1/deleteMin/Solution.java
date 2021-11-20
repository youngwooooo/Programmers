package level1.deleteMin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2021-11-20 
 * ���α׷��ӽ� level1 : ���� ���� �� �����ϱ� 
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {4,10,1};
		System.out.println(Arrays.toString(st.solution(arr)));
	}
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        // Collection�� ����ϱ� ���� List
        List<Integer> list = new ArrayList<Integer>();
        
        if(arr.length == 1) {
        	// ���̰� 1�� ��, answer�� ���̴� arr�� ���̿� �����ϰ� -1�� ��� ����
        	answer = new int[arr.length];
        	answer[0] = -1;
        }else {
        	// ���̰� 1�� �ƴ� ��, �ּҰ��� ���� ������ answer�� ���̴� arr�� ���� -1 
        	answer = new int[arr.length-1];
        	// list�� answer ���
        	for(int i=0; i<arr.length; i++) {
        		list.add(arr[i]);
        	}
        	
        	// �ּҰ� 
        	int min = Collections.min(list);
        	// �ּҰ��� index
        	int minIdx = list.indexOf(min);
        	// �ּҰ� ����
        	list.remove(minIdx);
        	
        	// answer�� ���
        	for(int i=0; i<list.size(); i++) {
        		answer[i] += list.get(i);
        	}
        	
        }
        
        return answer;
    }
}
