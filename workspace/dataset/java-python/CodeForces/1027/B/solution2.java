import java.util.Scanner;import java.util.Arrays;import java.util.Vector;import java.util.Collections; import java.io.PrintWriter;  public class Solving {     public static void main(String[] args) {               Scanner input = new Scanner(System.in);        PrintWriter pw=new PrintWriter(System.out);        long n ;        int q ;        n = input.nextLong();        q = input.nextInt();        long x , y , res;        for (int i = 0; i < q; i++) {            x = input.nextInt();            y = input.nextInt();            long k = ((x - 1) * n + y + 1) / 2;            long z = (n * n + 1) / 2;                        if ( (x + y) % 2 != 0 )            {             k += z ;            }                        pw.println(k);                                       }                pw.flush();    }    }