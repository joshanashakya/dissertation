import java.util.*; public class balance {	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		int t=sc.nextInt();		while(t-->0) {			int n=sc.nextInt();			int c1=1<<n;			int c2=0;			for(int i=1;i<n;++i) {				if (i<n/2)					c1+=1<<i;				else					c2+=1<<i;			}			//System.out.println("c1="+c1+" c2="+c2);			System.out.println(c1-c2);		}	}}