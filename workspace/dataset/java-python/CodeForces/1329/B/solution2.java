// Don't place your source in a packageimport java.util.*;import java.lang.*;import java.io.*;import java.math.*;      // Please name your class Mainpublic class Main {    static Scanner in = new Scanner(System.in);    public static void main (String[] args) throws java.lang.Exception {        PrintWriter out = new PrintWriter(System.out);         int T=Int();        for(int t=0;t<T;t++){            int d=Int();            int m=Int();             Solution sol=new Solution();            sol.solution(d,m);         }        out.flush();    }     public static long Long(){        return in.nextLong();    }    public static int Int(){        return in.nextInt();    }    public static String Str(){        return in.next();    }}  class Solution{    public void solution(int d,int mod){        if(d==1){            System.out.println((1%mod));            return;        }        long res=0;         //find the highest bit first        int j=0;        for(int i=0;i<32;i++){            if((d&(1<<i))!=0){                j=i;            }        }         res=1;        for(int i=1;i<32;i++){            if(i==j){                long cnt=(d^(1<<i))+1;                res=res*(cnt+1)+cnt;                res%=mod;                break;            }            else{                res=res*((1<<i)+1)+(1<<i);                res%=mod;            }        }          System.out.println(res);    }    }
