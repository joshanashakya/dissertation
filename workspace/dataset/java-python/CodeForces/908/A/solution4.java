import java.util.Scanner; public class CountCards {	public static void main(String[] args) { 		Scanner in = new Scanner(System.in);		String s = in.next();		in.close();		int c = 0, i; 		for (i = 0; i < s.length(); i++) {			char v = s.charAt(i);			if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u'					|| (Character.isDigit(v) && Integer.parseInt(String.valueOf(v)) % 2 != 0)) {				c++;			}		}		System.out.println(c);	}}
