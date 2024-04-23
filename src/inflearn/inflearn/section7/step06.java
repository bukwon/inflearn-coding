package inflearn.inflearn.section7;

import inflearn.Main;

import java.util.Scanner;

public class step06 {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if(L == n+1) {
            String tmp = "";
            for (int i = 0; i <= n; i++) {
                if(ch[i]==1) tmp += (i+" ");
            }
            if(!tmp.isEmpty()) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
    public static void main(String[] args) {
        step06 T = new step06();
        Scanner sc = new Scanner(System.in);
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
