import java.io.*;import java.util.*; public class Template implements Runnable {     BufferedReader in;    PrintWriter out;    StringTokenizer tok = new StringTokenizer("");     void init() throws FileNotFoundException {        try {            in = new BufferedReader(new FileReader("input.txt"));            out = new PrintWriter("output.txt");        } catch (Exception e) {            in = new BufferedReader(new InputStreamReader(System.in));            out = new PrintWriter(System.out);        }    }     class GraphBuilder {        int n, m;        int[] x, y;        int index;        int[] size;          GraphBuilder(int n, int m) {            this.n = n;            this.m = m;            x = new int[m];            y = new int[m];            size = new int[n];        }         void add(int u, int v) {            x[index] = u;            y[index] = v;            size[u]++;            size[v]++;            index++;        }         int[][] build() {            int[][] graph = new int[n][];            for (int i = 0; i < n; i++) {                graph[i] = new int[size[i]];            }            for (int i = index - 1; i >= 0; i--) {                int u = x[i];                int v = y[i];                graph[u][--size[u]] = v;                graph[v][--size[v]] = u;            }            return graph;        }    }     String readString() throws IOException {        while (!tok.hasMoreTokens()) {            try {                tok = new StringTokenizer(in.readLine());            } catch (Exception e) {                return null;            }        }        return tok.nextToken();    }     int readInt() throws IOException {        return Integer.parseInt(readString());    }     int[] readIntArray(int size) throws IOException {        int[] res = new int[size];        for (int i = 0; i < size; i++) {            res[i] = readInt();        }        return res;    }     long[] readLongArray(int size) throws IOException {        long[] res = new long[size];        for (int i = 0; i < size; i++) {            res[i] = readLong();        }        return res;    }     long readLong() throws IOException {        return Long.parseLong(readString());    }     double readDouble() throws IOException {        return Double.parseDouble(readString());    }     <T> List<T>[] createGraphList(int size) {        List<T>[] list = new List[size];        for (int i = 0; i < size; i++) {            list[i] = new ArrayList<>();        }        return list;    }     public static void main(String[] args) {        new Template().run();        // new Thread(null, new Template(), "", 1l * 200 * 1024 * 1024).start();    }     long timeBegin, timeEnd;     void time() {        timeEnd = System.currentTimeMillis();        System.err.println("Time = " + (timeEnd - timeBegin));    }     long memoryTotal, memoryFree;     void memory() {        memoryFree = Runtime.getRuntime().freeMemory();        System.err.println("Memory = " + ((memoryTotal - memoryFree) >> 10)                + " KB");    }     public void run() {        try {            timeBegin = System.currentTimeMillis();            memoryTotal = Runtime.getRuntime().freeMemory();            init();            solve();            out.close();            if (System.getProperty("ONLINE_JUDGE") == null) {                time();                memory();            }        } catch (Exception e) {            e.printStackTrace();            System.exit(-1);        }    }      void brut(int[] a, int pos) {        if (a.length == pos) {            for (int i = 0; i < a.length; i++) {                if (a[a[i]] != a.length - 1 - i) return;            }            System.err.println(Arrays.toString(a));            return;        }        for (int i = pos; i < a.length; i++) {            int t = a[i];            a[i] = a[pos];            a[pos] = t;            brut(a, pos + 1);            t = a[i];            a[i] = a[pos];            a[pos] = t;        }    }     void solve() throws IOException {//        while (true) {//            String s = readString();//            if (s == null) break;//            out.println("list.add(\"" + s + "\");");//        }        ArrayList<String> list = new ArrayList<>();        list.add("111111101010101111100101001111111");        list.add("100000100000000001010110001000001");        list.add("101110100110110000011010001011101");        list.add("101110101011001001111101001011101");        list.add("101110101100011000111100101011101");        list.add("100000101010101011010000101000001");        list.add("111111101010101010101010101111111");        list.add("000000001111101111100111100000000");        list.add("100010111100100001011110111111001");        list.add("110111001111111100100001000101100");        list.add("011100111010000101000111010001010");        list.add("011110000110001111110101100000011");        list.add("111111111111111000111001001011000");        list.add("111000010111010011010011010100100");        list.add("101010100010110010110101010000010");        list.add("101100000101010001111101000000000");        list.add("000010100011001101000111101011010");        list.add("101001001111101111000101010001110");        list.add("101101111111000100100001110001000");        list.add("000010011000100110000011010000010");        list.add("001101101001101110010010011011000");        list.add("011101011010001000111101010100110");        list.add("111010100110011101001101000001110");        list.add("110001010010101111000101111111000");        list.add("001000111011100001010110111110000");        list.add("000000001110010110100010100010110");        list.add("111111101000101111000110101011010");        list.add("100000100111010101111100100011011");        list.add("101110101001010000101000111111000");        list.add("101110100011010010010111111011010");        list.add("101110100100011011110110101110000");        list.add("100000100110011001111100111100000");        list.add("111111101101000101001101110010001");        out.println(list.get(readInt()).charAt(readInt()));      }  }
