package inflearn.myAlgorithmn.baekjoon;

import java.io.*;

public class no15721 {
    static int a,t,n;
    static int zeroCount, oneCount;
    static int repeat=2;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        a = Integer.parseInt(bf.readLine());
        t = Integer.parseInt(bf.readLine());
        n = Integer.parseInt(bf.readLine());

        bw.write(solution() + "");
        bw.flush(); bw.close(); bf.close();
    }

    private static int solution() {
        while (true) {
            for(int i=0; i<4; i++){
                if(i%2==0){
                    zeroCount++;
                }
                else{
                    oneCount++;
                }
                if(n==0 && zeroCount==t){
                    return (zeroCount+oneCount-1)%a;
                }
                if(n==1 && oneCount==t){
                    return (zeroCount+oneCount-1)%a;
                }
            }
            for(int i=0; i<repeat; i++){
                zeroCount++;
                if(zeroCount==t && n==0){
                    return (zeroCount+oneCount-1)%a;
                }
            }
            for(int i=0; i<repeat; i++){
                oneCount++;
                if(oneCount==t && n==1){
                    return (zeroCount+oneCount-1)%a;
                }
            }
            repeat++;
        }
    }
}
