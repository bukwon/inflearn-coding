package inflearn.myAlgorithmn.baekjoon;

import java.util.*;

public class no1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> arr = new HashMap<>();
        int answer = 0;
        String[] listen = new String[n];
        String[] look = new String[m];
        for (int i = 0; i < n; i++) {
            listen[i] = sc.next();
            arr.put(listen[i], 0);
        }
        for (int i = 0; i < m; i++) {
            look[i] = sc.next();
        }
        ArrayList<String> people = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if(arr.containsKey(look[i])) {
                people.add(look[i]);
                answer++;
            }
        }
        System.out.println(answer);
        Collections.sort(people);
        for (String s: people) {
            System.out.println(s);
        }
    }
}
