package inflearn.myAlgorithmn.baekjoon;

import java.util.Scanner;

public class no9342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] check = new String[n];
        for (int i = 0; i < n; i++) {
            check[i] = sc.next();
        }
        for (String s: checkInfected(check, n)) {
            System.out.println(s);
        }
    }

    private static String[] checkInfected(String[] check, int n) {
        String[] answer = new String[n];
        int count = 0;
        while(count < n) {
            char[] c = check[count].toCharArray();
            boolean flagA = true, flagF = true, flagC = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'A' || c[i] == 'B' || c[i] == 'C' || c[i] == 'D' || c[i] == 'E' || c[i] == 'F') {
                    if(i == 0) {
                        if(c[i] == 'A') flagA = false;
                        continue;
                    }
                    else if (i == c.length - 1) {
                        answer[count] = "Infected!";
                        break;
                    }
                }
                if (c[i] == 'A') {
                    flagA = false;
                    continue;
                } else if (c[i] == 'F' && !flagA) {
                    flagF = false;
                    continue;
                } else if (c[i] == 'C' && !flagF) {
                    flagC = false;
                    continue;
                }
                answer[count] = "Good";
                break;
            }
            count++;
        }

        return answer;
    }
}
