package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.*;

public class no4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hashMap = new HashMap<>();

        String s = "";
        float total = 0;
        while(true) {
            s= bf.readLine();
            if (s == null || s.isEmpty()) break;
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
            total ++;
        }

        List<String> list = new ArrayList<>();
        for (String tmp: hashMap.keySet()) list.add(tmp);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String tmp: list) {
            float num = (hashMap.get(tmp) / total) * 100;
            sb.append(tmp + " " + String.format("%.4f", num)).append("\n");
        }
        System.out.println(sb);
    }
}
