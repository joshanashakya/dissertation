//CD 875Aimport java.util.*;public class Main {	public static void main(String[] args) {		int flag=0; 		int [] ans = new int [103];		Scanner input = new Scanner(System.in);		int n = input.nextInt();		for(int i=n-90;i<=n;i++) {			int com=i,temp=i;			while(temp>0) {				com+=temp%10;				temp=temp/10;			}if(com==n) {				ans[flag++]=i;			}		}		System.out.println(flag);		for(int i=0;i<flag;i++) {			if(i==flag-1) System.out.println(ans[i]);			else System.out.println(ans[i]+" ");		}	}} 	 		  	 	     		  	  	 	      	