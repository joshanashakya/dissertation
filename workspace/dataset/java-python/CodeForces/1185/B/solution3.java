 import java.util.*;public class file{	 public class Pair{		 char ch;		int frq=0;		Pair(char ch,int f){			this.ch=ch;			frq=f;		}	}	public static void main(String[] args) {		Scanner scn=new Scanner(System.in);		int test=scn.nextInt();		scn.nextLine();		while(test-->0) {						String s1=scn.nextLine();			String s2=scn.nextLine();			char ch1=s1.charAt(0);			char ch2=s2.charAt(0);			int c1=1,c2=1;			ArrayList<Pair> l1=new ArrayList<>();			for(int i=1;i<s1.length();i++) {				if(ch1!=s1.charAt(i)) { 	              file.Pair p=new file().new Pair(ch1,c1); 					l1.add(p);					ch1=s1.charAt(i);					c1=1;				}else {					c1++;				}			} 			file.Pair p1=new file().new Pair(ch1,c1); 				l1.add(p1);									ArrayList<Pair> l2=new ArrayList<>();			for(int i=1;i<s2.length();i++) {				if(ch2!=s2.charAt(i)) { 					 file.Pair p=new file().new Pair(ch2,c2); 					l2.add(p);					ch2=s2.charAt(i);					c2=1;				}else {					c2++;				}			} 			 file.Pair p2=new file().new Pair(ch2,c2); 			l2.add(p2);				if(l1.size()!=l2.size()) { 				System.out.println("NO");			}else {				boolean flag=true;				for(int i=0;i<l1.size();i++) {				Pair pp1=l1.get(i);								Pair pp2=l2.get(i);								if(pp1.ch != pp2.ch || pp1.frq > pp2.frq) { 					System.out.println("NO");					flag=false;					break;				}				}				if(flag) {					System.out.println("YES");				}							}		}	}}