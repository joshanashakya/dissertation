import java.util.Scanner; public class Main {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);         int n = in.nextInt();         int g = 0;        int prev = -1;        for (int i = 0; i < n; i++) {            int m = in.nextInt();            if (m != prev) {                g++;                prev = m;            }        }         System.out.println(g);    }}
