import java.io.*;import java.util.*; import static java.lang.Integer.*; public class A {     public static void main(String[] args) throws IOException {        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        PrintWriter pw = new PrintWriter(System.out);        int n = parseInt(in.readLine());        if (n % 2 == 0) {            pw.println(-1);        } else {            for (int i = 0; i < n; i++) {                pw.print(i + " ");            }            pw.println();            for (int i = 0; i < n; i++) {                pw.print(i + " ");            }            pw.println();            for (int i = 0; i < n; i++) {                pw.print((2 * i % n) + " ");            }        }        pw.close();    }}		  										 		 		 		  			 		
