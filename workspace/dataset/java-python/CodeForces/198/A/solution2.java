import java.util.*; public class practice {		public static void main(String[] args) {		Scanner scn=new Scanner(System.in);		long k=scn.nextLong(),b=scn.nextLong(),n=scn.nextLong(),t=scn.nextLong();		long z=1,time=0;;		while(z<=t){			z=z*k+b;			time++;					}		long ans=n-time+1;		if(ans<0){			ans=0;		}		System.out.println(ans);						}			}
