         import java.util.*;  		public class dummycodes{ public static class data{	int prevIndex;	int comDiff;	public data (int i){		prevIndex=i;		comDiff=0;	}	}		public static void  solve(String s) {		int arr[]=new int [26];		for(int i=0;i<s.length();i++) {			arr[s.charAt(i)-'a']++;		}		int cnt=0;		for(int i=0;i<26;i++) {			if(arr[i]%2!=0) cnt++;		}				if(cnt==0) {			System.out.println("First");				return;		}						if(cnt%2==0) System.out.println("Second");		else System.out.println("First");							}  		  public static void main(String args[])  { Scanner sc=new Scanner(System.in);String s=sc.nextLine();   solve(s);    }}                                                                                                                                                                                                          	
