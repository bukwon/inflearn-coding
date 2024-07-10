package inflearn.myAlgorithmn.leetcode;

import java.util.PriorityQueue;
import java.util.Scanner;

public class no1845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SeatManager seatManager = new SeatManager(n);
        while (true) {
            String s = sc.next();
            if (s.equals("reserve")) System.out.println(seatManager.reserve());
            else {
                int sn = sc.nextInt();
                seatManager.unreserve(sn);
            }
        }
    }
}

class SeatManager {
    static PriorityQueue<Integer> PQ;
    public SeatManager(int n) {
        PQ = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) PQ.offer(i);
    }

    public int reserve() {
        return PQ.poll();
    }

    public void unreserve(int seatNumber) {
        PQ.offer(seatNumber);
    }
}