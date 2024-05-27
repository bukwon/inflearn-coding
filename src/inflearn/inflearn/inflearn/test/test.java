package inflearn.inflearn.inflearn.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] phone_book = new String[n];
        for (int i = 0; i < n; i++) {
            phone_book[i] = sc.next();
        }
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phoneBook) {
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++) {
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;
            }

        return true;
    }
}