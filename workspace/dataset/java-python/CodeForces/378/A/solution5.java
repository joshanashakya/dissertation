import java.lang.*;import java.util.*;  import java.io.*; public class _temp2 {	public static void main(String[] args)  throws NumberFormatException, IOException {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		String[] st = br.readLine().split(" ");		int a = Integer.parseInt(st[0]);		int b = Integer.parseInt(st[1]);		int p=0,q=0,r=0;				for(int i=1;i<=6;i++){			if(Math.abs(a-i)<Math.abs(b-i)){				p++;			}else if(Math.abs(a-i)>Math.abs(b-i)){				r++;			}else{				q++;			}		}				System.out.println(p+" "+q+" "+r);	}}