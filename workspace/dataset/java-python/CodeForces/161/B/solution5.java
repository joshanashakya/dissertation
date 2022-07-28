import java.io.*;import java.util.*;  public class Main {      public static void main(String[] args) throws IOException {        Scanner sc = new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);        int n = sc.nextInt();        int k = sc.nextInt();        ArrayList<Item> carts[] = new ArrayList[k];        for (int i = 0; i < k; i++)            carts[i] = new ArrayList<>();        boolean[] discount = new boolean[k];        PriorityQueue<Item> stools = new PriorityQueue<>();        LinkedList<Item> pencils = new LinkedList<>();        for (int i = 0; i < n; i++) {            int cost = sc.nextInt();            int type = sc.nextInt();            if (type == 1) stools.add(new Item(cost, type, i));            else pencils.add(new Item(cost, type, i));        }        Collections.sort(pencils);        for (int i = 0; i < k; i++) {            if (!stools.isEmpty()) {                carts[i].add(stools.remove());                discount[i] = true;            } else carts[i].add(pencils.removeLast());        }        while (!stools.isEmpty())            carts[k - 1].add(stools.remove());        while (!pencils.isEmpty())            carts[k - 1].add(pencils.remove());        double ans = 0;        StringBuilder sb = new StringBuilder();        for (int i = 0; i < k; i++) {            sb.append(carts[i].size() + " ");            int min = Integer.MAX_VALUE;            for (Item x : carts[i]) {                ans += x.cost;                sb.append(x.idx + 1 + " ");                min = Math.min(min, x.cost);            }            sb.append("\n");            if (discount[i]) ans -= min / 2.0;        }        out.printf("%.1f\n", ans);        out.println(sb);        out.flush();        out.close();     }     static class Item implements Comparable<Item> {        int cost, type, idx;         public Item(int cost, int type, int idx) {            this.cost = cost;            this.type = type;            this.idx = idx;        }         @Override        public int compareTo(Item o) {            return o.cost - cost;        }    }      static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream system) {            br = new BufferedReader(new InputStreamReader(system));        }          public String next() throws IOException {            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public String nextLine() throws IOException {            return br.readLine();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public double nextDouble() throws IOException {            return Double.parseDouble(next());        }         public char nextChar() throws IOException {            return next().charAt(0);        }         public Long nextLong() throws IOException {            return Long.parseLong(next());        }         public boolean ready() throws IOException {            return br.ready();        }          public int[] nextIntArray(int n) throws IOException {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public long[] nextLongArray(int n) throws IOException {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }          public Integer[] nextIntegerArray(int n) throws IOException {            Integer[] a = new Integer[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public double[] nextDoubleArray(int n) throws IOException {            double[] ans = new double[n];            for (int i = 0; i < n; i++)                ans[i] = nextDouble();            return ans;        }         public short nextShort() throws IOException {            return Short.parseShort(next());        }     } }
