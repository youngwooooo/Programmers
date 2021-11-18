package level1.blindPhoneNumber;

/**
 * 2021-11-13
 * @author 이영우
 * 프로그래머스 level1 : 핸드폰 번호 가리기
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		System.out.println(st.solution("027778888"));
	}
	
	public String solution(String phone_number) {
		String pn = phone_number.substring(phone_number.length()-4);
		
		String blind = phone_number.substring(0, phone_number.length()-4);
		blind = blind.replaceAll("[0-9]", "*");
		
        String answer = blind + pn;
        return answer;
    }
}
