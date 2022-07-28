import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.*;public class cdfmu2b{	static void merge(int arr[], int l, int m, int r)     {         int n1 = m - l + 1;         int n2 = r - m;         int L[] = new int [n1];         int R[] = new int [n2];         for (int i=0; i<n1; ++i)             L[i] = arr[l + i];         for (int j=0; j<n2; ++j)             R[j] = arr[m + 1+ j];         int i = 0, j = 0;         int k = l;         while (i < n1 && j < n2)         {             if (L[i] <= R[j])             {                 arr[k] = L[i];                 i++;             }             else            {                 arr[k] = R[j];                 j++;             }             k++;         }         while (i < n1)         {             arr[k] = L[i];             i++;             k++;         }         while (j < n2)         {             arr[k] = R[j];             j++;             k++;         }     }     static void sort(int arr[], int l, int r)     {         if (l < r)         {             int m = (l+r)/2;             sort(arr, l, m);             sort(arr , m+1, r);             merge(arr, l, m, r);         }     }     public static int lowerBound(int[] array, int length, int value) 	{        int low = 0;        int high = length;        while (low < high)         {            final int mid = (low + high) / 2;            //checks if the value is less than middle element of the array            if (value <= array[mid])             {                high = mid;            }             else             {                low = mid + 1;            }        }        return low;    }	public static int upperBound(int[] array, int length, int value) 	{        int low = 0;        int high = length;        while (low < high) {            final int mid = (low + high) / 2;            if (value >= array[mid]) {                low = mid + 1;            } else {                high = mid;            }        }        return low;    }    static int gcd(int a, int b)     {       if (b == 0)         return a;       return gcd(b, a % b);      }     static long power(long n,long m)    {    	if(m==0)    		return 1;    	long ans=1;    	while(m>0)    	{    		ans=ans*n;    		m--;    	}    	return ans;    }    static int BinarySearch(long arr[], long x)     {         int l = 0, r = arr.length - 1;         while (l <= r) {             int m = l + (r - l) / 2;             if (arr[m] == x)                 return m;             if (arr[m] < x)                 l = m + 1;             else                r = m - 1;         }         return -1;     } 	public static void main(String args[])throws Exception	{		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		int t=1;//Integer.parseInt(br.readLine());	    for(int i=1;i<=t;i++)	    {	        String s=br.readLine();	        String str[]=s.split(" ");	        long b1=Integer.parseInt(str[0]);	        long q=Integer.parseInt(str[1]);	        long l=Integer.parseInt(str[2]);	        int m=Integer.parseInt(str[3]);	        s=br.readLine();	        String str1[]=s.split(" ");	        long arr[]=new long[m];	        for(int j=0;j<m;j++)	        arr[j]=Integer.parseInt(str1[j]);	        Arrays.sort(arr);	        if(b1==0)	        {	        	if(BinarySearch(arr,0)!=(-1))	        	{	        		System.out.println("0");	        		return;	        	}	        	System.out.println("inf");	        	return;	        }	        if(Math.abs(b1)>l)	        {	        	System.out.println("0");        		return;        	}	        	        if(q==1)	        {	        	if(BinarySearch(arr,b1)!=(-1))	        	{	        		System.out.println("0");	        		return;	        	}	        	System.out.println("inf");	        	return;	        }	        if(q==0)	        {	        	if(BinarySearch(arr,b1)!=(-1)&&BinarySearch(arr,0)!=(-1))	        	{	        		System.out.println("0");	        		return;	        	}	        	if(BinarySearch(arr,0)!=(-1))	        	{	        		System.out.println("1");	        		return;	        	}	        	System.out.println("inf");	        	return;	        }	        if(q==-1)	        {	        	if(BinarySearch(arr,b1)!=(-1)&&BinarySearch(arr,-b1)!=(-1))	        	{	        		System.out.println("0");	        		return;	        	}	        	System.out.println("inf");	        	return;	        }	        if(Math.abs(b1)==l&&q!=0)	        {	        	if(BinarySearch(arr,b1)!=-1)	        	System.out.println("0");	        	else	        	System.out.println("1");	        	return;        	}	        	        int ans=0,temp=0;	        while(Math.abs(b1)<=l)	        {	        	temp++;	        	//System.out.println(b1);	        	if(BinarySearch(arr,b1)==-1)	        	ans++;	        	b1*=q;	        	if(temp>=1000)	        	{	        		System.out.println("inf");	        		return;	        	}	        }	        System.out.println(ans);	    }	}}