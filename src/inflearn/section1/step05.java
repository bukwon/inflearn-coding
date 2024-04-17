package inflearn.section1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class step05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (String answer: reverse(s)) {
            System.out.println(answer);
        }
    }

    static ArrayList<String> reverse(String[] s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str: s) {
            char[] c = str.toCharArray();
            String answer;
            int start = 0; int end = str.length()-1;
            while(start < end) {
                if (!Character.isAlphabetic(c[start])) start++;
                else if(!Character.isAlphabetic(c[end])) end--;
                else {
                    char tmp = c[start];
                    c[start] = c[end];
                    c[end] = tmp;
                    start++;
                    end--;
                }
            }
            answer = String.valueOf(c);
            arrayList.add(answer);
        }
        return arrayList;
    }
}
