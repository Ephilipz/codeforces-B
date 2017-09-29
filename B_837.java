package Ladder_B;
/**
 * Created by CompuShop on 8/3/2017 at 7:16 PM.
 */

import java.util.*;

public class B_837 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        char f[][] = new char[n][m];
        char con[] = {'R','B','G'};
        for(int i=0;i<n;i++)
            f[i] = in.nextLine().toCharArray();
        boolean ans = false;
        for(int k=0;k<6&&!ans;k++){
            if(k==0)con = "RBG".toCharArray();
            if(k==1)con = "RGB".toCharArray();
            if(k==2)con = "BRG".toCharArray();
            if(k==3)con = "BGR".toCharArray();
            if(k==4)con = "GRB".toCharArray();
            if(k==5)con = "GBR".toCharArray();
            if(!ans && n%3==0){
                ans = true;
                for(int i=0;i<n&&ans;i++){
                    for(int j=0;j<m&&ans;j++){
                        if(f[i][j]!=con[i/(n/3)])
                            ans = false;
                    }
                }
            }
            if(!ans && m%3==0){
                ans = true;
                for(int i=0;i<n&&ans;i++){
                    for(int j=0;j<m&&ans;j++){
                        if(f[i][j]!=con[j/(m/3)])
                            ans = false;
                    }
                }
            }
        }
        if(ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
