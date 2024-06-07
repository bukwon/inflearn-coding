package inflearn.myAlgorithmn.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        System.out.println(solution(numRows));
    }

    private static List<List<Integer>> solution(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        // 첫 번째 행 초기화
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);  // 각 행의 첫 번째 요소는 항상 1

            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));  // 중간 요소들 계산
            }

            newRow.add(1);  // 각 행의 마지막 요소는 항상 1

            triangle.add(newRow);  // 새 행을 삼각형에 추가
        }

        return triangle;
    }
}



/*
    StringBuilder sb = new StringBuilder();
    int[][] array = new int[numRows][numRows + 1];


        for (int i = 0; i < numRows; i++) {
        if (i < 2) {
            for (int j = 0; j <= i; j++) array[i][j] = 1;
        }
        else {
            array[i][0] = 1;
            array[i][i] = 1;
            for (int j = 1; j <= i - 1; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }   // 벌집 생성
    }

        for (int i = 0; i < numRows; i++) {
        int p = 0;
        sb.append("[[");
        while(array[i][p] != 0) {
            if (p > 0 && p < numRows) sb.append(",");
            sb.append(array[i][p++]);
        }
        sb.append("]]");
        if (numRows > 1 && i < numRows - 1) sb.append(",");
    }
        return String.valueOf(sb);
}*/
