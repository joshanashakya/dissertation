import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class Main {	public static void print(int[] arr) {		for(int i=0;i<arr.length;i++) {			if(i==arr.length-1)				System.out.print(arr[i]);			else				System.out.print(arr[i]+" ");		}		System.out.println();	}	public static boolean method (int[] arr) {		boolean flag=true;		for(int i=1;i<arr.length;i+=2) {			if(arr[i]<arr[i-1]) {				int temp=arr[i];				arr[i]=arr[i-1];				arr[i-1]=temp;			}		}		for(int i=2;i<arr.length;i+=2) {			if(arr[i]>arr[i-1]) {				int temp=arr[i];				arr[i]=arr[i-1];				arr[i-1]=temp;			}		}		for(int i=1;i<arr.length;i++) {			if(i%2 !=0 && arr[i]<arr[i-1])				flag=false;			else if(i%2==0 && arr[i]>arr[i-1])				flag=false;		}		return flag;	}	public static void main (String [] args) throws IOException  {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		int x=Integer.parseInt(br.readLine());		String s=br.readLine();		String[] s1=s.split(" ");		int[] arr=new int[x];		for(int j=0;j<s1.length;j++) {			arr[j]=(Integer.parseInt(s1[j]));		}		if(method(arr))			print(arr);		else			System.out.println("Impossible");	}	}   	 	 	 		  		  			   	 	    	