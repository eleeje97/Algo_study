package Part01;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon2581 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M, N;
        Stack<Integer> list = new Stack<>();
        int sum = 0;

        M = scn.nextInt();
        N = scn.nextInt();

        for (int i = M; i <= N; i++) {
            list.push(i);
            if (i == 1) {
                list.pop();
            } else {
                for (int j = 2; j < i; j++) {
                    if(i%j == 0) {
                        list.pop();
                        break;
                    }
                }
            }
        }

        for (int n : list) {
            sum += n;
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.firstElement());
        }

    }
}
