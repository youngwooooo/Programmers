package level1.evenOdd;

/**
 * 2021-11-20
 * ���α׷��ӽ� level1 : ¦���� Ȧ��
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution2(1423));
	}
	
	public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0) {
        	answer = "Even";
        }else {
        	answer = "Odd";
        }
        
        return answer;
    }
	
	public String solution2(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
}
