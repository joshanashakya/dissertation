import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }            static int n,m;        static int a[][];        static int row[];    public static void main(String[] args) throws IOException    {       Scanner input = new  Scanner(System.in);      n = input.nextInt();      m = input.nextInt();      int q = input.nextInt();      a= new int[n][m];      int max = Integer.MIN_VALUE;      int cur=0;     row = new int[n];        for (int i = 0; i < n; i++) {            cur=0;            max=0;            for (int j = 0; j < m; j++) {                a[i][j] = input.nextInt();                                                                if(a[i][j]==0)                    cur=0;                else cur++;                max  = Math.max(max, cur);                               }            row[i]= max;        }//        System.out.println(Arrays.toString(row));        for (int i = 0; i < q; i++) {            int x = input.nextInt()-1;            int y = input.nextInt()-1;            if(a[x][y]==0)                a[x][y]=1;            else                a[x][y]=0;                                    max =0;            cur=0;                for (int j = 0; j <m; j++) {                if(a[x][j]==0)                    cur=0;                else cur++;                max  = Math.max(max, cur);            }                row[x]=max;                long result = Max();                            System.out.println(result);            }                        }    public static long Max()    {       long max =Long.MIN_VALUE;        for (int i = 0; i < n; i++) {            max = Math.max(max,row[i] );        }        return max;    }  }
