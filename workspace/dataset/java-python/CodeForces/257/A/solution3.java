import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Main{    static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }                Arrays.sort(a);    }    public static void main(String args[])    {        FastScanner input = new FastScanner();                  int n = input.nextInt();       int device = input.nextInt();       int k = input.nextInt();       int a[] = new int[n];        for (int i = 0; i < n; i++) {            a[i] = input.nextInt();                    }        sort(a);        if(k>=device)        {            System.out.println("0");            return;        }        int total=0;        int used=0;                for (int i = n-1; i >=0; i--) {                      if(k>0)           {               used++;                k--;                total+=a[i];               if((total+k)>=device)               {                   System.out.println(used);                                      return;               }                                       }           else           {               used++;               total--;               total+=a[i];               if((total+k)>=device)               {                   System.out.println(used);                                      return;               }           }        }        System.out.println("-1");    }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
