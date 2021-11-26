package Part01;

import java.util.Scanner;

public class BaekJoon10818 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N;
        int min;
        int max;
        int temp;


        N = scn.nextInt();
        min = scn.nextInt();
        max = min;
        for (int i = 0; i < N-1; i++) {
            temp = scn.nextInt();
            min = min > temp ? temp : min;
            max = max < temp ? temp : max;
        }

        System.out.println(min + " " + max);
    }
}
