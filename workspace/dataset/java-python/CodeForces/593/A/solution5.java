import java.util.Scanner;import java.util.Arrays;import java.util.Vector;  public class MainTest{		//////////////////////////////////////////////////////////////////////////////	public static void main(String s[]) {				Scanner scan=new Scanner(System.in);			int n=scan.nextInt();		String words[]=new String[n];		for(int i=0;i<n;i++)			words[i]=scan.next();				int sum=0;		int tempsum=0;		for(char i='a';i<='z';i++)			for(char j='a';j<='z';j++) {				for(int k=0 ;k<n ; k++) 				  	if(is2char(words[k],i,j))				  		tempsum+=words[k].length();					sum=Math.max(sum, tempsum);				tempsum=0;				}				System.out.println(sum); 				}		//////////////////////////////////////////////////////////////////////////////         public static boolean is2char(String s,char ch1,char ch2) {        	        	for(int i=0;i<s.length();i++)        		if(s.charAt(i)!=ch1 && s.charAt(i)!=ch2)         			return false;        	return true;        }}
