import javax.print.DocFlavor;import javax.swing.*;import java.awt.image.BandedSampleModel;import java.util.*; public class Example {    static long[][] dp;    //  static    int[]  ar;    static int mod = 1000000000 + 7;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);    int n =sc.nextInt();int[] arr =new int[n];for(int i=0;i<n;i++){    arr[i]=sc.nextInt(); }int hig=Integer.MAX_VALUE;long ans=0;for(int i=n-1;i>=0;i--){ hig=hig-1;if(hig==-1){    break;}hig=Math.min(hig,arr[i]);ans=ans+hig;}        System.out.println(ans);               }public  static  void Naswer(int n){         int c=0;         String s=String.valueOf(n);        int a=0;        for(int  i=1;i<s.length();i++)        {            a=a+(int)Math.pow(2,i);        }         int b=(int)Math.pow(2,s.length());        int ans=1;        for(int i=0;i<s.length();i++){             if(s.charAt(i)=='7'){                ans=ans+b/2;             }            b=b/2;           }         System.out.println(ans+a);    }      }              	  	 	 		    				   	      		 	
