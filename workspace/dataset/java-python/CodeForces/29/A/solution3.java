import java.io.*;import java.util.*; public class Main {    static int n;    static HashMap<Integer, Integer> map = new HashMap<>();    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     public static void main(String[] args) throws IOException {        st.nextToken();        n = (int)st.nval;        int a, b;        while (n-- > 0) {            st.nextToken();            a = (int)st.nval;            st.nextToken();            b = (int)st.nval;            map.put(a, b);        }        int k1, k2;        boolean flag = false;        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {            k1 = entry.getKey() + entry.getValue();            if (map.containsKey(k1)) {                k2 = k1 + map.get(k1);                if (k2 == entry.getKey()) {                    flag = true;                    break;                }            }        }        bw.write(flag ? "YES" : "NO");        bw.close();    }}