import java.util.*; public class questionCF { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);				String s = sc.nextLine();				for(int i=s.length()-1; i>=0; i--) {			char c=s.charAt(i);			if(c=='?' || c==' ')				continue;			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='Y' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y') {				System.out.println("YES");    return ;			}			else {				System.out.println("NO");  return ;			}		}					}}	
