package level1.year2016;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 2011-12-01
 * 프로그래머스 level1 : 2016년
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution(3, 3));
		System.out.println(st.solution2(5, 24));
	}
	
	public String solution(int a, int b) {
        String answer = "";
        // 2016년 1월 1일은 금요일이므로 금요일부터 순서대로 요일을 담기
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 1~12월까지 각 월의 일수 담기
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 모든 날수를 더한 값을 저장할 변수
        int sumDate = 0;
        
        // a = 5라면 1~4월까지 일수를 더해주고 후에 b만큼 더해줘야 5월 b일까지의 일수가 나온다.
        for(int i=0; i<a-1; i++) {
        	sumDate += date[i];
        }
        
        // a-1까지 더한 일수에 b-1만큼의 일수를 더 해주기
        // b-1 : 1월 1일부터 시작이므로 1을 빼줘야 함 
        sumDate += b-1;
        // 모든 일수를 7로 니눴을 때의 나머지(0~6)을 day의 인덱스에 넣어서 요일을 꺼낸다.
        System.out.println(sumDate % 7);
        answer = day[sumDate % 7];
        
        return answer;
    }
	
	public String solution2(int a, int b) {
        String answer = "";
        // 요일을 담은 배열
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        // 연/월/일을 파라미터로 받아 2016-a-b 식으로 리턴 해줌
        LocalDate fullYear = LocalDate.of(2016, a, b);
        // 2016-a-b의 요일을 리턴 해줌 -> ex) monday, tuesday
        DayOfWeek dayStr = fullYear.getDayOfWeek();
        // 해당 요일을 월요일 ~ 일요일까지 1 ~ 7로 리턴
        int dayNum = dayStr.getValue();
        System.out.println(dayNum);
        
        // day배열의 인덱스에 맞추기 위해 dayNum에 -1을 해준다.
        // dayNum = 1(monday), day[0] = "MON"
        answer = day[dayNum - 1];
        
        return answer;
    }
}
