import java.util.*; public class P3 {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);				int n =sc.nextInt();		int k = sc.nextInt();		String s=sc.next();		int max=0;		int sum=0;	for(int i=0;i<n;i++) {		if(s.charAt(i)=='#') {			sum++;			if(max<sum)max=sum;		}else {			sum=0;		}	}	if(max<k)System.out.println("YES");	else System.out.println("NO");		}}