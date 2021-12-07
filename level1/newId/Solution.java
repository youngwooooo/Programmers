package level1.newId;

/**
 * 2021-12-06
 * 프로그래머스 level1 : 신규 아이디 추천
 */
public class Solution {
	// 결과 확인을 위함
	public static void main(String[] args) {
		Solution st = new Solution();
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(st.solution(new_id));
		new_id = "z-+.^.";
		System.out.println(st.solution(new_id));
		new_id = "=.=";
		System.out.println(st.solution(new_id));
		new_id = "123_.def";
		System.out.println(st.solution(new_id));
		new_id = "abcdefghijklmn.p";
		System.out.println(st.solution(new_id));
	}
	
	public String solution(String new_id) {
        // 1단계 : 모든 대문자를 대응되는 소문자로 치환
        new_id = new_id.toLowerCase();
        // 2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        // 3단계 : 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");
        // 4단계 : 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // 5단계 : 빈 문자열이라면, new_id에 "a"를 대입
        new_id = new_id.length() == 0 ? "a" : new_id;
        // 6단계
        // 1) 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        // 2) 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15).replaceAll("[.]$", "") : new_id;
        // 7단계
        if(new_id.length() <= 2) {
        	while(new_id.length() < 3) {
        		new_id += new_id.substring(new_id.length()-1, new_id.length());
        	}
        }
    	
        return new_id;
    }
}
