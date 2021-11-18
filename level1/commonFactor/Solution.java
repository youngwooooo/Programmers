package level1.commonFactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * 2021-11-18 
 * 프로그래머스 leve1 : 최대공약수와 최소공배수
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] result = st.solution(1, 1);
		System.out.println(Arrays.toString(result));
		
	}
	
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // n의 약수를 담을 List
        List<Integer> nArr = new ArrayList<Integer>();
        // m의 약수를 담을 List
        List<Integer> mArr = new ArrayList<Integer>();
        // n과 m의 중복된 약수를 담을 List
        List<Integer> sameArr = new ArrayList<Integer>();
        
        // n의 약수 구하기
        for(int i=1; i<=n; i++) {
        	if(n % i == 0) {
        		nArr.add(i);
        	}
        }
        // m의 약수 구하기
        for(int i=1; i<=m; i++) {
        	if(m % i == 0) {
        		mArr.add(i);
        	}
        }
        // n과 m의 중복된 약수 구하기
        for(int i=0; i<nArr.size(); i++) {
        	for(int j=0; j<mArr.size(); j++) {
        		if(nArr.get(i).equals(mArr.get(j))) {
        			sameArr.add(nArr.get(i));
        		}
        	}
        }
        // n과 m의 중복을 제거한 약수를 담을 TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.addAll(nArr);
        ts.addAll(mArr);
        
        // 최대공약수
        int gcf = Collections.max(sameArr);
        answer[0] = gcf;
        // 최소공배수 : (n*m) / 최대공약수
        int lcm = (n*m) / gcf;
        answer[1] = lcm;
        
        return answer;
    }
}
