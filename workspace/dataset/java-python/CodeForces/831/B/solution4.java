import java.util.*; public class question {			public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		String a = sc.next();		String b = sc.next();		String s = sc.next();				for(int i=0; i<s.length(); i++) {			String x = "" + s.charAt(i);    boolean cap = false;			if( x.toUpperCase() == x ) {				x = x.toLowerCase();				cap = true;			}						if( a.contains(x) ) {				int ind = a.indexOf(x);				String ans = b.substring(ind, ind+1);				if( cap == true )					ans = ans.toUpperCase();				System.out.print( ans );				}			else				System.out.print(x);					}						 					}}				   