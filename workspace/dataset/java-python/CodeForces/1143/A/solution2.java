 import java.util.*; public class java1{	public static void main(String[] agrs){		int[]t=new int[2];		t[0]=0;t[1]=0;		Scanner in=new Scanner(System.in);		int n=in.nextInt();		for(int i=1;i<=n;i++) t[in.nextInt()]=i;		System.out.println(t[0]<t[1]?t[0]:t[1]);	}}
