import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class A_HQ9_{    public static void main (String[] args) throws java.lang.Exception    {          FastReader fs = new FastReader();          char c[]= fs.nextLine().toCharArray();          boolean hh=false;          for(int i=0;i<c.length;i++){                if(c[i]=='H'||c[i]=='Q'||c[i]=='9')                hh=true;           }          if(hh)          System.out.println("YES");          else          System.out.println("NO"); }        static class FastReader         {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(                new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                    }                catch (IOException e) {                    e.printStackTrace();                    }        }            return st.nextToken();        }         int nextInt() { return Integer.parseInt(next()); }         long nextLong() { return Long.parseLong(next()); }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try {                str = br.readLine();            }            catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}