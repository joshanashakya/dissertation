import java.util.*;public class Main {	public static void main(String[] args){		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int a[] = new int[n];		int b[] = new int[n];		int c[] = new int[n];		int d[] = new int[2];		boolean num[] = new boolean[n+1]; 		for(int i=0; i<n; i++){			a[i]=sc.nextInt();			c[i]=a[i];			num[i] = false;		} 		for(int i=0; i<n; i++){			b[i]=sc.nextInt();		} 		int flag=0; 		for(int i=0; i<n; i++){			if(a[i]!=b[i]){				d[flag]=i;				flag++;			}			else{				num[a[i]]=true;				num[b[i]]=true;			}		} 		if(flag==2){			if(num[a[d[1]]]||num[b[d[0]]]){				a[d[1]]=b[d[1]];			}			else{				a[d[0]]=b[d[0]];			}			for(int i=0; i<n; i++){				System.out.print(a[i]+" ");			}		}		if(flag==1){			for(int i=1; i<=n; i++){				if(num[i]!=true){					a[d[0]]=i;				}			}			for(int i=0; i<n; i++){				System.out.print(a[i]+" ");			}			}  	} }