import java.util.Scanner;  public class Main {		public static void main(String[] args) {		Scanner sc=new Scanner(System.in);	   int sum1=0 ,sum2=0 ,sum3=0;	   int n=sc.nextInt();	   int []a=new int[n];	   int v,i,j;	   int t=0;	   	   int cnt=1;	   for(i=0;i<n;i++) {		   v=sc.nextInt();		   a[i]=v;		   sum1+=a[i];	   }	  for(i=1;i<n;i++) {		  for(j=1;j<n;j++) {			  if(a[j]>a[j-1]) {				  t=a[j-1];				  a[j-1]=a[j];				  a[j]=t;			  }		  }	  }	  	   for(i=0;i<n;i++) {		    		   sum2+=a[i];		   		   sum3=sum1-sum2;		   if(sum2<=sum3) {			   cnt++;		   }	   }	   System.out.println(cnt);			} }