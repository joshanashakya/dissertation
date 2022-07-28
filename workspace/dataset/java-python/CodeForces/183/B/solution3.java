import java.io.*;import java.util.*; public class Main {	public static void main(String[] args) {		InputStream inputStream = System.in;		OutputStream outputStream = System.out;		InputReader in = new InputReader(inputStream);		PrintWriter out = new PrintWriter(outputStream);		GGGG solver = new GGGG();		solver.solve(1, in, out);		out.close();	}} class GGGG {	public void solve(int testNumber, InputReader in, PrintWriter out) {        int n = in.nextInt();        int m = in.nextInt();        int[] xs = new int[m];        int[] ys = new int[m];        for (int i = 0 ;i < m; ++i) {            xs[i] = in.nextInt();            ys[i] = in.nextInt();        }        int[] count = new int[n + 1];        Arrays.fill(count, 1);        count[0] = 0;        for (int i = 0; i < m; ++i) {            for (int j = i + 1; j < m; ++j) {                long a = ys[i] - ys[j];                long b = xs[j] - xs[i];                long c = -(1l * a * xs[i] + 1l * b * ys[i]);                int cc = 0;                for (int k = 0; k < m; ++k) {                    if (a * xs[k] + b * ys[k] + c == 0) {                        ++cc;                    }                }                if (a != 0 && c % a == 0) {                    long x = -c / a;                    if (x >= 1 && x <= n) {                        count[(int)x] = Math.max(count[(int)x], cc);                    }                }            }        }        long ans=  0;        for (int c : count) {            ans += c;        }        out.println(ans);	}} class InputReader {    private StringTokenizer tokenizer;    private BufferedReader reader;     public InputReader(InputStream inputStream) {        reader = new BufferedReader(new InputStreamReader(inputStream));    }     public String next() {        while (tokenizer == null || !tokenizer.hasMoreTokens()) {            try {                tokenizer = new StringTokenizer(reader.readLine());            } catch (IOException e) {                e.printStackTrace();                throw new UnknownError();            }        }        return tokenizer.nextToken();    }     public int nextInt() {        return Integer.parseInt(next());    } }     			    		 	  		   			 		
