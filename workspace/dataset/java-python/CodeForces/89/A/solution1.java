import java.util.*;import java.io.*;import java.lang.*;public class Main{        static class FastReader{                BufferedReader br;                StringTokenizer st;                public FastReader()throws IOException{                  br=new BufferedReader(new InputStreamReader(System.in));                }                public FastReader(String s)throws IOException{                  br=new BufferedReader(new FileReader(new File(s)));                }                String next(){                  while(st==null || !st.hasMoreElements()){                    try{                       st=new StringTokenizer(br.readLine());                    }                    catch(Exception e){                      e.printStackTrace();                    }                                    }                  return st.nextToken();                }                String nextLine(){                String str="";                  try{                    str=br.readLine();                  }                 catch(Exception e){                   e.printStackTrace();                 }                return str;                }               int nextInt(){                 return Integer.parseInt(next());                }              long nextLong(){               return Long.parseLong(next());             }             double nextDouble(){               return Double.parseDouble(next());             }         }    public static void main(String[] args) throws IOException {        FastReader in=new FastReader();         int n=in.nextInt();        int m=in.nextInt();        int k=in.nextInt();        int a[]=new int[n];        for(int i=0;i<n;i++)          a[i]=in.nextInt();        if(n%2==0)           System.out.println(0);        else{              int b=a[0];            for(int i=2;i<n;i+=2)              b=Math.min(a[i],b);            System.out.println(Math.min(b,1L*m/((n+1)/2)*k));        }    }}     
