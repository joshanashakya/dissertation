import java.util.Scanner; public class LoginVerification {	public static void main(String[] args) {		Scanner in = new Scanner(System.in);		String newLogin = in.next().toLowerCase().replace("o", "0").replace("l","1").replace("i","1");		int n = in.nextInt();		for(int i=0;i<n;i++) {			String existingLogin = in.next().toLowerCase().replace("o", "0").replace("l","1").replace("i","1");			if(newLogin.equals(existingLogin)) {				System.out.println("No"); return;			}		}		System.out.println("Yes");		in.close();	}}