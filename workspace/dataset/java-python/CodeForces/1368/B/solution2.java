import java.io.BufferedReader;import java.io.File;import java.io.FileWriter;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }     public static void main(String[] args) throws IOException    {         FastScanner input = new FastScanner();        long n = input.nextLong();        long k=1;        String s="codeforces";        int a[] = new int[10];        for (int i = 0; i <10; i++) {            a[i]=1;        }        int i=0;        while(k<n)        {            k/=a[i%10];            a[i%10]++;            k*=a[i%10];            i++;        }        for (int j = 0; j <10; j++) {            for (int l = 0; l < a[j]; l++) {                System.out.print(s.charAt(j));            }        }        System.out.println("");           }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }