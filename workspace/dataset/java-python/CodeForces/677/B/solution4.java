import java.io.*;import java.util.*; public class Main {     public static void main(String[] args) throws Exception {        Scanner scan = new Scanner(System.in);        PrintWriter pw = new PrintWriter(System.out);        int sz = scan.nextInt();        int h = scan.nextInt();        int k = scan.nextInt();        Queue<Integer> q = new LinkedList<Integer>();        for (int i = 0; i < sz; i++) {            q.add(scan.nextInt());        }        int height = 0;        long ans = 0;        while(!q.isEmpty()){            boolean f = false;            while (!q.isEmpty() && (q.peek()+height <= h)){                height += q.poll();                f = true;            }            if(!f){                ans ++;                height = 0;            }            else{                ans += height / k;                height -= ((height / k) * k);            }        }        if(height != 0)            ans ++;        pw.println(ans);        pw.flush();        pw.close();    }    static class Scanner    {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}         public String next() throws IOException        {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {return Integer.parseInt(next());}         public long nextLong() throws IOException {return Long.parseLong(next());}         public String nextLine() throws IOException {return br.readLine();}         public double nextDouble() throws IOException        {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if(x.charAt(0) == '-')            {                neg = true;                start++;            }            for(int i = start; i < x.length(); i++)                if(x.charAt(i) == '.')                {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                }                else                {                    sb.append(x.charAt(i));                    if(dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg?-1:1);        }         public boolean ready() throws IOException {return br.ready();}     }} 	  			   	 	  		 	 	  				 		 	