import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class B_String_LCM {   static Scanner scanner=new Scanner();      static int testCases;    static String mul(String s,int k){            StringBuilder sb=new StringBuilder();            while(k-->=1){                    sb.append(s);                }            return sb.toString();        }    static int gcd(int a, int b)    {                if (a == 0)          return b;        if (b == 0)          return a;                      if (a == b)            return a;                      if (a > b)            return gcd(a-b, b);        return gcd(a, b-a);    }    static void solve(String a,String b){       int n=a.length(),m=b.length();     int g=gcd(n,m);        if( mul(a,m/g).equalsIgnoreCase( mul(b,n/g) ) ){                System.out.println( mul(a,m/g) );            }else{                System.out.println(-1);            }      }      public static void main(String[] args) throws IOException {                testCases=scanner.nextInt();                for(int i=0;i<testCases;i++){                        solve(scanner.next(),scanner.next());                    }            }          static class Scanner{                BufferedReader in;        StringTokenizer st;         public Scanner() {                    in=new BufferedReader( new InputStreamReader(System.in) );                    }                String next() throws IOException{                        while( st==null || !st.hasMoreElements() ){                                st=new StringTokenizer( in.readLine() );                            }                        return st.nextToken();                    }                int nextInt() throws IOException{                        return Integer.parseInt( next() );                    }                long nextLong() throws IOException{                        return Long.parseLong( next() );                    }                String nextLine() throws IOException{                        return in.readLine();                    }            }    }/* 3bababaaaaaaabaab */ /* 1aaaaa */
