package Ladder_B;
/**
 * Created by CompuShop on 5/9/2017.
 */

import java.util.*;

public class SortingArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = in.nextInt();
        boolean[] seg = new boolean[n];
        for(int i = 0 ; i < n-1 ; i++)
            if(a[i] > a[i+1])
                seg[i] = seg[i+1] = true;
        int count = 0;
        boolean prev = false;
        for(int i = 0 ; i < n ; i++) {
            if(seg[i] != prev)
                count++;
            prev = seg[i];
        }
        if(count > 3) {
            System.out.println("no");
        } else {
            int left = Integer.MAX_VALUE, right = -1;
            for(int i = 0 ; i < n ; i++)
                if(seg[i]) {
                    left = Math.min(left, i+1);
                    right = Math.max(right, i+1);
                }
            if(right == -1) {
                System.out.println("yes\n1 1");
            } else {
                a = reverse(a, left-1, right-1);
                for(int i = 1 ; i < n ; i++)
                    if(a[i] < a[i-1]) {
                        System.out.println("no");
                        return;
                    }
                System.out.printf("yes\n%d %d", left, right);
            }
        }
    }
    public static int[] reverse(int[] a, int i_, int j_) {
        int[] res = new int[a.length];
        for(int i = 0 ; i < a.length ; i++) {
            if(i >= i_ && i <= j_) {
                res[i] = a[j_-(i-i_)];
            } else {
                res[i] = a[i];
            }
        }
        return res;
    }
}

