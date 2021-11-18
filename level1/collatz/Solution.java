package level1.collatz;

/**
 * 2021-11-18
 * ���α׷��ӽ� level1 : �ݶ��� ����
 */
public class Solution {
	public static void main(String[] args) {
		Solution st = new Solution();
		int result = st.solution(626331);
		System.out.println(result);
	}
	
	public int solution(long num) {
		int answer = 0;
        int cnt = 0;
        
        while(true) {
        	// num�� 1�̸�
        	if(num == 1) {
        		answer = 0;
        		break;
        	}
        	
        	// num�� ¦���̸�
        	if(num % 2 == 0) {
        		num = num / 2;
        		cnt++;
                
        		if(num == 1) {
        			answer = cnt;
        			break;
        		}else if(num % 2 == 1) {
        			num = num * 3 + 1;
        			cnt++;
        		}
        		
        	}
        	
        	// num�� Ȧ���̸�
        	if(num % 2 == 1) {
        		num = num * 3 + 1;
        		cnt++;
        		
        		if(num == 1) {
        			answer = cnt;
        			break;
        		}else if(num % 2 == 0) {
        			num = num / 2;
        			cnt++;
        		}
        		
        	}
        	
        	System.out.println(num);
        	
        	// 500�� �����ص� num�� 1�� �ƴ� ��
        	if(cnt > 500) {
        		if(num != 1) {
        			answer = -1;
        			break;
        		}
        	}
        }
        
        return answer;
    }	
}
