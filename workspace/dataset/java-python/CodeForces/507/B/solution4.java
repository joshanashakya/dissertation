import java.io.BufferedReader;import java.io.FileReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.StringTokenizer;  public class ok {		public static void main(String[] args) {		InputReader in = new InputReader(System.in);		long r;		int x, y, xx, yy;	    r = in.nextInt();	    x = in.nextInt();	    y = in.nextInt();	    xx = in.nextInt();	    yy = in.nextInt();	    r*=2;	    long dist = (x - xx) * 1L * (x - xx) + (y - yy) * 1L * (y - yy);	    r *= r;	    int L = 0, R = 1000000;	    while(R > L)	    {	        int mid = L + (R - L) / 2;	        BigInteger temp = BigInteger.valueOf(mid);	        temp = temp.multiply(BigInteger.valueOf(mid));	        temp = temp.multiply(BigInteger.valueOf(r));	        int test = temp.compareTo(BigInteger.valueOf(dist));	        if(test == 0 || test == 1)	            R = mid;	        else L = mid + 1;	    }	    System.out.println(R);	}		static class InputReader {        private BufferedReader reader;        private StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream));            tokenizer = null;        }         public InputReader(FileReader stream) {            reader = new BufferedReader(stream);            tokenizer = null;        }         public String nextLine() {            try {                return reader.readLine();            } catch (IOException e) {                // TODO Auto-generated catch block                e.printStackTrace();                return null;            }        }         public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }    }} 