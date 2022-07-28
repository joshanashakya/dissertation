import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tt=sc.nextInt();
		while(tt-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int min=Integer.MAX_VALUE;
			for(int i=0;i<=30;i++) {
				min=Math.min(min,count(a,i+b)+i);
			}
			System.out.println(min);
			
		}
	}
	public static int count(int a,int b) {
		if(b==1)
			return Integer.MAX_VALUE;
		int count=0;
		while(a>0) {
			a/=b;
			count++;
		}
		return count;
	}
}

