import java.io.BufferedReader;import java.io.File;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.HashMap;import java.util.Map;import java.util.StringTokenizer;  public class Main { 	static Map<Character, Integer> map = new HashMap<>();		static {		for(int i = 0;i<=9;i++) {			map.put((char)(i+'0'), i);		}		for(int i=0;i<=25;i++) {			map.put((char)(i+'A'), i+10);		}	}		public static void main(String[] args) { 		FastReader in = new FastReader();		PrintWriter out = new PrintWriter(System.out);				String str = in.next();		String hours = str.substring(0, str.indexOf(':'));		String minuts = str.substring(str.indexOf(':')+1, str.length());				long hh = getValue(hours, 100);		long mm = getValue(minuts, 100);		if(hh<24&&mm<60) {        	out.println(-1);        	out.close();        	return;        }				StringBuilder sb = new StringBuilder();        for(int i=2;i<=60;i++) {        	int h = (int)getValue(hours, i);        	int m = (int)getValue(minuts, i);            if(isPoss(hours, i)&&isPoss(minuts, i)&&h<24&&m<60) {            	sb.append(i+" ");            }        }		        if(sb.length()==0) {        	out.println(0);        }        else out.println(sb);		out.close();	}	static long getValue(String str, int base) {		long res = 0, p = str.length()-1;		for(char ch: str.toCharArray()) {			res+=(long)Math.pow(base, p) * map.get(ch); 			p--;		}		return res;	}	static boolean isPoss(String str, int v) {		for(char ch: str.toCharArray()) {			if(map.get(ch)>=v)return false;		}		return true;	}		static class FastReader {			        BufferedReader br;        StringTokenizer st;         public FastReader() {        	            br = new BufferedReader(new                    InputStreamReader(System.in));        }                public FastReader(File file) throws FileNotFoundException {        	        	br = new BufferedReader(        			new FileReader(file));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }	        	 } }
