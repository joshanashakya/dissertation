import java.util.*;import java.io.*;import java.text.*;/** * * @author alanl */public class Main{    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));    public static void main(String[] args) throws IOException{        int n = readInt(), v = readInt(), arr[] = new int[n], arr1[] = new int[n], val = 0;        double min = Double.MAX_VALUE;        for(int i = 0; i<n; i++){            arr[i] = readInt();            val+=arr[i];        }        for(int i = 0; i<n; i++){            arr1[i] = readInt();            min = Math.min(min, arr1[i]/1.0/arr[i]);        }                for(double i = min; i>=0; i-=0.00001){            double cur = i*val;            /*for(int j = 0; j<n; j++){                cur+=i*arr[j];            }*/            if(cur<=v){                System.out.println(cur);                return;            }        }    }    static String next () throws IOException {        while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(input.readLine().trim());        return st.nextToken();    }    static long readLong () throws IOException {        return Long.parseLong(next());    }    static int readInt () throws IOException {        return Integer.parseInt(next());    }    static double readDouble () throws IOException {        return Double.parseDouble(next());    }    static char readChar () throws IOException {        return next().charAt(0);    }    static String readLine () throws IOException {        return input.readLine().trim();    }    /* stuff you should look for	* int overflow, array bounds	* special cases (n=1?)	* do smth instead of nothing and stay organized	* WRITE STUFF DOWN	* DON'T GET STUCK ON ONE APPROACH    // Did you read the bounds?    // Did you make typos?    // Are there edge cases (N=1?)    // Are array sizes proper (scaled by proper constant, for example 2* for koosaga tree)    // Integer overflow?    // DS reset properly between test cases?    // Is using long longs causing TLE?    // Are you using floating points?    */}