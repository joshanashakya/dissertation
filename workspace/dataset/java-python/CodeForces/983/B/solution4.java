import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class WorkFile {    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(reader.readLine());        StringTokenizer sToken = new StringTokenizer(reader.readLine());        int[][] pyramid = new int[n][n];        int[][] res = new int[n][n];        for (int i=0; i<n; i++) {            int x = Integer.parseInt(sToken.nextToken());            pyramid[0][i] = x; res[0][i] = x;        }        int length = n;        for (int i=1; i<n; i++) {            length--;            for (int j=0; j<length; j++) {                int x = pyramid[i-1][j]^pyramid[i-1][j+1];                pyramid[i][j] = x;                res[i][j] = Math.max(x, Math.max(res[i-1][j], res[i-1][j+1]));            }        }        int q = Integer.parseInt(reader.readLine());        StringBuilder ans = new StringBuilder();        while (q-->0) {            sToken = new StringTokenizer(reader.readLine());            int l = Integer.parseInt(sToken.nextToken()) - 1;            int r = Integer.parseInt(sToken.nextToken()) - 1;            ans.append(res[r-l][l]).append("\n");        }        PrintWriter writer = new PrintWriter(System.out);        writer.print(ans);        writer.close();    }}
