import java.util.*;public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int n, i, m, ans=0, mint;        n = in.nextInt();        for (i = 1; i <= n; i++) {            m = in.nextInt();            mint = Math.min(m - 1, 1000000 - m);            ans = Math.max(ans, mint);        }        System.out.println(ans);        in.close();    }}	 	   	 				 	 	   	 				 	  	