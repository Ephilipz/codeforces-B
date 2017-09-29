package Ladder_B;
/**
 * Created by Eesaa on 9/16/2017.
 */

        import java.util.*;

public class B_859 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(2*(int)(Math.ceil(2*Math.sqrt(n))));
    }
}