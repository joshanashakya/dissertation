import java.io.*;import java.util.ArrayList;import java.util.Collections;import java.util.StringTokenizer;// نورت الكود يا كبير اتفضل // يا رب Acceptedpublic class TavasAndSaDDas {    public static void main(String[] args) {        FastReader in = new FastReader();        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));         long n = in.nextInt();        ArrayList<Long> nums = new ArrayList<>();        nums.add(0L);        for (int i = 0; i <= 510; i++) {            long four = (nums.get(i) * 10) + 4;            nums.add(four);            long seven = (nums.get(i) * 10) + 7;            nums.add(seven);        }        Collections.sort(nums);        int index = Collections.binarySearch(nums, n);        out.println(index);        out.close();    }     private static class FastReader {        BufferedReader br;        StringTokenizer st;         FastReader() {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }    }}
