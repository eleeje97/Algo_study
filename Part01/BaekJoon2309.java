package Part01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2309 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int sum = 0;
        int rest; // 아홉 난쟁이들의 키의 합 - 100 = 가짜 난쟁이들의 키의 합


        for (int i = 0; i < 9; i++) {
            list.add(scn.nextInt());
            sum += list.get(i);
        }


        rest = sum - 100;


        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if((list.get(i) + list.get(j)) == rest) {
                    list.remove(i);
                    list.remove(j-1);
                    break;
                }
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
