//package CodeForces; import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.Scanner; public class OrGame {		static void solve(long arr[],long k,long m)	{		if(arr.length==1)		{			System.out.println(arr[0]*(long)Math.pow(m,k));			return ;		}		long left[]=new long[arr.length];		long right[]=new long[arr.length];		long temp=0;		for(int i=0;i<arr.length;i++)		{			temp=temp|arr[i];			left[i]=temp;		}		temp=0;		for(int i=arr.length-1;i>=0;i--)		{			temp=temp|arr[i];			right[i]=temp;		}		long ans=0;		for(int i=0;i<arr.length;i++)		{			if(i==0)			{				ans=Math.max(ans,(arr[i]*(long)Math.pow(m,k))|right[i+1]);			}			else if(i==arr.length-1)			{				ans=Math.max(ans,(arr[i]*(long)Math.pow(m,k))|left[i-1]);			}			else			{				ans=Math.max(ans,left[i-1]|(arr[i]*(long)Math.pow(m,k))|right[i+1]);			}		}		System.out.println(ans);	}		public static void main(String[] args) throws IOException{		// TODO Auto-generated method stub		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		String temp[]=br.readLine().trim().split(" ");		int n=Integer.parseInt(temp[0]);		long k=Long.parseLong(temp[1]);		long m=Long.parseLong(temp[2]);		long arr[]=new long[n];		String str[]=br.readLine().trim().split(" ");		for(int i=0;i<n;i++)		{			arr[i]=Long.parseLong(str[i]);		}		solve(arr,k,m);		 	} }
