package inflearn.inflearn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class step10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String s = st.nextToken();
        String t = st.nextToken();

        System.out.println(findShort(s, t));
    }

    private static ArrayList<String> findShort(String s, String t) {
        ArrayList<String> answer = new ArrayList<>();
        char[] c = s.toCharArray();
        int[] left = new int[s.length()];
        int[] right = new int[s.length()];
        left[0] = 100;
        right[s.length()-1] = 100;
        int count = 0;
        for (int i = 1; i < s.length()-1; i++) {
            if(c[i] == t.charAt(0)) {
                left[i] = 0;
                continue;
            }

        }
        return null;
    }
}
