import java.io.BufferedReader;import java.io.File;import java.io.FileWriter;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.*; import javafx.util.Pair; public class Main{     public static void main(String args[])    {        FastScanner input = new FastScanner();      int n = input.nextInt();      int q = input.nextInt();      int bad = 0;      boolean check[][] = new boolean[3][n+1];            StringBuilder ans = new StringBuilder();        for (int i = 0; i <q ; i++) {            int x = input.nextInt();            int   y  = input.nextInt();                        if(!check[x][y])            {                check[x][y]= true;                if(y-1>=1&&check[3-x][y-1])                {                    bad++;                }                if(y+1<=n&&check[3-x][y+1])                {                    bad++;                }                if(check[3-x][y])                    bad++;                                                            }            else            {                check[x][y] = false;                                if(y-1>=1&&check[3-x][y-1])                {                    bad--;                }                if(y+1<=n&&check[3-x][y+1])                {                    bad--;                }                if(check[3-x][y])                    bad--;                            }            if(bad>=1)            {                ans.append("NO\n");            }            else                ans.append("YES\n");//            System.out.println("bad : " +bad);//            for (int j = 1; j <=2; j++) {//                for (int k = 1; k <=n; k++) {//                    System.out.print(check[j][k]+" ");//                }//                System.out.println("");//            }//            System.out.println("");        }        System.out.println(ans);           }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
