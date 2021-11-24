package Part01;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon3460 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T;
        ArrayList<String> result = new ArrayList<>();

        T = scn.nextInt();

        for (int i = 0; i < T; i++) {
            int num = scn.nextInt();
            int index = 0;
            result.add("");

            while (num/2 != 0) {
                if (num%2 == 1) {
                    result.set(i, result.get(i) + index + " ");
                }
                index++;
                num = num/2;
            }
            result.set(i, result.get(i) + index + " ");
        }


        for (String str: result) {
            System.out.println(str);
        }

    }
}
