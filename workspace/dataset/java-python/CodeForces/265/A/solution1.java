import java.util.Scanner; public class ColorfulStonesSimplifiedEdition {	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		String s=sc.next();		String t=sc.next();		int position=0;		for(int i=0;i<t.length();i++) {			if(t.charAt(i)==s.charAt(position)) {//				System.out.println(t.charAt(i)+" "+i);				position++;			}		}		System.out.println(position+1);	} }