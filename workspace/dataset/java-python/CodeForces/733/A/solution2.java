import java.util.*;import java.io.*; public class Main{	public static void main(String[] args) {				Scanner sc= new Scanner(System.in);				String x=sc.next();		x=x.toLowerCase();				int max=1;		int last=-1;		boolean first=true;		for(int i=0;i<x.length();i++) {			if (x.charAt(i)=='a'|x.charAt(i)=='e'|x.charAt(i)=='i'|x.charAt(i)=='o'|x.charAt(i)=='u'|x.charAt(i)=='y') {				if (first) {					first=false;					max=i+1;					last=i;				}else {					max=Math.max(i-last, max);					last=i;				}							}		}				max=Math.max(max, x.length()-last);				System.out.println(max);	}	}
