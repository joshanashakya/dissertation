import java.util.*;import java.io.*;public class B{    static PrintWriter out;    static InputReader in;    public static void main(String args[]){        out = new PrintWriter(System.out);        in = new InputReader();        new B();        out.flush(); out.close();    }        final int mod = (int)(1e9) + 7;    String s, t;     B(){        s = in.next().trim(); t = in.next().trim();        StringBuilder sb = new StringBuilder();        sb.append(t); sb.append("$"); sb.append(s);        int l = sb.length();        String x = sb.toString();        int z[]=new int[l],L=0,R=0;z[0]=0;         for(int i=1;i<l;i++) {             if(R<i) {                 L=R=i;                 while(R<l&&x.charAt(R)==x.charAt(R-L))++R;                 z[i]=R-L;--R;             }else {                 if(z[i-L]<R-i+1)z[i]=z[i-L];                 else {                     L=i;                     while(R<l&&x.charAt(R)==x.charAt(R-L))++R;                     z[i]=R-L;--R;                 }             }         }          int lt = t.length(), ls = s.length();         int a[] = new int[ls];         for(int i = lt + 1; i < l; i++)a[i - lt - 1] = z[i];             long dp[] = new long[ls + 1];            long ps[] = new long[ls + 1];            dp[ls] = 1; ps[ls] = 1;            int cp = -1;            for(int i = ls - 1; i >= 0; i--){                if(a[i] == lt){                    cp = i;                }                // cp + lt .. ls                dp[i] = (dp[i + 1] + (cp >= 0 ? ps[cp + lt] : 0)) % mod;                ps[i] = (dp[i] + ps[i + 1]) % mod;             }            out.print((dp[0] - 1 + mod) % mod);    }    public static class InputReader{        BufferedReader br;        StringTokenizer st;        InputReader(){            br = new BufferedReader(new InputStreamReader(System.in));        }        public int nextInt(){            return Integer.parseInt(next());        }        public long nextLong(){            return Long.parseLong(next());        }        public double nextDouble(){            return Double.parseDouble(next());        }        public String next(){            while(st == null || !st.hasMoreTokens()){                try{                    st = new StringTokenizer(br.readLine());                }catch(IOException e){}            }            return st.nextToken();        }    }}        
