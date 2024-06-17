package inflearn.myAlgorithmn.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class no1286 {
    static CombinationIterator combinationIterator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 0;
        while (true) {
            String type = sc.next();
            if (type.equals("CombinationIterator")) {
                String characters = sc.next();
                int combinationLength = sc.nextInt();
                combinationIterator = new CombinationIterator(characters, combinationLength);
            } else if (type.equals("next")) {
                System.out.println(combinationIterator.next());
            } else if (type.equals("hasNext")) {
                System.out.println(combinationIterator.hasNext());
            }
        }
    }
}

class CombinationIterator {
    String characters;
    int combinationLength;
    int liner;
    int checkPoint;
    static boolean[] visited;
    HashMap<Integer, String> check = new HashMap<>();

    public CombinationIterator(String characters, int combinationLength) {
        this.characters = characters;
        this.combinationLength = combinationLength;
        this.liner = 0;
        this.checkPoint = 0;
        separate(this.characters, this.combinationLength);
    }

    private void separate(String characters, int combinationLength) {
        visited = new boolean[characters.length()];
        if (combinationLength > 1) {
            backtracking(0, 0, "");
        } else {
            for (int i = 0; i < characters.length(); i++) {
                check.put(i, String.valueOf(characters.charAt(i)));
            }
        }
    }

    public void backtracking(int index, int depth, String answer) {
        if (depth == this.combinationLength) {
            check.put(liner++, answer);
            return;
        }

        for (int i = index; i < characters.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtracking(i + 1, depth + 1, answer + characters.charAt(i));
                visited[i] = false;
            }
        }
    }

    public String next() {
        return check.get(checkPoint++);
    }

    public boolean hasNext() {
        return check.containsKey(checkPoint);
    }
}
