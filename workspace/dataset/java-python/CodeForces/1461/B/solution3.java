import java.util.*; public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int t = in.nextInt();         while (t-- > 0) {            int n, m;            long ans;            n = in.nextInt();            m = in.nextInt();            ans = 0;            int[][] arr = new int[n+1][m+2];             for (int i = 0; i < n; i++) {                String st = in.next();                for (int j = 0; j < m; j++) {                    if (st.charAt(j) == '*') arr[i][j+1] = 1;                }            }             for (int i = n; i > 0; i--) {                for (int j = 1; j <= m; j++) {                    if (arr[i-1][j] > 0) {                        arr[i-1][j] = 1 + Math.min(arr[i][j+1], Math.min(arr[i][j-1], arr[i][j]));                        ans += arr[i-1][j];                    }                }            }             System.out.println(ans);        }    }}