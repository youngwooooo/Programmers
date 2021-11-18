package level1.harshadNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * 2021-11-18 
 * 프로그래머스 level1 : 하샤드 수
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int x = 12;
		System.out.println(st.solution(x));
	}
	
	public boolean solution(int x) {
        boolean answer = true;
        
        // x = 12 -> 1+2 = 12
        String str = String.valueOf(x);
        char[] chArr = str.toCharArray();
        int sum = 0;
        
        for(int i=0; i<chArr.length; i++) {
        	String strCh = String.valueOf(chArr[i]);
        	int intCh = Integer.parseInt(strCh);
        	sum += intCh;
        }
        
        int harshad = x % sum;
        
        if(harshad == 0) {
        	return answer;
        }else {
        	answer = false;
        	return answer;
        }	
    }
	
//	public boolean solution(int x) {
//        boolean answer = true;
//        
//        // x = 12 -> 1+2 = 12
//        String[] str = String.valueOf(x).split("");
//        int sum = 0;
//        
//        for(int i=0; i<str.length; i++) {
//        	sum += Integer.parseInt(str[i]);
//        }
//        
//        int harshad = x % sum;
//        
//        if(harshad == 0) {
//        	return answer;
//        }else {
//        	answer = false;
//        	return answer;
//        }
//    }
}
