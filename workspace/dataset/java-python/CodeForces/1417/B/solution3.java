import java.util.Scanner; public class B {     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        for (int i = 0; i < t; ++i) {            int n = sc.nextInt();            int T = sc.nextInt();            int[] a = new int[n];            int[] ans = new int[n];            int eqCount = 0;            for (int j = 0; j < n; ++j) {                a[j] = sc.nextInt();                 if (T % 2 == 0 && a[j] == T /2) {                    if (eqCount % 2 == 0) {                        ans[j] = 0;                    } else {                        ans[j] = 1;                    }                    eqCount ++;                } else if (a[j] <= T/2) {                    ans[j] = 0;                } else if (a[j] >= T/2) {                    ans[j] = 1;                }            }            StringBuilder sb = new StringBuilder();            for (int j = 0; j < n; ++j) {                if (j > 0) {                    sb.append(' ');                }                sb.append(ans[j]);            }            System.out.println(sb.toString());        }     }}