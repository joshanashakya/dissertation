import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }     public static void main(String[] args) throws IOException    {         Scanner input = new Scanner(System.in);         int n  = input.nextInt();        long k = input.nextLong();       ArrayList<Integer> a = new ArrayList<>();        for (int i = 0; i < n; i++) {           a.add(input.nextInt());                    }        int ans[] = new int[n+1];        int j=n;        if(k>=n)        {            System.out.println(n);            return;        }        for (int i = 0; ; i++) {            if(a.get(0)<a.get(1))            {                  ans[a.get(1)]++;                  if(ans[a.get(1)]>=k)                  {                      System.out.println(a.get(1));                      return;                  }                int value = a.remove(0);//                System.out.println(value);                a.add(value);                          }            else if(a.get(0)>a.get(1))            {                  ans[a.get(0)]++;                  if(ans[a.get(0)]>=k)                  {                      System.out.println(a.get(0));                      return;                  }              int value=  a.remove(1);//                System.out.println(value);                a.add(value);            }        }    } }