import javax.print.DocFlavor;import javax.swing.*;import java.awt.image.BandedSampleModel;import java.util.*; public class Example {    static long[][] dp;    //  static    int[]  ar;    static int mod = 1000000000 + 7;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);int n =sc.nextInt();String[] s =new String[n];for(int i=0;i<n;i++){    s[i]=sc.next();}for(int i=0;i<n;i++){    for(int i1=0;i1<n-i-1;i1++){        if(s[i1].length()>=s[i1+1].length()){            String temp=s[i1];            s[i1]=s[i1+1];            s[i1+1]=temp;        }    }}for(int i=n-1;i>=0;i--){      for(int j=i-1;j>=0;j--){        if(!s[i].contains(s[j])){            System.out.println("NO");            return;        }     }}        System.out.println("YES");for(int i =0;i<n;i++){    System.out.println(s[i]);}      }     private static boolean answer(int n) {        String s=String.valueOf(n);        int a=0;        for(int i=0;i<s.length();i++){            a+=(s.charAt(i)-'0');        }        if(a==10)            return true;        else            return false;    }     public  static int Naser(int[] coins ,int amont,int  i){           if(amont==0)            return 0;        if(amont<0)            return 0;        if(i<0)            return 0;        return Math.min(1+Naser(coins,amont-coins[i],i),Naser(coins,amont,i-1));      }   }       		   	  					 	 		   	     				
