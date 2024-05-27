package inflearn.myAlgorithmn.programmers;

import java.util.*;

public class scoville {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scoville = new int[n];
        for (int i = 0; i < n; i++) scoville[i] = sc.nextInt();
        System.out.println(solution(scoville, k));
    }

    private static int solution(int[] scoville, int k) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i: scoville) Q.add(i);
        int tmp = 0, count = 0, answer = 0;
        System.out.println(Q);
        while(Q.element() < k) {
            tmp = Q.remove() + (Q.remove() * 2);
            count ++;
            Q.add(tmp);
            if (Q.size() == 1) {
                if (Q.element() < k) return -1;
            }
        }
        answer = count;
        return answer;
    }
}
