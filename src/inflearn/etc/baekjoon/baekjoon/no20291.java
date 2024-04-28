package inflearn.etc.baekjoon.baekjoon;

import java.util.*;

public class no20291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] file = new String[n];
        for (int i = 0; i < n; i++) {
            file[i] = sc.next();
        }
        solution(file, n);
    }

    private static void solution(String[] file, int n) {
        HashMap<String, Integer> answer = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] splitFile = file[i].split("\\.");
            if(!answer.containsKey(splitFile[1])) {
                answer.put(splitFile[1], 1);
            } else answer.replace(splitFile[1], answer.get(splitFile[1]) + 1);
        }
        List<String> keySet = new ArrayList<>(answer.keySet());
        Collections.sort(keySet);
        for (String s: keySet) {
            System.out.println(s + " " + answer.get(s));
        }
    }
}
