package Part01;

import java.util.Scanner;

public class BaekJoon1292 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A, B;
        A = scn.nextInt();
        B = scn.nextInt();

        System.out.println(getSum(B) - getSum(A-1));
    }

    public static int getSum(int numBy) {
        int count = numBy;
        int n = 1;
        int sum = 0;

        while (count != 0) {
            if (count >= n) {
                sum += n * n;
                count -= n;
                n++;
            } else {
                sum += n * (count);
                count = 0;
            }
        }

        return sum;
    }
}
