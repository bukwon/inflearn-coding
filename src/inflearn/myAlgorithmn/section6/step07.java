package inflearn.myAlgorithmn.section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class step07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        for (Point o: solution(array, n)) {
            System.out.println(o.x + " " + o.y);
        }
    }

    private static ArrayList<Point> solution(int[][] array, int n) {
        ArrayList<Point> point = new ArrayList<>();
        for (int i = 0; i < n; i++) point.add(new Point(array[i][0], array[i][1]));

        // Collections.sort(point);
        return point;
    }
}

class Point implements Comparable<Point>{
    public int x;
    public int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
