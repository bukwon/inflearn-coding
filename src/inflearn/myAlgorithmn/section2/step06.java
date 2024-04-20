package inflearn.myAlgorithmn.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class step06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int a: reversedInt(s, n)) {
            System.out.print(a + " ");
        }
    }

    private static ArrayList<Integer> reversedInt(String[] s, int n) {
        int[] toInt = new int[n];
        int count = 0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(s[i]);
            toInt[i] = Integer.parseInt(sb.reverse().toString());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= toInt[i]; j++) {
                if(toInt[i] % j == 0) count ++;
            }
            if(count == 1) array.add(toInt[i]);
            count = 0;
        }
        return array;
    }
}