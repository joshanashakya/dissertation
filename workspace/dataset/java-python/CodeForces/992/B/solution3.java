import java.util.*;public class Test1{	public static int gcd(int a,int b){		while(b!=0){			int p = a%b;			a=b;			b=p;		}		return a;	}					public static void main (String[] args) throws java.lang.Exception	{		Scanner scan = new Scanner(System.in);		int l = scan.nextInt();		int r = scan.nextInt();		int x = scan.nextInt();		int y = scan.nextInt();		int v =0;		if(y%x==0){		y = y/x;		for(int i=1;i*i<=y;i++){			int p=y/i;			if(y%i==0&&gcd(p,i)==1&&(x*i)>=l&&(x*i)<=r&&(x*p)>=l&&(x*p)<=r){				if(p!=i){					v=v+2;				}				else{					v++;				}			}		}		}		System.out.println(v);	}}
