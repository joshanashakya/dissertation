import java.util.Scanner; public class cf774A { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner in = new Scanner(System.in);		int n=in.nextInt();		int c1=in.nextInt();		int c2=in.nextInt();		in.nextLine();		String str=in.nextLine();				int n0=0;		int n1=0;				for(int i=0;i<str.length();i++){			if (str.charAt(i)=='0')				n0++;			if (str.charAt(i)=='1')				n1++;		}				long min=getv(n,1,c1,c2);				for (int i=2;i<=n1;i++){			long temp = getv(n,i,c1,c2);			if (temp<min)				min=temp;		}				System.out.println(min);			}		static long getv(int n,int k,int c1,int c2){		long temp;		long t1=n/k;		long t2=n%k;		long tc1=(long) c1;		long tc2=(long) c2;		temp=tc1*k+t2*tc2*(t1*t1) + (k-t2)*tc2*(t1-1)*(t1-1);		return temp;	} }
