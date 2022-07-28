import java.io.*;import java.util.*; public class Main2{	static void main() throws Exception{    	int d=sc.nextInt(),s=sc.nextInt();    	int inf=(int)1e9;    	int[][]memo=new int[s+1][d];    	int[][]par=new int[s+1][d];    	int[][][]par2=new int[s+1][d][2];    	    	for(int i=0;i<d;i++) {    		for(int j=0;j<=s;j++)memo[j][i]=inf;    	}    	memo[0][0]=0;    	LinkedList<int[]>q=new LinkedList<int[]>();    	q.add(new int[] {0,0});    	while(!q.isEmpty()) {    		int[]cur=q.poll();    		int curs=cur[0],curd=cur[1];    		for(int digit=0;digit<10;digit++) {    			int nxts=curs+digit,nxtd=(curd*10+digit)%d;    			if(nxts>s)continue;    			if(memo[curs][curd]+1<memo[nxts][nxtd]) {    				memo[nxts][nxtd]=1+memo[curs][curd];    				par[nxts][nxtd]=digit;    				par2[nxts][nxtd]=new int[] {curs,curd};    				q.add(new int[] {nxts,nxtd});    			}    			else {    				if(memo[curs][curd]+1<memo[nxts][nxtd]) {    					if(digit>par[nxts][nxtd]) {    						par[nxts][nxtd]=digit;    	    				par2[nxts][nxtd]=new int[] {curs,curd};    					}    				}    			}    		}    	}    	if(memo[s][0]==inf) {    		pw.println(-1);    		return;    	}    	LinkedList<Integer>ans=new LinkedList<Integer>();    	int[]cur=new int[] {s,0};    	while(!(cur[0]==0 && cur[1]==0)) {    		int curs=cur[0],curd=cur[1];    		ans.addFirst(par[curs][curd]);    		cur[0]=par2[curs][curd][0];    		cur[1]=par2[curs][curd][1];    	}    	while(!ans.isEmpty())pw.print(ans.poll());    	pw.println();    }    public static void main(String[] args) throws Exception{        sc=new MScanner(System.in);        pw = new PrintWriter(System.out);        int tc=1;//        tc=sc.nextInt();        for(int i=1;i<=tc;i++) {//            pw.printf("Case %d:\n", i);            main();        }        pw.flush();    }    static PrintWriter pw;    static MScanner sc;    static class MScanner {        StringTokenizer st;        BufferedReader br;        public MScanner(InputStream system) {            br = new BufferedReader(new InputStreamReader(system));        }             public MScanner(String file) throws Exception {            br = new BufferedReader(new FileReader(file));        }             public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }        public int[] intArr(int n) throws IOException {            int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();            return in;        }        public long[] longArr(int n) throws IOException {            long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();            return in;        }        public int[] intSortedArr(int n) throws IOException {            int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();            shuffle(in);            Arrays.sort(in);            return in;        }        public long[] longSortedArr(int n) throws IOException {            long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();            shuffle(in);            Arrays.sort(in);            return in;        }        public Integer[] IntegerArr(int n) throws IOException {            Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();            return in;        }        public Long[] LongArr(int n) throws IOException {            Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();            return in;        }        public String nextLine() throws IOException {            return br.readLine();        }             public int nextInt() throws IOException {            return Integer.parseInt(next());        }             public double nextDouble() throws IOException {            return Double.parseDouble(next());        }             public char nextChar() throws IOException {            return next().charAt(0);        }             public long nextLong() throws IOException {            return Long.parseLong(next());        }             public boolean ready() throws IOException {            return br.ready();        }             public void waitForInput() throws InterruptedException {            Thread.sleep(3000);        }            }    static void shuffle(int[]in) {        for(int i=0;i<in.length;i++) {            int idx=(int)(Math.random()*in.length);            int tmp=in[i];            in[i]=in[idx];            in[idx]=tmp;        }    }    static void shuffle(long[]in) {        for(int i=0;i<in.length;i++) {            int idx=(int)(Math.random()*in.length);            long tmp=in[i];            in[i]=in[idx];            in[idx]=tmp;        }    }}
