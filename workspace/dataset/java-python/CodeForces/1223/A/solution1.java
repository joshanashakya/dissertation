// Don't place your source in a packageimport java.lang.reflect.Array;import java.text.DecimalFormat;import java.util.*;import java.lang.*;import java.io.*;import java.math.*;import java.util.stream.Stream;  // Please name your class Mainpublic class Main {    static FastScanner fs=new FastScanner();    static class FastScanner {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer("");        public String next() {            while (!st.hasMoreElements())                try {                    st=new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }        int Int() {            return Integer.parseInt(next());        }         long Long() {            return Long.parseLong(next());        }         String Str(){            return next();        }    }      public static void main (String[] args) throws java.lang.Exception {        PrintWriter out = new PrintWriter(System.out);           int T=Int();        for(int t=0;t<T;t++){            int n=Int();             Solution sol=new Solution();            sol.solution(out,n);        }        out.flush();     }     public static int Int(){        return fs.Int();    }    public static long Long(){        return fs.Long();    }    public static String Str(){        return fs.Str();    } }      class Solution{    public void solution(PrintWriter out,int n){        if(n<=4){            out.println(4-n);            return;        }         if(n%2==0){            out.println(0);        }        else{            out.println(1);        }     }  }    /*                             ;\                            |' \         _                  ; : ;        / `-.              /: : |       |  ,-.`-.          ,': : |       \  :  `. `.       ,'-. : |        \ ;    ;  `-.__,'    `-.|         \ ;   ;  :::  ,::'`:.  `.          \ `-. :  `    :.    `.  \           \   \    ,   ;   ,:    (\            \   :., :.    ,'o)): ` `-.           ,/,' ;' ,::"'`.`---'   `.  `-._         ,/  :  ; '"      `;'          ,--`.        ;/   :; ;             ,:'     (   ,:)          ,.,:.    ; ,:.,  ,-._ `.     \""'/          '::'     `:'`  ,'(  \`._____.-'"'             ;,   ;  `.  `. `._`-.  \\             ;:.  ;:       `-._`-.\  \`.              '`:. :        |' `. `\  ) \      -hrr-      ` ;:       |    `--\__,'                   '`      ,'                        ,-'                        free bug dog*/   