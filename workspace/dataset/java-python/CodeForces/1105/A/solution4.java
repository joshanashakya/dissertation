import java.io.*;import java.util.*;import java.math.*; public class Salemstick{    public static void main(String arg[]) throws IOException    {        CustomInputReader sc = new CustomInputReader();        PrintWriter pw = new PrintWriter(System.out);                int n = sc.nextInt();        int a[] = sc.nextIntArr(n);        int ans = Integer.MAX_VALUE, ft=0;         for(int t=1;t<101;++t)        {            int sum = 0;            for(int i=0;i<n;++i)            {                if(a[i]!=t) sum+=Math.abs(t-a[i])-1;            }             if(ans>sum)            {                ans = sum;                ft = t;            }        }         pw.println(ft + " " + ans);         //flush output        pw.flush();        pw.close();    }        } class CustomInputReader {    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     public int nextInt() throws IOException    {        return Integer.parseInt(br.readLine());    }     public int[] nextIntArr(int n) throws IOException    {        String in[] = br.readLine().split(" ");        int arr[] = new int[n];        for(int i=0;i<n;++i) arr[i]=Integer.parseInt(in[i]);        return arr;    }     public long nextLong() throws IOException    {        return Long.parseLong(br.readLine());    }     public long[] nextLongArr(int n) throws IOException    {        String in[] = br.readLine().split(" ");        long arr[] = new long[n];        for(int i=0;i<n;++i) arr[i]=Long.parseLong(in[i]);        return arr;    }     public String next() throws IOException    {        return br.readLine();    }}