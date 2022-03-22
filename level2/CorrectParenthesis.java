package level2;

/**
 * 2022-03-22
 * 프로그래머스 level2 : 올바른 괄호
 */
public class CorrectParenthesis {
    public static void main(String[] args) {
        CorrectParenthesis st = new CorrectParenthesis();
        //System.out.println(st.solution("())()(()"));
        //System.out.println(st.solution("(())()()"));
        System.out.println(st.solution("(()))"));
    }

    boolean solution(String s) {
        boolean answer = true;

        // 첫 번째 문자가 ")" 이거나 마지막 문자가 "("인 경우 false
        if( ")".equals(String.valueOf(s.charAt(0))) || "(".equals(String.valueOf(s.charAt(s.length()-1))) ){
            answer = false;
            return answer;
        }

        int leftCnt = 0; // "(" 개수
        int rightCnt = 0; // ")" 개수
        int errorCnt = 0; // 잘못된 문자열이 들어온 경우 판단하기 위함

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if("(".equals(String.valueOf(ch))){
                leftCnt++;
            }else if(")".equals(String.valueOf(ch))){
                rightCnt++;
                // ")"의 개수가 "(" 보다 많아지면 잘못된 문자열
                if(rightCnt >  leftCnt){
                    errorCnt++;
                }
            }
        }

        if(errorCnt > 0 || leftCnt != rightCnt){
            answer = false;
            return answer;
        }

        return answer;
    }
}
