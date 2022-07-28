import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer;     public class B {    	    	public static void main(String[] args) throws IOException{         		Scanner sc = new Scanner(System.in);    		PrintWriter out = new PrintWriter(System.out);    		char[] a = sc.nextLine().toCharArray();    		StringBuilder ans = new StringBuilder();    		boolean num = false, space = false;    		for(int i = 0; i < a.length; i++)    		{    			StringBuilder sb = new StringBuilder();    			while(i < a.length && a[i] >= '0' && a[i] <= '9') {sb.append(a[i]); i++;}    			if(sb.length() != 0)    			{    				if(num) sb = new StringBuilder(" " + sb);    				if(i != a.length) i--;    				ans.append(sb); num = true; space = false;     				continue;    			}    			if(a[i] == '.')    			{    				if(i != 0 && !space) sb.append(" ");    				sb.append("...");    				ans.append(sb);    				i += 2;    				num = false; space = false;    				continue;    			}    			if(a[i] == ',')    			{    				sb.append(",");    				if(i != a.length-1)    					sb.append(" ");    				ans.append(sb);    				num = false;    				space = true;    				continue;    			}    		}    		out.println(ans);    		out.flush();			out.close();    	}    	    	static class Scanner     	{    		StringTokenizer st;    		BufferedReader br;         		public Scanner(InputStream System){	br = new BufferedReader(new InputStreamReader(System));	}    		public String next() throws IOException     		{    			while (st == null || !st.hasMoreTokens())     				st = new StringTokenizer(br.readLine());    			return st.nextToken();    		}    		public String nextLine()throws IOException{return br.readLine();}    		public int nextInt() throws IOException {return Integer.parseInt(next());}    		public double nextDouble() throws IOException {return Double.parseDouble(next());}    		public char nextChar()throws IOException{return next().charAt(0);}    		public Long nextLong()throws IOException{return Long.parseLong(next());}    		public boolean ready() throws IOException{return br.ready();}    		public void waitForInput(){for(long i = 0; i < 3e9; i++);}    	}    }