import java.util.*;public class P2 { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n =sc.nextInt();		int m =sc.nextInt();		int r = sc.nextInt();		int s[]=new int[n];		int b[]=new int[m];		for(int i=0;i<n;i++) {			s[i]=sc.nextInt();		}        for(int i=0;i<m;i++) {			b[i]=sc.nextInt();		}        Arrays.sort(s);        Arrays.sort(b);        int f=0;        if(s[0]>=b[m-1]) {        	System.out.println(r);        }else {        	int p =r/s[0];        	int k=r%s[0];        	 f=b[m-1]*p;        	f+=k;        	        	  System.out.println(f);        }      	}}
