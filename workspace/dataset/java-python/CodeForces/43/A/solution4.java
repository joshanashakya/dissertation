import java.util.*; public class Main{	public static void main(String[] args) {				Scanner sc= new Scanner(System.in);				int countA=0;		int countB=0;				int n=sc.nextInt();		String a=sc.next();		String b="";		countA++;				while(n-->1) {			String y=sc.next();			if (y.equals(a)){				countA++;			}else {				b=y;				countB++;			}		}				System.out.println(countA>countB?a:b);			}}