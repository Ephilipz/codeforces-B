package Ladder_B;
/**
 * Created by Eesaa on 9/28/2017.
 */

import java.util.*;

public class B_66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        if (n == 1 || n == 2) {
            System.out.println(n);
            return;
        }
        ArrayList<Integer> ranges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ranges.add(reached(list, i));
        }
        System.out.println(Collections.max(ranges));
    }


    public static int reached(ArrayList<Integer> list, int index) {
        int res = 1;
        if (index == list.size() - 1) {
            for (int i = list.size() - 1; i > 0; --i) {
                if (list.get(i) >= list.get(i - 1)) res++;
                else break;
            }
        } else if (index == 0) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) res++;
                else break;
            }
        } else {
            for (int i = index; i > 0; i--) {
                if (list.get(i) >= list.get(i - 1)) res++;
                else break;
            }

            for (int i = index; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) res++;
                else break;
            }
        }
        return res;
    }
}
