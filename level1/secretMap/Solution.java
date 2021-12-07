package level1.secretMap;

import java.util.Arrays;

/**
 * 2021-12-06
 * 프로그래머스 level1 : 비밀지도
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		System.out.println(Arrays.toString(st.solution(n, arr1, arr2)));
	}
	
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0; i<n; i++) {
        	// 값을 이진수로 바꾸기
        	String temp = Integer.toBinaryString(arr1[i]);
        	String temp2 = Integer.toBinaryString(arr2[i]);
        	// 생략된 0 추가(이진수로 바꾼 값의 맨 앞이 0이면 0이 생략됨)
        	temp = addZero(temp, n);
        	temp2 = addZero(temp2, n);
        	
        	// 이진수로 바꾼 두 변수를 더하기
        	long sumTemp = Long.parseLong(temp) + Long.parseLong(temp2);
        	// 더한 값을 String으로 변환
        	String result = String.valueOf(sumTemp);
        	
        	// 생략된 0 추가(더한 맨 앞의 수가 0이면 0이 생략됨)
        	result = addZero(result, n);
        	
        	// 정규식을 이용하여 문자가 1~9이면 #으로 치환, 0이면 공백으로 치환 
        	result = result.replaceAll("[1-9]", "#").replace("0", " ");
        	
        	// answer에 담기
        	answer[i] = result;
        }
        return answer;
    }
	
	// 생략된 0을 추가해주는 함수
	public String addZero(String str, int length) {
		if(str.length() < length) {
    		while(str.length() < length) {
    			str = "0" + str;
    		}
    	}
		
		return str;
	}
}
