package inflearn.myAlgorithmn.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mostNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(solution(numbers));
    }

    private static String solution(int[] numbers) {
        String answer = "";
        String[] numberStr = new String[numbers.length];

        for(int i=0;i<numbers.length;i++)
            numberStr[i] = String.valueOf(numbers[i]);

        Arrays.sort(numberStr, (s1, s2) -> (s2+s1).compareTo(s1+s2));

        for(String str: numberStr)
            answer += str;

        if(answer.charAt(0) == '0'){
            answer = "0";
        }

        return answer;
    }
}
