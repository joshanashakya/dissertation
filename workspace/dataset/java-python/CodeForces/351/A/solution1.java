import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigDecimal;import java.util.Arrays;import java.util.StringTokenizer; public class Solution2 {    private static int MIN = Integer.MIN_VALUE + 5, MAX = Integer.MAX_VALUE - 5;    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(reader.readLine());        int N = 2 * n;        StringTokenizer sToken = new StringTokenizer(reader.readLine());        int[] down = new int[N];        int[] up = new int[N];        BigDecimal d1000 = new BigDecimal("1000.0");        for (int i=0; i<N; i++) {            double x = Double.parseDouble(sToken.nextToken());            BigDecimal decimal = new BigDecimal(x);            BigDecimal d = decimal.multiply(d1000);            d = d.setScale(1, BigDecimal.ROUND_HALF_UP);            //System.out.println(d);            //System.out.println(x+" "+decimal.multiply(d1000));            down[i] = (int) (d.longValue() % 1000);            up[i] = (1000 - down[i])%1000;        }        if (n==1) {            int result = Math.min(Math.abs(down[0] - up[1]), Math.abs(down[1] - up[0]));            System.out.println(String.format("%.3f", result/1000.0));            System.exit(0);        }        int[][] min = new int[N][n+1];        int[][] max = new int[N][n+1];        for (int i=0; i<N; i++) {            Arrays.fill(min[i], MAX);            Arrays.fill(max[i], MIN);        }        min[0][1] = down[0]; max[0][0] = -up[0];        for (int i=1; i<N; i++) {            for (int j=0; j<=n; j++) {                if (min[i-1][j]!=MAX && min[i-1][j] - up[i]>=0)                    min[i][j] = Math.min(min[i][j], min[i-1][j] - up[i]);                if (j>0 && min[i-1][j-1]!=MAX && min[i-1][j-1] + down[i]>=0)                    min[i][j] = Math.min(min[i][j], min[i-1][j-1] + down[i]);                if (max[i-1][j]!=MIN && max[i-1][j] - up[i]>=0)                    min[i][j] = Math.min(min[i][j], max[i-1][j] - up[i]);                if (j>0 && max[i-1][j-1]!=MIN && max[i-1][j-1] + down[i]>=0)                    min[i][j] = Math.min(min[i][j], max[i-1][j-1] + down[i]);                 if (max[i-1][j]!=MIN && max[i-1][j] - up[i]<=0)                    max[i][j] = Math.max(max[i][j], max[i-1][j] - up[i]);                if (j>0 && max[i-1][j-1]!=MIN && max[i-1][j-1] + down[i]<=0)                    max[i][j] = Math.max(max[i][j], max[i-1][j-1] + down[i]);                if (min[i-1][j]!=MAX && min[i-1][j] - up[i]<=0)                    max[i][j] = Math.max(max[i][j], min[i-1][j] - up[i]);                if (j>0 && min[i-1][j-1]!=MAX && min[i-1][j-1] + down[i]<=0)                    max[i][j] = Math.max(max[i][j], min[i-1][j-1] + down[i]);            }        }        int result = Math.min(Math.abs(min[N-1][n]), Math.abs(max[N-1][n]));        System.out.println(String.format("%.3f", result/1000.0));    }}