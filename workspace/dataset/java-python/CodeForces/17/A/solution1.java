import java.io.*;import java.util.*;public class Main{	 public static void main(String[] args) {	 Scanner scn=new Scanner(System.in);	 int n=scn.nextInt();	 int k=scn.nextInt();	 int len=0;	 int len1=0;	 for(int i=2;i<n;i++){	     int count=0;	     for(int j=2;j<i;j++){	         if((i%j)==0){	             count++;	         }	     }	     if(count==0){	         len++;	     }	 }	 int[]arr=new int[len];	 for(int i=2;i<n;i++){	     int count=0;	     for(int j=2;j<i;j++){	         if((i%j)==0){	             count++;	         }	     }	     if(count==0){	         arr[len1]=i;	         len1++;	     }	 }	 int num=0;	 for(int i=0;i<arr.length-1;i++){	     int ans=arr[i]+arr[i+1]+1;	     //System.out.println(arr[i]);	     if(isprime(ans)==true&&ans<=n){	        // System.out.println(ans);	         num++;	     }	 }	     if(num>=k){	         System.out.println("YES");	     }	     else{	        System.out.println("NO");	     }	  	}	public static boolean isprime(int n){	    int count=0;	     for(int j=2;j<n;j++){	         if((n%j)==0){	             count++;	         }	     }	     if(count==0){	         return true;	     }	     return false;	}}