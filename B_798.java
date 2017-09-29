package Ladder_B;
/**
 * Created by CompuShop on 7/12/2017 at 6:37 PM.
 */

import java.util.*;

public class B_798 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words[0].length(); i++) {
            String str = words[0].substring(i) + words[0].substring(0,i);
            int total = 0;
            for (int j = 0; j < words.length; j++) {
                boolean flag = false;
                for (int k = 0; k < words[j].length(); k++) {
                    String dakroony = words[j].substring(k)+words[j].substring(0,k);
                    if(dakroony.equals(str))
                    {
                        flag=true;
                        total+=k;
                        break;
                    }
                }
                if(!flag)
                {
                    System.out.println(-1);
                    return;
                }
            }
            min=Math.min(total,min);
        }
        System.out.println(min);
    }
}

