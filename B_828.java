package Ladder_B;
import java.io.InputStream;
import java.util.*;

/**
 * Created by Eesaa 7/15/2017 3:00pm
 */
public class B_828 {
    public static InputStream inputStream;

    public static void main(String[] args) {
        inputStream=System.in;
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(inputStream);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> col = new HashSet<Integer>();
        int count=0;

        for (int i = 0; i < a; i++) {
            String line = scanner.next();
            if (line.contains("B")) col.add(i);
            for (int j = 0; j < b; j++) {
                char c = line.charAt(j);
                if ('B'==c) {
                    row.add(j);
                    count++;
                }
            }
        }

        if (row.isEmpty()||col.isEmpty()) {
            System.out.println(1);
            return;
        }

        int maxRow = getMaxDiff(row);
        int maxCol = getMaxDiff(col);
        int max = Math.max(maxRow, maxCol);

        if (max>a||max>b) {
            System.out.println(-1);
            return;
        }

        System.out.println(max * max - count);
    }

    private static int getMaxDiff(Set<Integer> row) {
        int max = getMax(row);
        int min = getMin(row);
        return max-min+1;
    }

    private static int getMax(Set<Integer> row) {
        Integer max = null;
        for (Integer integer : row) {
            if (max==null) {
                max=integer;
                continue;
            }
            max = max > integer ? max : integer;
        }
        return max;
    }

    private static int getMin(Set<Integer> row) {
        Integer min = null;
        for (Integer integer : row) {
            if (min==null) {
                min=integer;
                continue;
            }
            min = min < integer ? min : integer;
        }
        return min;
    }
}