import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();    

        while (t-->0) {

            int n = input.nextInt();
            int m = input.nextInt();
            char[][] grid = new char[n][m];

            for (int i = 0; i < n; i++) {
                grid[i] = input.next().toCharArray();
            }

            int result = 0;

            for (int i = 0; i < n; i++) {
                if (grid[i][m-1] == 'R') {
                    result++;
                }
            }

            for (int i = 0; i < m; i++) {
                if (grid[n-1][i] == 'D') {
                    result++;
                }
            }

            System.out.println(result);
        }
    }
}
