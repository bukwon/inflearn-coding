package inflearn.myAlgorithmn.section8;

import java.util.ArrayList;
import java.util.Scanner;

public class step14 {
    static int answer = Integer.MAX_VALUE, n, m;
    static boolean[] check;
    static int[] calcPizza;
    static ArrayList<Point> house = new ArrayList<>();
    static ArrayList<Point> pizza = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) house.add(new Point(i, j));
                else if (arr[i][j] == 2) pizza.add(new Point(i, j));
            }
        }
        check = new boolean[pizza.size()];
        calcPizza = new int[m];
        DFS(0);
        System.out.println(answer);
    }

    private static void DFS(int startIdx) {
        if (startIdx == m) {
            calcMin(calcPizza);
        }
        else {
            for (int i = 0; i < pizza.size(); i++) {
                if (!check[i]) {
                    check[i] = true;
                    calcPizza[startIdx] = i;
                    startIdx++;
                    DFS(startIdx);
                    check[i] = false;
                    startIdx --;
                }
            }
        }
    }

    private static void calcMin(int[] calcPizza) {
        int tmp = 0;
        for (Point i: house) {
            int dis = Integer.MAX_VALUE;
            for (int j : calcPizza){
//                int num = Math.abs(j.x - pizza.get(i).x) + Math.abs(j.y - pizza.get(i).y);    // 집1 - 피자1 + 집2 - 피자2
                dis = Math.min(dis, Math.abs(i.x - pizza.get(j).x) + Math.abs(i.y - pizza.get(j).y));
//                min = Math.min(num, min);
            }
            tmp += dis;
        }
        answer = Math.min(tmp, answer);
    }

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
