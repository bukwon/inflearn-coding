package inflearn.myAlgorithmn.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class HIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] citations = new int[n];
        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }
        System.out.println(solution(citations));
    }

    private static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int tmp =  citations.length - i;
            if (citations[i] >= tmp) {
                answer = tmp;
                break;
            }
        }
        return answer;
    }
}
