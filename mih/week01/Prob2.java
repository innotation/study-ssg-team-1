package week01;

public class Prob2 {
    public int solution(int n) {
        for(int i=1;i<n;i++) {
            if ( n % i == 1 ) {
                return i;
            }
        }
        int answer = 0;
        return answer;
    }
}
