import java.util.*;import java.util.Arrays;import java.util.Collections;public class LineToCashier { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();  //Input no of cashier		int i,j;		int []arr=new int[n+1]; //Array of the casher		int []brr=new int[n+1];  //Array for copying		for(i=1;i<n+1;i++)			arr[i]=sc.nextInt();  //Input the elements		for( i=1;i<n+1;i++)		{			int []m=new int[arr[i]];			int sum=0;			for( j=0;j<arr[i];j++)				{				  m[j]=sc.nextInt();				  sum=sum+m[j]*5;				}			brr[i]=sum+arr[i]*15;		}		int min=brr[1];		for(i=2;i<n+1;i++)		{			if(brr[i]<min)				min=brr[i];		}		System.out.println(min);		} }