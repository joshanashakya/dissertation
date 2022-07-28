import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class NewSolution {    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer sToken = new StringTokenizer(reader.readLine());        int n = Integer.parseInt(sToken.nextToken());        int m = Integer.parseInt(sToken.nextToken());        String a = reader.readLine(), b = reader.readLine();        int[][] res = new int[n][m];        int result = 0;        if (a.charAt(0)==b.charAt(0)) {            res[0][0] = 2; result = 2;        }        for (int i=1; i<n; i++) {            if (a.charAt(i)==b.charAt(0)) res[i][0] = 2;            else res[i][0] = Math.max(0, res[i-1][0] - 1);            result = Math.max(result, res[i][0]);        }        for (int i=1; i<m; i++) {            if (a.charAt(0)==b.charAt(i)) res[0][i] = 2;            else res[0][i] = Math.max(0, res[0][i-1] - 1);            result = Math.max(result, res[0][i]);        }        for (int i=1; i<n; i++) {            for (int j=1; j<m; j++) {                int max = Math.max(res[i-1][j], res[i][j-1]) - 1;                if (a.charAt(i)==b.charAt(j)) max = Math.max(max, res[i-1][j-1] + 2);                else max = Math.max(max, res[i-1][j-1] - 2);                res[i][j] = Math.max(0, max);                result = Math.max(result, res[i][j]);            }        }        System.out.println(result);    }}