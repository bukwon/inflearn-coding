package inflearn.myAlgorithmn;

import java.io.*;
import java.util.*;

public class no12015 {
    static int N, point;
    static int[] arr, lis;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        N = Integer.parseInt(br.readLine()); //수열의 크기

        arr = new int[N];
        lis = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        point = 0;

        for(int i=0; i<N; i++) {

            if(lis[point] < arr[i]) {
                lis[++point] = arr[i];
            }
            else {
                int idx = lowerBound( 0, point, arr[i]);
                lis[idx] = arr[i];
            }

        }

        sb.append(point).append("\n");

        System.out.println(sb);
    }

    private static int lowerBound(int low, int high, int key) {
        while(low < high) {
            int mid = (low + high) / 2;

            if(lis[mid] < key) { //mid값보다 현재 key값이 크다면 오른쪽에서 탐색
                low = mid + 1;
            }
            else { //작을경우 왼쪾에서 탐색
                high = mid;
            }
        }
        return high;
    }
}