 import java.util.*; public class M_Round_4 { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);				String x = sc.next();		String y = sc.next();		StringBuilder sb = new StringBuilder();				for(int i=0; i<x.length(); i++) {			char c1 = x.charAt(i);			char c2 = y.charAt(i);						if(c1<c2) {				System.out.println(-1); System.exit(0);			}			else if(c1==c2) sb.append(c1);			else if(c1>c2) sb.append(c2);		}		System.out.println(sb);					}	}