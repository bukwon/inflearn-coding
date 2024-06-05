package inflearn.myAlgorithmn.programmers;

import java.util.Scanner;

public class joyStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }

            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + length - index);  // 7, 0 * 2 + 4 ==  4
            // 2022년 이전 테스트 케이스만 확인하면 여기까지해도 정답처리가 되기 때문에, 이전 정답들에는 여기까지만 정리되어 있지만,
            // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우까지 고려하려면 아래의 코드가 필요합니다.
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }

    /*private static int solution(String s) {
        int answer = 0;
        int[] check = new int[2];
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 2; i++) {
            int p = 0, count = 0;
            if (i == 1) sb = new StringBuilder(s).reverse();
            else p = 1;
            System.out.println(sb);
            while(String.valueOf(sb).charAt(p++) == 'A') count++;
            check[i] = count;
            System.out.println(check[i]);
        }
        int loop = 0, tmp = 0;
        if (check[0] > check[1]) {
            s = String.valueOf(sb.reverse());
            loop
        }
        for (int i = 0; i < s.length(); i++) {
            int num1 = s.charAt(i) - 'A';
            int num2 = 'Z' - s.charAt(i) + 1;
            tmp = Math.min(num1, num2);
            answer += tmp;
            if (tmp > 0  &&  i > 0) answer += 1;
        }

        return answer;
    } 틀린 답안*/
}
