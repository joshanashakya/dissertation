import java.util.*;public class Main{	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();		String s=" ";		while(n-->0){		   s=s+sc.next()+"\n";		}		String s1=s.replaceFirst("OO","++");		if (s1.equals(s)){		    System.out.println("NO");		} 		else{		    System.out.println("YES");		    System.out.println(s1);		}	}}
