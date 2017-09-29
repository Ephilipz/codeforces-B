package Ladder_B;
/**
 * Created by Eesaa on 9/22/2017.
 */

import java.util.*;

public class B_746 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        if(s.length()==1 || s.length()==2)
        {
            System.out.println(s);return;
        }
        ArrayDeque<Character> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                que.addLast(s.charAt(i));
            else
                que.addFirst(s.charAt(i));
        }
        String res = que.toString();
        res =res.replaceAll(",","").replaceAll(" ","");
        res = res.substring(1,n+1);
        StringBuilder sb = new StringBuilder(res);
        System.out.println(n%2==0?sb.reverse():res);
    }

}
