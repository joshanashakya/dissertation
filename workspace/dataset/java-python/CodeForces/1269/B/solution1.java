// Don't place your source in a packageimport java.lang.reflect.Array;import java.text.DecimalFormat;import java.util.*;import java.lang.*;import java.io.*;import java.math.*;import java.util.stream.Stream;  // Please name your class Mainpublic class Main {    static FastScanner fs=new FastScanner();    static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        public String next() {            while (!st.hasMoreElements())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }        int Int() {            return Integer.parseInt(next());        }         long Long() {            return Long.parseLong(next());        }         String Str(){            return next();        }    }      public static void main (String[] args) throws java.lang.Exception {        PrintWriter out = new PrintWriter(System.out);           int T=1;        for(int t=0;t<T;t++){            int n=Int();int m=Int();            int A[]=new int[n];int B[]=new int[n];            for(int i=0;i<n;i++){                A[i]=Int();            }            for(int i=0;i<n;i++){                B[i]=Int();            }             Solution sol=new Solution();            sol.solution(out,A,B,m);        }        out.flush();     }     public static int Int(){        return fs.Int();    }    public static long Long(){        return fs.Long();    }    public static String Str(){        return fs.Str();    } }   class Solution{    public void solution(PrintWriter out,int A[],int B[],int m){        int res=Integer.MAX_VALUE;        for(int i=0;i<B.length;i++){            int x=B[i]-A[0];            if(x<0)x+=m;            int AA[]=new int[A.length];            for(int j=0;j<A.length;j++){                AA[j]=(A[j]+x)%m;            }            if(check(AA,B))res=Math.min(res,x);        }        out.println(res);    }     public boolean check(int A[],int B[]){        Map<Integer,Integer>f=new HashMap<>();        for(int i:A){            if(!f.containsKey(i))f.put(i,1);            else f.put(i,f.get(i)+1);        }         for(int i:B){            if(!f.containsKey(i))return false;            f.put(i,f.get(i)-1);            if(f.get(i)==0)f.remove(i);        }        return f.size()==0;    }}  
