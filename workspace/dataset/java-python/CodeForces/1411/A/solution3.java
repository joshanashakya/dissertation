import java.util.Scanner; public class chat { 	public static void main(String[] args) {		Scanner userInput = new Scanner(System.in);		int t = userInput.nextInt();		for (int i = 0; i < t; i++) {			int n = userInput.nextInt();			String S = userInput.next();			int count = 0;			for (int j = n - 1; j >= 0; j--, count++) {				if(S.charAt(j) != ')')					break;			}			if (2*count>n)				System.out.println("Yes");			else				System.out.println("No");		}	} }
