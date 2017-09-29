package Ladder_B;
/**
 * Created by CompuShop on 7/31/2017 at 10:47 PM.
 */

import java.util.*;

public class B_835 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt(),s=0;
        char[]n=in.next().toCharArray();
        Arrays.sort(n);
        for (char i:n){
            s+=Integer.valueOf(String.valueOf(i));
        }
        int ans=0;
        for (int i=0;k>s;i++,ans++){
            s=s-Integer.valueOf(String.valueOf(n[i]))+9;
        }
        System.out.println(ans);
        in.close();
    }
}
