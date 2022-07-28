import java.io.*;import java.util.*; public class Main {     private static class Pair {        int x, y;         Pair(int x, int y) {            this.x = x;            this.y = y;        }    }     private static List<Pair> intersect(List<Pair> curPairs, List<Pair> tmpPairs) {        List<Pair> res = new ArrayList<>();        for (Pair p1 : curPairs) {            boolean isFound = false;            for (Pair p2 : tmpPairs) {                if (p1.x == p2.x && p1.y == p2.y) {                    isFound = true;                    break;                }            }            if (isFound) res.add(p1);        }        return res;    }     private static void solve(InputReader in, OutputWriter out) {        int n = in.nextInt();        int m = in.nextInt();         boolean isPossible = true;        List<List<Pair>> pairs = new ArrayList<>(n);        List<Pair> curPairs = new ArrayList<>();        for (int i = 0; i < n; i++) {            List<Integer> wrongIndices = new ArrayList<>();            int[] ar = new int[m];            for (int j = 0; j < m; j++) {                ar[j] = in.nextInt() - 1;                if (ar[j] != j) wrongIndices.add(j);            }             List<Pair> rowPairs = new ArrayList<>();            if (wrongIndices.size() > 4) {                isPossible = false;                break;            } else if (wrongIndices.size() == 4) {                int index = wrongIndices.get(0);                int val = ar[index];                 if (ar[val] != index) {                    isPossible = false;                    break;                } else {                    rowPairs.add(new Pair(index, val));                    wrongIndices.remove((Object) val);                    wrongIndices.remove((Object) index);                    rowPairs.add(new Pair(wrongIndices.get(0), wrongIndices.get(1)));                }            } else {                for (int j = 0; j < wrongIndices.size() - 1; j++) {                    for (int k = j + 1; k < wrongIndices.size(); k++) {                        rowPairs.add(new Pair(wrongIndices.get(j), wrongIndices.get(k)));                    }                }            }             pairs.add(rowPairs);            if (rowPairs.size() > curPairs.size()) curPairs = rowPairs;        }         if (isPossible && curPairs.size() > 1) {            for (List<Pair> tmpPairs : pairs) {                if (tmpPairs.size() > 0) {                    curPairs = intersect(curPairs, tmpPairs);                     if (curPairs.size() == 0) {                        isPossible = false;                        break;                    }                }            }        }         out.print(isPossible ? "YES" : "NO");    }     private static void shuffleArray(int[] array) {        int index;        Random random = new Random();        for (int i = array.length - 1; i > 0; i--) {            index = random.nextInt(i + 1);            if (index != i) {                array[index] ^= array[i];                array[i] ^= array[index];                array[index] ^= array[i];            }        }    }     public static void main(String[] args) {        InputReader in = new InputReader(System.in);        OutputWriter out = new OutputWriter(System.out);        solve(in, out);        in.close();        out.close();    }     private static class InputReader {        private BufferedReader br;        private StringTokenizer st;         InputReader(InputStream is) {            br = new BufferedReader(new InputStreamReader(is));            st = null;        }         String nextLine() {            String line = null;            try {                line = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return line;        }         String next() {            while (st == null || !st.hasMoreTokens()) {                String line = nextLine();                if (line == null) return null;                st = new StringTokenizer(line);            }            return st.nextToken();        }         byte nextByte() {            return Byte.parseByte(next());        }         short nextShort() {            return Short.parseShort(next());        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         void close() {            try {                br.close();            } catch (IOException e) {                e.printStackTrace();            }        }    }     private static class OutputWriter {        BufferedWriter bw;         OutputWriter(OutputStream os) {            bw = new BufferedWriter(new OutputStreamWriter(os));        }         void print(int i) {            print(Integer.toString(i));        }         void println(int i) {            println(Integer.toString(i));        }         void print(long l) {            print(Long.toString(l));        }         void println(long l) {            println(Long.toString(l));        }         void print(double d) {            print(Double.toString(d));        }         void println(double d) {            println(Double.toString(d));        }         void print(boolean b) {            print(Boolean.toString(b));        }         void println(boolean b) {            println(Boolean.toString(b));        }         void print(char c) {            try {                bw.write(c);            } catch (IOException e) {                e.printStackTrace();            }        }         void println(char c) {            println(Character.toString(c));        }         void print(String s) {            try {                bw.write(s);            } catch (IOException e) {                e.printStackTrace();            }        }         void println(String s) {            print(s);            print('\n');        }         void close() {            try {                bw.close();            } catch (IOException e) {                e.printStackTrace();            }        }    }}
