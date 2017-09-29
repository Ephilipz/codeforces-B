package Ladder_B;

/**
 * Created by CompuShop on 5/9/2017.
 */

import java.util.*;
public class Vanya_and_Lanterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),l=in.nextInt();
        double maxDist = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            maxDist = Math.max(maxDist,list.get(i)-list.get(i-1));

        }
        double answer = Math.max(maxDist/2,Math.max(list.get(0)-0,l-list.get(list.size()-1)));
        System.out.println(answer);
    }

}
