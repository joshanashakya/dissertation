import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class CF551B {    static final int CHARS = 26;     public static void main(String[] args) throws IOException {        FastScanner sc = new FastScanner();        PrintWriter pw = new PrintWriter(System.out);         String a = sc.nextToken(), b = sc.nextToken(), c = sc.nextToken();        int[] freqA = freqCnt(a), freqB = freqCnt(b), freqC = freqCnt(c);         int maxBs = subs(freqA, freqB);        int maxTeams = 0, bs = 0, cs = 0;        for (int currBs = 0; currBs <= maxBs; currBs++) {            removeSubs(freqA, freqB, currBs);            int currCs = subs(freqA, freqC);            int currTeams = currBs + currCs;            if (currTeams > maxTeams) {                maxTeams = currTeams;                bs = currBs;                cs = currCs;            }            addSubs(freqA, freqB, currBs);        }        removeSubs(freqA, freqB, bs);        removeSubs(freqA, freqC, cs);        while (bs-- > 0)            pw.print(b);        while (cs-- > 0)            pw.print(c);        for (int i = 0; i < CHARS; i++)            while (freqA[i]-- > 0)                pw.print((char) ('a' + i));        pw.flush();    }     static int subs(int[] freqA, int[] freqB) {        int subs = Integer.MAX_VALUE;        for (int i = 0; i < CHARS; i++)            if (freqB[i] > 0)                subs = Math.min(subs, freqA[i] / freqB[i]);        return subs;    }     static void removeSubs(int[] freqA, int[] freqB, int subs) {        for (int i = 0; i < CHARS; i++)            freqA[i] -= subs * freqB[i];    }     static void addSubs(int[] freqA, int[] freqB, int subs) {        for (int i = 0; i < CHARS; i++)            freqA[i] += subs * freqB[i];    }     static int[] freqCnt(String s) {        int[] freq = new int[CHARS];        for (char ch : s.toCharArray())            freq[ch - 'a']++;        return freq;    }     static class FastScanner {        BufferedReader in;        StringTokenizer st;         public FastScanner() {            this.in = new BufferedReader(new InputStreamReader(System.in));        }         public String nextToken() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(in.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(nextToken());        }         public long nextLong() {            return Long.parseLong(nextToken());        }         public double nextDouble() {            return Double.parseDouble(nextToken());        }         public void close() throws IOException {            in.close();        }    }}
