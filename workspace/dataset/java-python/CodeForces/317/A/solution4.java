import java.io.*;import java.util.*;public class Solution{              static int mod=1000000007;      public static void main(String[] args){                  long a =longg();                long b =longg();                long m =longg();                  if(max(a,b)>=m)                     out.println("0");                  else{                         if(a<=0&&b<=0)                             out.println("-1");                         else{                               long ans=0;                                while(max(a,b)<m){                                     if(a<b){                                       long x = (b-a)/b;                                       if(x==0)                                        { a=a+b; ans++;}                                       else                                        { a=a+x*b; ans=ans+x;}                                     }                                     else{                                       long x = (a-b)/a;                                         if(x==0){                                               b=b+a; ans++;                                          }                                        else{                                               b=b+x*a; ans=ans+x;                                         }                                    }                                }                            out.println(ans);                         }                 }             out.flush();    }           static FastReader sc=new FastReader();         static PrintWriter out = new PrintWriter(System.out);            static int intt(){                       int x = sc.nextInt();                       return(x);                }               static long longg(){                          long x = sc.nextLong();                           return(x);                }               static double doublee(){                          double t = sc.nextDouble();                           return(t);                }              static String str(){                       String s = sc.next();                         return(s);                }              static String strln(){                         String s = sc.nextLine();                           return(s);              }              static long pow(long a,long b){                       long ans=1;                      while(b>0){                          if(b%2==1)                              ans=(ans*a);                              a=(a*a)%mod;                              b=b/2;                      }                    return(ans);                }             static long GCD(long a,long b){                           if(b%a==0)                               return(a);                               return(GCD(b%a,a));              }            static long LCM(long a,long b){                         return ((a*b)/GCD(a,b));               }                 static long abs(long x,long y)                   { return(Math.abs(x-y));}               static long min(long x,long y){                     return(Math.min(x,y));                 }               static long max(long a,long b){                        return Math.max(a,b);                  }                static long Fermat(long a,long p){                           long b = p-2,ans=1;                            while(b>0){                                 if(b%2==1)                                      ans=(ans*a)%p;                                       a=(a*a)%p;                                       b=b/2;                              }                           return(ans);                   }              static void Fact(long a[],long m){                              a[0]=1;                           for(int i=1;i<a.length;i++)                                   a[i]=(i*a[i-1])%m;                       }              static void Fact_Inv(long a[],long F[],long m){                                  int n =a.length;                                     a[n-1]=Fermat(F[n-1],m);                                 for(int i=n-2;i>=0;i--)                                        a[i]=((i+1)*a[i+1])%m;                        }               /*static  long d, x, y;              static void extendedEuclid(long A, long B) {                            if(B == 0) {                                  d = A;                                  x = 1;                                  y = 0;                              }                           else {                                extendedEuclid(B, A%B);                                 long temp = x;                                  x = y;                                 y = temp - (A/B)*y;                            }                     } */                 /*static class pair implements Comparable<pair>{                       int x,y;                      pair(int a,int b){                             x=a;                             y=b;                       }                     public int compareTo(pair p1)                           { return((p1.x-p1.y)-(this.x-this.y));}                             public boolean equals(Object obj) {                         if (this == obj)                                return true;                        if (obj == null)                                return false;                        if (getClass() != obj.getClass())                                return false;                         pair other = (pair) obj;                          if (x != other.x)                                  return false;                          if (y != other.y)                                  return false;                            return true;                      }                      @Override                 public int hashCode() {                      return(x-y);                   }           }   */   static class FastReader {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }
