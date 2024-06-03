/*
package inflearn.myAlgorithmn.baekjoon;

import java.io.*;
import java.util.*;

public class no2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        HashMap<Integer, Integer> balloon = new HashMap<>();
        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            balloon.put(tmp, i + 1);
            deque.offer(tmp);
        }

        int tmp = deque.removeFirst();
        int count = 1;
        int[] answer = new int[n];
        int arraySize = 0;
        answer[arraySize++] = count;
        while (!deque.isEmpty()) {
            if (tmp > 0) {
                if (count == tmp) {
                    tmp = deque.removeFirst();
                    answer[arraySize++] = balloon.get(tmp);
                    count = 1;
                } else {
                    deque.offer(deque.removeFirst());
                    count++;
                }
            } else {
                if (count == Math.abs(tmp)) {
                    tmp = deque.removeLast();
                    answer[arraySize++] = balloon.get(tmp);
                    count = 1;
                } else {
                    deque.offerFirst(deque.removeLast());
                    count++;
                }
            }
        }
        for (int i : answer) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}

public class balloon {
    int
}*/
