package inflearn.myAlgorithmn.section4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class step03 {
    static BufferedReader bf;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException{
        bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        solution(n, k, arr);
    }

    private static void solution(int n, int k, int[] arr) throws IOException {
        int[] answer = new int[n - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int size = map.size();
        answer[0] = size;
        int p1 = 0, p2 = k;
        while (p2 < n) {
            map.put(arr[p2], map.getOrDefault(arr[p2++], 0) + 1);
            map.put(arr[p1], map.get(arr[p1]) - 1);
            if (map.get(arr[p1]) <= 0) map.remove(arr[p1]);
            p1++;
            size = map.size();
            answer[p1] = size;
        }
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i: answer) {
            bw.write(i + " ");
        }
        bw.flush(); bw.close(); bf.close();
    }
}
