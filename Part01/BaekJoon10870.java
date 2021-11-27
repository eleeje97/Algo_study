package Part01;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon10870 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int n;

        n = scn.nextInt();

        list.add(0);
        list.add(1);

        for (int i = 2; i <= n; i++) {
            list.add(list.get(i-2) + list.get(i-1));
        }

        System.out.println(list.get(n));
    }
}
