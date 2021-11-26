package Part01;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon2460 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        int current = 0;
        int max = 0;


        for (int i = 0; i < 10; i++) {
            out.add(scn.nextInt());
            in.add(scn.nextInt());
            current -= out.get(i);
            current += in.get(i);

            max = (current > max) ? current : max;
            System.out.println(max);
        }


        System.out.println(max);

    }
}
