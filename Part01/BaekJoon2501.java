package Part01;
import java.util.ArrayList;
import java.util.Scanner;


public class BaekJoon2501 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N;
        int K;
        ArrayList list = new ArrayList();

        N = scn.nextInt();
        K = scn.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                list.add(i);
            }
        }

        if (K <= list.size()) {
            System.out.println(list.get(K-1));
        } else {
            System.out.println(0);
        }
    }
}