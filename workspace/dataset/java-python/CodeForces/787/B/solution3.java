import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }       public static void main(String[] args) throws IOException    {         Scanner input = new Scanner(System.in);        int n ,m;        n = input.nextInt();        m = input.nextInt();        for (int i = 0; i <m; i++) {            int q = input.nextInt();           TreeSet<Integer> set = new TreeSet<>();                       for (int j = 0; j < q; j++) {                int value = input.nextInt();                set.add(value);            }            boolean check = false;            for (int j = 1; j <=n; j++) {                if(set.contains(j)&&set.contains(-j))                {                   check = true;                }            }            if(!check)            {                System.out.println("YES");                return;            }        }        System.out.println("NO");    }          }
