import java.io.*;import java.util.*; public class Main{     static BufferedReader br;    static StringTokenizer st;    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        public static class AL<T> extends ArrayList<T> {};    public static class HM<T,Integer> extends HashMap<T,T> {};     public static void main(String[] args) throws IOException 	{		br = new BufferedReader(new InputStreamReader(System.in));		st = new StringTokenizer(br.readLine()); 		    int n = nxtInt(), m = nxtInt();		    int[][] a = new int[n][m];		    		    int ans = 0;		    boolean flg = false;		    		    for(int i=0; i<n; i++)		    {		        flg = false;		        st = new StringTokenizer(br.readLine());		        for(int j=0; j<m; j++)		        {		            a[i][j] = nxtInt();		            if(a[i][j] == 1) flg = true;		            else if(flg && a[i][j] == 0) ans++;		        }		    }		    		    for(int i=0; i<n; i++)		    {		        flg = false;		        for(int j=m-1; j>=0; j--)		        {		            if(a[i][j] == 1) flg = true;		            else if(flg && a[i][j] == 0) ans++;		        }		    }		    		    for(int i=0; i<m; i++)		    {		        flg = false;		        for(int j=0; j<n; j++)		        {		            if(a[j][i] == 1) flg = true;		            else if(flg && a[j][i] == 0) ans++;		        }		    }		    		    for(int i=0; i<m; i++)		    {		        flg = false;		        for(int j=n-1; j>=0; j--)		        {		            if(a[j][i] == 1) flg = true;		            else if(flg && a[j][i] == 0) ans++;		        }		    } 		    pr.println(ans);    						pr.flush();		pr.close();    }        static int nxtInt(){        return Integer.parseInt(nxt());    }        static long nxtLong(){        return Long.parseLong(nxt());    }        static double nxtDoub(){        return Double.parseDouble(nxt());    }        static String nxt(){        return st.nextToken();    }        static String nxtLn() throws IOException{        return br.readLine();    }}
