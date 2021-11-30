package Part01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2693 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T; //테스트 개수
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        T = scn.nextInt();
        for (int i = 0; i < T; i++) {
            lists.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                lists.get(i).add(scn.nextInt());
            }
            Collections.sort(lists.get(i), Collections.reverseOrder());
        }

        for (int i = 0; i < T; i++) {
            System.out.println(lists.get(i).get(2));
        }
    }
}
