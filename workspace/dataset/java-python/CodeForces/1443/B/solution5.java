import java.util.*;import java.io.*; public class Main2 {	static class FastReader{         BufferedReader br;         StringTokenizer st;         public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}        String next(){ while (st == null || !st.hasMoreElements()){                 try{st = new StringTokenizer(br.readLine());}                 catch (IOException  e){e.printStackTrace();}}             return st.nextToken();}        int nextInt(){ return Integer.parseInt(next());}        long nextLong(){return Long.parseLong(next());}         double nextDouble(){return Double.parseDouble(next());}        String nextLine(){             String str = "";             try{str = br.readLine(); }             catch (IOException e) {e.printStackTrace();}             return str; }     }	static FastReader sc = new FastReader();	public static void main (String[] args) {		PrintWriter out = new PrintWriter(System.out);		int t = 1;    	t = sc.nextInt();    	while(t-->0) {    		int a = sc.nextInt();    		int b = sc.nextInt();    		char s[] = sc.next().toCharArray();    		long cost = 0;    		int pre = -1, cnt = 0;    		for(int i=0;i<s.length;i++) {    			char c = s[i];    			if(c == '1') {    				if(pre!=-1) {    					if(cnt == 0) {    						cost = Math.min(2*a, a + b*(i - pre - 1));    					}    					else {    						if(a<b*(i-pre-1)) cost += a;    						else cost += b*(i - pre - 1);    					}    					pre = -1;    					cnt++;    					while(i<s.length && s[i]!='0') i++;    					if(i == s.length) break;    					i--;    				}    				if(i+1 == s.length || s[i+1] == '0')    					pre = i;    			}    		}    		if(cnt == 0 && pre!=-1) cost += a;    		out.write(cost+"\n");      	}		out.close();	}}