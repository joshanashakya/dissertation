import java.util.Scanner; public class A1214 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int N = in.nextInt();        int D = in.nextInt();        int E = 5*in.nextInt();        int min = N;        for (int e=0; e<=N; e+=E) {            min = Math.min(min, (N-e)%D);        }        System.out.println(min);    } }