import java.io.File;import java.io.IOException;import java.io.OutputStream;import java.io.PrintWriter;import java.lang.reflect.Array;import java.math.BigInteger;import java.util.*;import java.io.DataInputStream;import java.io.InputStream;import java.util.InputMismatchException; import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.math.BigDecimal;import java.math.BigInteger;import java.util.StringTokenizer;  public class Main {    public static void main(String[] argv)  {        Task t = new Task();       // Scanner in =  new Scanner(new File("input.txt"));        Scanner in = new Scanner(System.in);       // Scanner in = new Scanner()        //InputStream inputStream = System.in;		//OutputStream outputStream = System.out;		//InputReader in = new InputReader(inputStream);		//PrintWriter out = new PrintWriter(outputStream);		       // PrintWriter out = new PrintWriter(new File("output.txt"));        PrintWriter out = new PrintWriter(System.out);        //in.useLocale(Locale.US);               t = new Task();        t.in = in;        t.out = out;        t.run();        out.println();        out.flush();        out.close();    } }   class Task {    public Scanner in;    public PrintWriter out;     public void run() {    	int j;        int n = in.nextInt();        double T = in.nextInt(),                c = in.nextDouble();        int[] A = new int[n];        for(int i = 0;i<n;i++) A[i] = in.nextInt();        int m =in.nextInt();        int[] P = new int[m+1];        for(int i = 0;i<m;i++) P[i] = in.nextInt()-1;        int pi=0;        long[] sm = new long[n];        sm[0]=A[0];        for(int i=1; i<n; ++i) sm[i]=sm[i-1]+A[i];                double mean = 0.0;        for(int i = 0;i<n;i++)        {            mean = (mean + (double) A[i]/T) / c;            if(i==P[pi])            {                pi++;                long sum = 0;                j = i-(int)T;                sum = sm[i];                if(j>=0) sum-=sm[j];                             double real = ((double) sum)/T;                double error = Math.abs(real - mean) / real;                out.println( String.format("%f", real) + " " + String.format("%f", mean) + " " +  String.format("%f",error));            }        }     }}  class InputReader{    private BufferedReader reader;    private StringTokenizer tokenizer;     public InputReader(InputStream stream){        reader = new BufferedReader(new InputStreamReader(stream));        tokenizer = null;    }        public String next(){        while (tokenizer == null || !tokenizer.hasMoreTokens()){            try{                tokenizer = new StringTokenizer(reader.readLine());            }catch (IOException e){                throw new RuntimeException(e);            }        }        return tokenizer.nextToken();    }        public String nextLine(){        tokenizer = null;        try{            return reader.readLine();        }catch (IOException e){            throw new RuntimeException(e);        }    }        public int nextInt(){        return Integer.parseInt(next());    }     public long nextLong(){        return Long.parseLong(next());    }        public double nextDouble(){        return Double.parseDouble(next());    }     public BigInteger nextBigInteger() {        return new BigInteger(next());    }     public BigDecimal nextBigDecimal() {        return new BigDecimal(next());    }        public int[] nextIntArray(int n){        int res[] = new int[n];        for(int i=0;i<n;++i) res[i] = nextInt();        return res;    }}
