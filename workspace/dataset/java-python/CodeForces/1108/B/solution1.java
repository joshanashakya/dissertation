import java.util.Arrays;import java.util.Scanner; public class Main {	public static void main(String[] args) {		Scanner in = new Scanner(System.in);		int n=in.nextInt();		int []a=new int[n];		int []b=new int[n];		int []c=new int[n];		int topb=-1,topc=-1;		for(int i=0;i<n;i++){			a[i]=in.nextInt();		}//		 1 1 2 2 4 4 5 8 10 20		Arrays.sort(a);		b[++topb]=1;		c[++topc]=1;		for(int i=2;i<n;i++){			if(a[n-1]%a[i]==0&&b[topb]!=a[i]){				b[++topb]=a[i];			}else{				c[++topc]=a[i];			}		}		System.out.println(b[topb]+" "+c[topc]);						}} 	   				 		 				 			  					 	
