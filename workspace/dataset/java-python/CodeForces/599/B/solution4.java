// IN THE NAME OF ALLAH import java.util.Scanner; public class Ds599B_2 {    static private int N = 100000 + 1;     public static void main(String[] args) {        Scanner input = new Scanner(System.in);        int n = input.nextInt(), m = input.nextInt();        int[] f = new int[N], b = new int[N], a = new int[N], g = new int[N];        boolean ambiguity = false;        for (int i = 0; i < N; i++)            g[i] = -1;        for (int i = 0; i < n; i++) {            f[i] = input.nextInt();            if (g[f[i]] == -1)                g[f[i]] = i + 1;            else                g[f[i]] = -2;        }        for (int i = 0; i < m; i++) {            b[i] = input.nextInt();            if (g[b[i]] == -1) {                System.out.println("Impossible");                return;            }        }        for (int i = 0; i < m; i++) {            if (g[b[i]] == -2) {                System.out.println("Ambiguity");                return;            }        }        System.out.println("Possible");        for (int i = 0; i < m; i++) {            System.out.print(g[b[i]]);            System.out.print(" ");        }    }} 
