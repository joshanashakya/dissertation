import java.io.*; public class _temp2 {	public static void main(String[] args)  throws NumberFormatException, IOException {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		String[] st = br.readLine().split(" ");		int n = Integer.parseInt(st[0]);		int x = Integer.parseInt(st[1]);				int count=0;		int start=1;		for(int i=0;i<n;i++){			st = br.readLine().split(" ");			int l = Integer.parseInt(st[0]);			int r = Integer.parseInt(st[1]);			int skip = (l-start)/x;			count+=r-l+1;			count+=(l-start)-skip*x;			start=r+1;			//System.out.println(l+" "+r);		}		System.out.println(count);	}}
