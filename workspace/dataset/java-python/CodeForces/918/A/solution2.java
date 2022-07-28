import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Scanner; public class Codeforces {     private static final Scanner sc = new Scanner(System.in);    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    private static final long MOD = (long) (1e9 + 7);    private static PrintWriter out = new PrintWriter(System.out);     public static void solve(int T) throws IOException {        int n = sc.nextInt();        if (n == 1){            System.out.println("O");            return;        }        if (n == 2){            System.out.println("OO");            return;        }        int[] f = new int[n + 5];        int a = 0;        int b = 1;        f[0] = a;        f[1] = b;        for (int i = 2; i <= n + 4; i++) {            int c = a + b;            f[i] = c;            a = b;            b = c;        }//        for (int x : f){//            System.out.print(x + " ");//        }//        System.out.println();        StringBuilder ans = new StringBuilder();        int j = 2;        for (int i = 1; i <= n; i++) {            if (f[j] == i){                ans.append("O");                j++;            }            else{                ans.append("o");            }        }        //System.out.println(j);        System.out.println(ans.toString());    }     public static void main(String[] args) throws IOException {        int t;//        t = sc.nextInt();        t = 1;        while (t-- > 0){            solve(t);        }        System.gc();    }}   		  	   	  	  	    		 			 		 	
