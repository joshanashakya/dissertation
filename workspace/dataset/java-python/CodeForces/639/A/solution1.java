import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }    static int a[];        public static class  Check    {        int a;        int b;         public Check(int a, int b)        {            this.a = a;            this.b = b;        }                      }     public static void main(String[] args) throws IOException    {         Scanner input = new Scanner(System.in);      int n  = input.nextInt();      int k = input.nextInt();      int q = input.nextInt();      int a[] = new int[n];        for (int i = 0; i < n; i++) {            a[i] = input.nextInt();        }        TreeSet<Integer> set = new TreeSet<>();        StringBuilder ans  = new StringBuilder();                for (int i = 0; i < q; i++) {            int x = input.nextInt();            int index = input.nextInt()-1;            if(x==1)            {                if(set.size()<k)                {                    set.add(a[index]);                                    }                else                {                    if(set.first()<a[index])                    {                        set.pollFirst();                        set.add(a[index]);                    }                                    }            }            else            {                if(set.contains(a[index]))                 {                    ans.append("YES\n");                }                else                {                    ans.append("NO\n");                }            }        }        System.out.println(ans                );                                                } }