import java.util.*; public class P3 {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);	String s[]=new String[3];	for(int i=0;i<3;i++) {		s[i]=sc.next();	}	boolean sym=true;	for(int i=0;i<3;i++) {		for(int j=0;j<3;j++) {			if(s[i].charAt(j)!=s[2-i].charAt(2-j)) {				sym=false;				break;			}					}		if(!sym)break;	}	if(sym)System.out.println("YES");	else System.out.println("NO");	}}