import java.util.Scanner; public class _0618JohnnyandAncientComputer { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int cases=sc.nextInt();		while(cases>0) {			long a=sc.nextLong();			long b=sc.nextLong();			if(a<b) {				long temp=a;				a=b;				b=temp;			}			long val=a/b;			if(a==b) {				System.out.println(0);			}			else if(val%2!=0 || a%b!=0) {				System.out.println(-1);			}			else {				int count=0;				a:{				while(val>1) {					if(val%8==0) {						count++;						val=val/8;					}					else if(val%4==0) {						val=val/4;						count++;					}					else if(val%2==0) {						val=val/2;						count++;					}					else {						break a;					}				}				}				if(val==1) {					System.out.println(count);				}				else {					System.out.println(-1);				}			}									cases--;		}	} }
