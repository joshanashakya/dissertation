import java.util.Scanner; public class gotanygrapes1114A {		public static void main (String[]args) {				Scanner input = new Scanner(System.in);				int x = input.nextInt();		int y = input.nextInt();		int z = input.nextInt();		input.nextLine();				int a = input.nextInt();		int b = input.nextInt();		int c = input.nextInt();				input.close();				boolean possible = false;				if (a>=x) {			a = a-x;		} else {			System.out.println("NO");			System.exit(0);		}				int remaining = a+b+c;				if (a+b>=y) {			remaining = remaining - y;		} else {			System.out.println("NO");			System.exit(0);		} 				if (remaining>=z) {			System.out.println("YES");		} else {			System.out.println("NO");		}			}}
