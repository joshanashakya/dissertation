import java.util.*;import java.lang.*;import java.io.*; public class Code{	public static void main (String[] args) throws java.lang.Exception	{		Scanner sc = new Scanner(System.in);		int q =sc.nextInt();		while(q>0){		    q--;		    long n = sc.nextLong();		    int a = sc.nextInt();		    int b = sc.nextInt();		    long cost=0;		    if(n%2==0){		        if(a*2<=b){		            cost= a*n;		        }else{		            cost = (b*n)/2;		        }		    }else{		        cost = a;		        if(a*2<=b){		            cost= cost+a*(n-1);		        }else{		            cost = cost+(b*(n-1))/2;		        }		    }		    System.out.println(cost);		    		}	}}