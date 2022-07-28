import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = reader.readLine().split(" ");
        int n = Integer.valueOf(tmp[0]);
        int m = Integer.valueOf(tmp[1]);
        int x = Integer.valueOf(tmp[2]);
        int y = Integer.valueOf(tmp[3]);
        
        int[][] info = new int[n+1][m+1];
        
        int prey = y;
        for(int i=x; i>=1; i--) {
            info[i][prey] = 1;
            System.out.println(i + " " + prey);
            for(int j=1; j<=m; j++) {
                if(info[i][j] != 1) {
                    prey = j;
                    System.out.println(i + " " + j);
                }
            }
        }
        
        for(int i=x+1; i<=n; i++) {
            info[i][prey] = 1;
            System.out.println(i + " " + prey);
            for(int j=1; j<=m; j++) {
                if(info[i][j] != 1) {
                    prey = j;
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
