import java.io.*;import java.util.*; /** * @author Tran Anh Tai * @template for CP codes * What a trick prob! */public class ProbB {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        InputReader in = new InputReader(inputStream);        PrintWriter out = new PrintWriter(outputStream);        Task solver = new Task();        solver.solve(in, out);        out.close();    }    // main solver    static class Task {        int a[][] = new int[25][25];        public void solve(InputReader in, PrintWriter out) {            int n = in.nextInt();            int m = in.nextInt();            int result = 1;            char map[][] = new char[n][m];            for (int i = 0; i < n; i++){                map[i] = in.nextToken().toCharArray();            }            for (int topX = 0; topX < n; topX++){                for (int topY = 0; topY < m; topY++){                    for (int bottomX = topX; bottomX < n; bottomX++){                        for (int bottomY = topY; bottomY < m; bottomY++){                            int sum = 0;                            for (int x = topX; x <= bottomX; x++){                                for (int y = topY; y <= bottomY; y++){                                    sum += (map[x][y] - '0');                                    if (sum > 0){                                        break;                                    }                                }                                if (sum > 0){                                    break;                                }                            }                            if (sum == 0){                                result = Math.max(result, 2 * ((bottomX - topX + 1) + (bottomY - topY + 1)));                            }                        }                    }                }            }            out.println(result);        }    }    // fast input reader class;    static class InputReader {        BufferedReader br;        StringTokenizer st;         public InputReader(InputStream stream) {            br = new BufferedReader(new InputStreamReader(stream));        }         public String nextToken() {            while (st == null || !st.hasMoreTokens()) {                String line = null;                try {                    line = br.readLine();                } catch (IOException e) {                    throw new RuntimeException(e);                }                if (line == null) {                    return null;                }                st = new StringTokenizer(line);            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(nextToken());        }        public long nextLong(){            return Long.parseLong(nextToken());        }    }}
