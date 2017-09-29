package Ladder_B;
/**
 * Created by CompuShop on 7/26/2017 at 7:27 PM.
 */

import java.util.*;

public class B_832 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String good=in.next(), s=in.next();
        int n = in.nextInt();
        HashSet<Character> set = new HashSet<Character>();
        for(char x:good.toCharArray())
            set.add(x);
        while(n-->0){
            String q=in.next();
            boolean ans1=true, ans2=true, ans3=true;
            int i=0, j=0, k=0, l=0;
            if(q.length()<s.length()-1 || (!s.contains("*") && s.length()!=q.length())){
                System.out.println("NO");
                continue;
            }
            for(i=0; i<q.length(); i++){
                if(q.charAt(i)!=s.charAt(i) && (s.charAt(i)!='?'&&s.charAt(i)!='*'))
                    ans1 = false;
                else if(s.charAt(i)=='?' && !set.contains(q.charAt(i)))
                    ans1 = false;

                if(s.charAt(i)=='*')
                    break;
            }
            for(j=q.length()-1, k=s.length()-1; k>i; j--,k--){
                if(q.charAt(j)!=s.charAt(k) && (s.charAt(k)!='?'&&s.charAt(k)!='*'))
                    ans2 = false;
                else if(s.charAt(k)=='?' && !set.contains(q.charAt(j)))
                    ans2 = false;
            }
            for(l=i; l<=j; l++){
                if(set.contains(q.charAt(l)))
                    ans3 = false;
            }
            System.out.println(ans1&&ans2&&ans3 ? "YES" : "NO");
        }
    }
}
