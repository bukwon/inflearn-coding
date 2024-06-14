package inflearn.myAlgorithmn.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class no1476 {
    public static Scanner sc;
    public static String s;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        SubrectangleQueries sub = null;
        ArrayList<String> arrayList = new ArrayList<>();
        while(true) {
            s = sc.next();
            if (s.equals("")) break;
            else {
                if (s.equals("SublectangleQueries")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int[][] array = new int[x][y];
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            array[i][j] = sc.nextInt();
                        }
                    }
                    sub = new SubrectangleQueries(array);
                    arrayList.add("null");
                } else if (s.equals("getValue")) {
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    assert sub != null;
                    int tmp = sub.getValue(num1, num2);
                    System.out.println(tmp);
                } else if (s.equals("updateSubrectangle")) {
                    int row1 = sc.nextInt();
                    int col1 = sc.nextInt();
                    int row2 = sc.nextInt();
                    int col2 = sc.nextInt();
                    int newValue = sc.nextInt();
                    assert sub != null;
                    sub.updateSubrectangle(row1, col1, row2, col2, newValue);
                }
            }
        }
    }

    static class SubrectangleQueries {
        int[][] rectangle;
        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i < row2; i++) {
                for (int j = col1; j < col2; j++) {
                    rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            int matrix = rectangle[row][col];
            return matrix;
        }
    }
}
