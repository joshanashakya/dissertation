import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        int n = scan.nextInt();        int tran = 0;        int ans = 0;        for (int i = 0; i < n; i++) {            int a = scan.nextInt(); // 出            int b = scan.nextInt(); // 入            tran += b - a;            if (tran > ans)                ans = tran;        }        System.out.println(ans);    }}   
