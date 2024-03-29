import java.util.*; import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     // kth smallest string    // **including dups**     // count endpoint equivalence classes    // as well as total endpoint equivalence     String s;    int K;    SA sa;    StringBuilder sb = new StringBuilder();    void run(FastScanner in, PrintWriter out) {         s = in.next();        s += "$";        K = in.nextInt();        sa = new SA(s);         // for (int i = 0; i < 10; i++) {        //     System.out.println(sa.state[i].endposEquivalenceSetSize);        // }         // System.out.println();        // for (int i = 0; i < 10; i++) {        //     System.out.println(sa.state[i].totalEES);        // }           kthSmallest(0, K);        out.println(sb.toString());    }     void kthSmallest(int curr, int k) {        k -= sa.state[curr].endposEquivalenceSetSize;        if (k <= 0) return;         for (Map.Entry<Character, Integer> e : sa.state[curr].next.entrySet()) {             if (sa.state[e.getValue()].totalEES < k) {                k -= sa.state[e.getValue()].totalEES;            } else {                sb.append(e.getKey());                kthSmallest(e.getValue(), k);                return;            }        }        sb.append("No such line.");    }       class SA {        class State {            int len, link;            Map<Character, Integer> next = new TreeMap<>();             long endposEquivalenceSetSize = -1;             // sum of ees of nodes below me. used for skipping            long totalEES = -1;        }         int last, sz;        State[] state;         SA(String s) {            int n = s.length();            state = new State[2*n];             for (int i = 0; i < state.length; i++) state[i] = new State();            state[0].len = 0;            state[0].link = -1;             last = 0;            sz = 1;             for (char c : s.toCharArray()) extend(c);             computeEES(0);            state[0].endposEquivalenceSetSize = state[0].totalEES = 0;        }         void computeEES(int curr) {            if (state[curr].endposEquivalenceSetSize != -1) return;            state[curr].endposEquivalenceSetSize = 0;            state[curr].totalEES = 0;             for (Map.Entry<Character, Integer> e : state[curr].next.entrySet()) {                 if (state[e.getValue()].endposEquivalenceSetSize == -1) {                    computeEES(e.getValue());                }                 if (e.getKey().equals('$')) {                    state[curr].endposEquivalenceSetSize++;                } else {                    state[curr].endposEquivalenceSetSize += state[e.getValue()].endposEquivalenceSetSize;                }                state[curr].totalEES += state[e.getValue()].totalEES;            }            state[curr].totalEES += state[curr].endposEquivalenceSetSize;        }         void extend(char c) {            int curr = sz++;            int p = last;            state[curr].len = state[p].len+1;            while (p != -1 && !state[p].next.containsKey(c)) {                state[p].next.put(c, curr);                p = state[p].link;            }             if (p == -1) {                state[curr].link = 0;            } else {                int q = state[p].next.get(c);                if (state[q].len == state[p].len+1) {                    state[curr].link = q;                } else {                     int clone = sz++;                    state[clone].len = state[p].len + 1;                    state[clone].link = state[q].link;                    // state[clone].next = state[q].next;                    state[clone].next.putAll(state[q].next);                     while (p != -1 && state[p].next.get(c) == q) {                        state[p].next.put(c, clone);                        p = state[p].link;                    }                     state[curr].link = state[q].link = clone;                }            }            last = curr;        }     }      static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}
