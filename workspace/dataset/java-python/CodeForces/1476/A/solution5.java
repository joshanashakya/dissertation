import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Main{    static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }         int[] na(int n){        int ar[]=new int[n];        for(int i=0;i<n;i++){            ar[i]=nextInt();        }        return ar;        }                void print(int ar[]){            for(int i=0;i<ar.length;i++){                System.out.print(ar[i]+" ");               }        }            }     public static long gcd(long a,long b){        if(b==0){            return a;        }        if(a==0){            return b;        }        return gcd(b,a%b);    }    public static void main (String[] args) throws java.lang.Exception	{	    FastReader sc= new FastReader();		// your code goes here		int t=sc.nextInt();		while(t--!=0){		    long n=sc.nextLong();		    long k=sc.nextLong();		    if(n>k){		        if(n%k==0){		            System.out.println(1);		        }else{		            System.out.println((2));		        }		        		    }else if(n<=k){		        long ques=k/n+1;		        if(k%n==0){		           System.out.println(k/n); 		        }else{		        System.out.println(ques);		        }		    }		    // System.out.println();		}	}}
