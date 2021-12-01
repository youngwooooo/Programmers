package level1.minRectangle;

/**
 * 2021-12-01 
 * 프로그래머스 level1 : 최소직사각형
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(st.solution(sizes));
	}
	
	public int solution(int[][] sizes) {
        int answer = 0;
		
        // 	세로의 길이가 가로 길이보다 크면 서로 자리를 바꾸기
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][1] > sizes[i][0]) {
        		int temp = sizes[i][1];
        		sizes[i][1] = sizes[i][0];
        		sizes[i][0] = temp;
        	}
        }
        
        // 가로 최대 길이
        int wMax = sizes[0][0];
        // 세로 최대 길이
        int lMax = sizes[0][1];
        
        // 가로, 세로 최대값 세팅
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][0] > wMax) {
        		wMax = sizes[i][0]; 
        	}
        	if(sizes[i][1] > lMax) {
        		lMax = sizes[i][1]; 
        	}
        }
        
        // 가로, 세로의 최대값의 곱
        answer = wMax * lMax;
        
        return answer;
    }
}
