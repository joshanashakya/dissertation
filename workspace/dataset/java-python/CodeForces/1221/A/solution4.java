import java.util.Scanner; public class _0661twozerofoureightGame { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int q=sc.nextInt();		while(q>0) {			int n=sc.nextInt();			int sum=0;			for(int i=0;i<n;i++) {				int temp=sc.nextInt();				if(temp>2048) {					continue;				}				else {					sum+=temp;				}			}			if(sum>=2048) {				System.out.println("YES");			}			else {				System.out.println("NO");			}			q--;		}	} }