import java.util.Scanner; public class Problem37 { 	public static void main(String[] args) {		// TODO Auto-generated method stub				Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int t=n;		int ar[] = new int[n];		int i=0;		int c=0;		while(n!=0)		{			int a = sc.nextInt();			int b = sc.nextInt();			ar[i] = b;			i++;			n--;		}		int k = sc.nextInt();		for(int l:ar)		{			if(k>l)				c++;			else				break;		}		System.out.println(t-c); 	} }