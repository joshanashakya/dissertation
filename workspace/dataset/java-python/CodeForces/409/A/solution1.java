import java.util.*; public class AprilFool { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int t1=0,t2=0;		String a1=sc.next();		String a2=sc.next();		String a="8<";		String b="[]";		String c="()";				for(int i=0;i<a1.length();i+=2) {			if(a1.substring(i,i+2).equals(a) && a2.substring(i,i+2).equals(b) )				t1++;			else if(a2.substring(i,i+2).equals(a) && a1.substring(i,i+2).equals(b) )				t2++;			else if(a1.substring(i,i+2).equals(b) && a2.substring(i,i+2).equals(c))				t1+=1;			else if(a2.substring(i,i+2).equals(b) && a1.substring(i,i+2).equals(c) )				t2+=1;			else if(a1.substring(i,i+2).equals(c)  && a2.substring(i,i+2).equals(a) )				t1+=1;			else if(a2.substring(i,i+2).equals(c)  && a1.substring(i,i+2).equals(a) )				t2+=1;		}						if(t1>t2)			System.out.println("TEAM 1 WINS");		else if(t2>t1)			System.out.println("TEAM 2 WINS");		else			System.out.println("TIE");				 	}}