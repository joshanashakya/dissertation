import java.io.*;import java.util.*;public class VsRohan{	static Reader sc=new Reader();    static PrintWriter out=new PrintWriter((System.out));    public static void main(String args[])throws IOException    {        int t=sc.nextInt();        char bet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};        int ans[] = new int[26];        for(int i = 0; i < t; ++i) {        	String s = sc.next();        	char c= s.charAt(0);        	for(int j = 0; j < 26; ++j) {        		if(bet[j]==c) {        			++ans[j];        			break;        		}        	}        }        long sum = 0;        for(int i = 0; i < 26; ++i) {        	int x = (ans[i]/2), y = ans[i]-ans[i]/2;        	sum += x*(x-1)/2;        	sum += y*(y-1)/2;        }        System.out.println(sum);    }     static class Reader     {         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        public String next()        {            while(!st.hasMoreTokens())            {                try                {                    st=new StringTokenizer(br.readLine());                }                catch(Exception e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }        public int nextInt()        {            return Integer.parseInt(next());        }        public long nextLong()        {            return Long.parseLong(next());        }        public double nextDouble()        {            return Double.parseDouble(next());        }        public String nextLine()        {            try            {                return br.readLine();            }            catch(Exception e)            {                e.printStackTrace();            }            return null;        }        public boolean hasNext()        {            String next=null;            try            {                next=br.readLine();            }            catch(Exception e)            {            }            if(next==null)            {                return false;            }            st=new StringTokenizer(next);            return true;        }    } }
