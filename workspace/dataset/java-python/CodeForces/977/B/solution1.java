/** * * @author aditya */import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.HashMap;import java.util.Map;import java.util.StringTokenizer;import java.util.TreeMap; public class TwoGram { 	public static void main(String[] args) {            FastScanner fs=new FastScanner();            int T=1;            PrintWriter out=new PrintWriter(System.out);            for (int tt=0; tt<T; tt++) {                int n = fs.nextInt();                String s = fs.next();                HashMap<String,Integer> hs = new HashMap<>();                for(int i=0;i<n-1;i++){                    String str = s.substring(i,i+2);                    if(hs.containsKey(str)){                        hs.put(str, hs.get(str)+1);                    }else{                        hs.put(str, 1);                    }                }                int count=0;                String ans="";                for(Map.Entry m : hs.entrySet()){                    if(Integer.parseInt(m.getValue().toString())>count){                        count=Integer.parseInt(m.getValue().toString());                        ans=m.getKey().toString();                    }                }                System.out.println(ans);            }            out.close();	}		static class FastScanner {            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            StringTokenizer st=new StringTokenizer("");            public String next() {            while (!st.hasMoreElements())		try {                    st=new StringTokenizer(br.readLine());		} catch (IOException e) {                    e.printStackTrace();		}		return st.nextToken();            }		            int[] readArray(int n) {            int[] a=new int[n];             for (int i=0; i<n; i++) a[i]=nextInt();		return a;            }            int nextInt () {                return Integer.parseInt(next());            }	} }