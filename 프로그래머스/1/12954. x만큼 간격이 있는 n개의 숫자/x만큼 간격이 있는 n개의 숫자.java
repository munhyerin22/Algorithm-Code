class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(-10000000<=x && x<=10000000 && n<=1000)
        for (int i = 1; i<=n; i++) {
            answer[i-1] = (long)i*x;
        }
        return answer;
    }
}