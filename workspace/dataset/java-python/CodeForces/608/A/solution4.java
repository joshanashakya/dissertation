import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(double a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            double temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }     public static void main(String[] args) throws IOException    {               Scanner input = new Scanner(System.in);       int n = input.nextInt();       int s = input.nextInt();              long total = s;        for (int i = 1; i <=n; i++) {           total = Math.max(total, input.nextInt()+input.nextInt());                   }                            System.out.println(total);                                                       }       } 
