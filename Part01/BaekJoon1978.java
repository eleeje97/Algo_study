package Part01;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1978 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N;
        Stack<Integer> list = new Stack<>();
        int temp;

        N = scn.nextInt();

        for (int i = 0; i < N; i++) {
            temp = scn.nextInt();
            list.push(temp);
            if (temp == 1) {
                list.pop();
            } else {
                for (int j = 2; j < temp; j++) {
                    if(temp%j == 0) {
                        list.pop();
                        break;
                    }
                }
            }

        }

        System.out.println(list.size());

    }
}
