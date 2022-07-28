import java.io.*;import java.util.*; public class Main {    static int t, n;    static PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.a == o2.a ? o1.id - o2.id : o1.a - o2.a);    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     static class Node {        int a, b, id;         public Node(int a, int b, int id) {            this.a = a;            this.b = b;            this.id = id;        }    }     public static void main(String[] args) throws IOException {        st.nextToken();        t = (int)st.nval;        int a, b, k;        while (t-- > 0) {            st.nextToken();            n = (int)st.nval;            k = 1;            for (int i = 0; i < n; ++i) {                st.nextToken();                a = (int)st.nval;                st.nextToken();                b = (int)st.nval;                pq.add(new Node(a, b, i));            }            while (!pq.isEmpty()) {                while (k < pq.peek().a) {                    ++k;                }                bw.write((k > pq.poll().b ? 0 : k++) + " ");            }            bw.write("\n");        }        bw.close();    }}
