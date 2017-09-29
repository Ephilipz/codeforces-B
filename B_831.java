package Ladder_B;
/**
 * Created by CompuShop on 7/21/2017 at 1:31 PM.
 */

import java.util.*;

public class B_831 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next(),s2=in.next(),text=in.next();
        String res="";
        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if(Character.isDigit(s))
            {
                res+=s;
                continue;
            }
            boolean flag = false;
            if(Character.isUpperCase(s))
            {
                flag = true;
                s = Character.toLowerCase(s);
            }
            int index = s1.indexOf(s);
            if(flag)
            {
                res += Character.toUpperCase(s2.charAt(index));
                continue;
            }
            res+=s2.charAt(index);
        }
        System.out.println(res);
    }
}
