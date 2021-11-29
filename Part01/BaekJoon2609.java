package Part01;

import java.util.Scanner;

public class BaekJoon2609 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        a = scn.nextInt();
        b = scn.nextInt();

        int GCD = 1; // 최대공약수
        int LCM = 1; // 최소공배수

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = 1; i <= min; i++) {
            if (a%i == 0 && b%i == 0) {
                GCD = i;
            }
        }

        for (int i = max; i > 0; i++) {
            if (i%a == 0 && i%b == 0) {
                LCM = i;
                break;
            }
        }

        System.out.println(GCD + "\n" + LCM);
    }
}
