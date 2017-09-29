package Ladder_B;
/**
 * Created by Eesaa on 8/7/2017.
 */


import java.util.*;

public class B_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res ="";
        s=s.replaceAll("--","2");
        s=s.replaceAll("-\\.","1");
        s=s.replaceAll("\\.","0");
        System.out.println(s);
    }
}
