import java.util.*; public class LittleArtern { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);int t =sc.nextInt();while(t-->0) {	int n =sc.nextInt();	int m = sc.nextInt();	for(int i=0;i<n;i++) {		String s="B";		for(int j=0;j<m-1;j++) {			if(i==n-1) {				s+='B';			}else			s+='W';		}		System.out.println(s);	}	} 	} }