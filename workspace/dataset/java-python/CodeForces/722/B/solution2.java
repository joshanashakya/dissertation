import java.util.*;import java.io.*; public class Solution {    public static void main(String[] args) {        FastReader sc = new FastReader();        int n = sc.nextInt();         int[] pattern = new int[n];        String[] text = new String[n];         for (int i = 0; i < n; i++)            pattern[i] = sc.nextInt();         for (int i = 0; i < n; i++)            text[i] = sc.nextLine();         int f = 0;        for (int i = 0; i < n; i++) {            String curr = text[i];             // Count vowels            int c = 0;            for (int j = 0; j < curr.length(); j++) {                char ch = curr.charAt(j);                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='y')                    c++;             }             if (c != pattern[i]) {                f = 1;                break;            }        }         if (f == 1)            System.out.println("NO");        else            System.out.println("YES");    }     static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}	   		 		 	  	 	    					  			