package level1.keypad;

/**
 * 2021-12-05
 * 프로그래머스 level1 : 키패드 누르기
 */
public class Solution {
	//결과를 확인하기 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		System.out.println(st.solution(numbers, hand));
	}
	
	public String solution(int[] numbers, String hand) {
        String answer = "";
        // 왼손으로 누른 숫자
        // 왼손은 처음에 *부터 시작 -> *을 10으로 치환
        int leftFinger = 10;
        // 오른손으로 누른 숫자
        // 오른손은 처음에 #부터 시작 -> #을 12로 치환
        int rightFinger = 12;
        	
        for(int i=0; i<numbers.length; i++) {
        	// 1, 4, 7은 왼손으로 누름
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		leftFinger = numbers[i];
        	// 3, 6, 9는 오른손으로 누름
        	}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		rightFinger = numbers[i];
        	// 2, 5, 8, 0	
        	}else {
        		// 왼손에서 누를 숫자까지의 길이
        		int leftLength = getLength(leftFinger, numbers[i]);
        		// 오른손에서 누를 숫자까지의 길이
        		int rightLength = getLength(rightFinger, numbers[i]);
        		
        		if(leftLength < rightLength) {
        			answer += "L";
        			leftFinger = numbers[i];
        		}else if(leftLength > rightLength) {
        			answer += "R";
        			rightFinger = numbers[i];
        		// leftLength == rightLength
        		}else {
        			// 왼손잡이면 왼손
        			if(hand.equals("left")) {
        				answer += "L";
        				leftFinger = numbers[i];
        			// 오른손잡이면 오른손
        			}else {
        				answer += "R";
        				rightFinger = numbers[i];
        			}
        		}
        	}
        }
        
        return answer;
    }
	
	// 누를 숫자까지의 길이를 리턴해주는 함수
	public int getLength(int finger, int number) {
		// 키패드 0을 11로 치환
		if(finger == 0) finger = 11;
		if(number == 0) number = 11;
		
		// 현재 손가락이 누른 버튼의 x,y 좌표
		int x = (finger - 1) / 3;
		int y = (finger - 1) % 3;
		// 눌러야할 숫자의 x,y좌표
		int pushX = number / 3;
		int pushY = 1;
		
		// Math.abs() : 절대값 구하기
		// 두 수중에 어떤 수가 클지 모르기 때문에 절대값으로 -없이 구해서 계산
		return Math.abs(pushX - x) + Math.abs(pushY - y);
	}
}
