import java.util.Arrays;import java.util.Scanner; public class hello {	public static void main(String[] args) {		Scanner in = new Scanner(System.in);		int n = in.nextInt();		long t = in.nextLong();		String num = in.next();		int dec = num.indexOf(".");		num = num.replace(".","");		char[] cs = num.toCharArray(); 		int len = cs.length;		for(int i=dec;i<len;i++) {			if(cs[i]-'0' >= 5) {				len = i+1;				break;			}		}		while(t > 0) {			int roundIdx = -1;			for(int i=len-1;i>=dec;i--) {				int v = cs[i]-'0';				if(v >= 5) {					roundIdx = i;					break;				}			}			if(roundIdx == -1) break;			len = roundIdx;			while(len > 0 && cs[len-1] == '9') {				cs[len-1] = '0';				len--;			}			if(len == 0) {				System.out.print("1");				break;			}			cs[len-1]++;			t--;		}		System.out.print(new String(cs,0,dec));		if(len-dec > 0) {			System.out.print(".");			System.out.println(new String(cs,dec,len-dec));		} else {			System.out.println();		}	}}