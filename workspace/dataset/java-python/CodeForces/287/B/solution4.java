//package section;import java.util.Scanner;public class Section {    static long sum(long k){return k*(k+1)/2;}    static long sum2(long n,long k){        long st=1,e=k;        while(st<e){        long mid=(st+e)/2;        long s=sum(mid,k);        if (s==n){            return k-mid+1;        }else if(s>n){            st=mid+1;        }else {            e=mid;        }        }        return k-st+2;    }    static long sum(long st,long e){        long s=0;        if(st<=e){            s=sum(e)-sum(st-1);        }        return s;    }    public static void main(String args[]) {        Scanner sc=new Scanner(System.in);            long n=sc.nextLong();            long k=sc.nextLong();            long c=0,c2=0;            if(n==1){System.out.println(0); }            else if(n==k){System.out.println(1); }            else{                n--;                k--;                if(sum(k)< n){                    System.out.println(-1);                }                else {                    System.out.println(sum2(n,k));                }            }                               }    }
