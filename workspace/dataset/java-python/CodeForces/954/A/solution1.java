import java.util.*; public class questionCF { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);				int n=sc.nextInt();    int count=0;		StringBuilder sb = new StringBuilder(sc.next());				for(int i=0; i<n-1; i++) {			String s = sb.substring(i, i+2);			if(s.equals("UR") || s.equals("RU") ) {				count++;  i++;			}		}		System.out.println((sb.length()-count)); 	}}