import java.util.*;public class Main{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int len = sc.nextInt();		int jump = sc.nextInt();		String str = sc.next();		int pos = 0;		int ans = 0;		while(pos<len-1) {			int i = jump;			if(pos+i>len-1) {				i = len-1-pos;			}			while(str.charAt(pos+i)=='0') {				i--;			}			if(i==0) {				ans = -1;				break;			}			ans++;			pos += i;		}		System.out.println(ans);	} }