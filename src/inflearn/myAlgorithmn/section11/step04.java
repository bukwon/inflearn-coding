package inflearn.myAlgorithmn.section11;

import java.util.*;

public class step04 {
    static int[] dy;
    static public void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Bricks> arr=new ArrayList<>();
        dy=new int[n];
        for(int i=0; i<n; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            arr.add(new Bricks(a, b, c));
        }
        System.out.print(solution(arr));
    }

    static public int solution(ArrayList<Bricks> arr){
        int answer=0;
        Collections.sort(arr);
        dy[0]=arr.get(0).h;
        answer=dy[0];
        for(int i=1; i<arr.size(); i++){
            int max_h=0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).w > arr.get(i).w && dy[j]>max_h){
                    max_h=dy[j];
                }
            }
            dy[i]=max_h+arr.get(i).h;
            answer=Math.max(answer, dy[i]);
        }
        return answer;
    }
}

class Bricks implements Comparable<Bricks>{
    public int s, h, w;
    Bricks(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Bricks o){
        return o.s-this.s;
    }
}