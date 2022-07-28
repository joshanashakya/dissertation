import java.io.*;import java.util.*; public class Solution{        public static void main(String[] args) throws Exception{        int[] nk = in.readA();        int n = nk[0], k = nk[1];        char[] guest = in.readLine().toCharArray();        boolean possible = true;        boolean[] alpha = new boolean[26];        int[] first = new int[26];        int[] end = new int[26];        Arrays.fill(first, -1);        Arrays.fill(end, -1);        for(int i = 0; i < n; i++){            if(first[guest[i] - 'A'] == -1) first[guest[i]-'A'] = i;            end[guest[i]-'A'] = i;        }         int r = -1, c = 0;        int mx = 0;        for(int i = 0; i < n; i++){            r = Math.max(r, end[guest[i] - 'A']);             if(first[guest[i] - 'A'] == i)                c++;            mx = Math.max(mx, c);            if(end[guest[i] - 'A'] == i){                c--;            }                    }         if(mx > k)   System.out.println("YES");        else System.out.println("NO");    }     static Inputer in;    static {        in = new Inputer();    }     static class Inputer{        BufferedReader br;        Inputer(){            try{                br = new BufferedReader(new InputStreamReader(System.in));            }            catch(Exception e){}        }        public int readInt() throws Exception{            return Integer.parseInt(readLine());        }        public long readLong() throws Exception{            return Long.parseLong(readLine());        }        public int[] readA(String delim) throws Exception{            String[] s = readLine().split(delim);            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public int[] readA() throws Exception{            String[] s = readLine().split("\\s+");            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public long[] readLA() throws Exception{            String[] s = readLine().split("\\s+");            long[] A = new long[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Long.parseLong(s[i]);            return A;        }        public String readLine() throws Exception{            return br.readLine();        }        public int[] copyA(int[] A){            int[] B = new int[A.length];            for(int i= 0 ; i < A.length; i++)                B[i] = A[i];            return B;        }    }}