import java.util.Scanner; public class _0690StringsEqualization { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int cases=sc.nextInt();		sc.nextLine();		while(cases>0) {			String s=sc.nextLine();			String t=sc.nextLine();			boolean flag=false;			a:{			for(int i=0;i<s.length();i++) {				for(int j=0;j<t.length();j++) {					if(s.charAt(i)==t.charAt(j)) {						flag=true;						break a;					}				}			}			}			if(flag) {				System.out.println("YES");			}			else {				System.out.println("NO");			}			cases--;		}	} }
