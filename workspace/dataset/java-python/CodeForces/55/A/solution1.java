import java.util.Scanner; public class A55 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int N = in.nextInt();        boolean[] visited = new boolean[N];        int pos = 0;        for (int i=1; i<=N*N; i++) {            visited[pos] = true;            pos += i;            pos %= N;        }        boolean answer = true;        for (boolean b : visited) {            if (!b) {                answer = false;            }        }        System.out.println(answer ? "YES" : "NO");    } }