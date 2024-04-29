package inflearn.reTest.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class step06re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] num = new String[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.next();
        }
        for (int i: solution(num, n)) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> solution(String[] num, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            StringBuilder sb = new StringBuilder();
            int tmp = Integer.parseInt(String.valueOf(sb.append(num[i]).reverse()));
            if(tmp == 1) continue;
            for (int j = 2; j < tmp; j++) {
                if(tmp % j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) arr.add(tmp);
        }
        return arr;
    }
}
