import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; import java.util.*;import javafx.util.Pair; public class Main{       static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }                Arrays.sort(a);    }    public static void main(String args[])    {        FastScanner input = new FastScanner();      int n = input.nextInt();      int m = input.nextInt();      int k = input.nextInt();      int a[] = new int[n];        for (int i = 0; i < n; i++) {            a[i] = input.nextInt();        }        long size = a[n-1]-a[0]+1;//        System.out.println(size);         int dif[] = new int[n-1];          for (int i = 0; i < n-1; i++) {              dif[i] = a[i+1]-a[i]-1;          }          sort(dif);          int temp = dif.length-1;//                    System.out.println(Arrays.toString(dif));           while(k-->1)          {              size-=dif[temp];              temp--;          }          System.out.println(size);    }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }