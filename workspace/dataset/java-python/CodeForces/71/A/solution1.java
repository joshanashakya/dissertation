import java.util.Scanner; public class WayTooLongWords { 	public static void main(String[] args) {				Scanner scan = new Scanner(System.in);		int i1 = scan.nextInt();		String[] strings = new String [i1];		for(int i = 0; i < i1; i++) {			strings[i] = scan.next();		}				String curr;		int length; 		for(int i = 0; i < i1; i++) {			if(strings[i].length() > 10) {				curr = strings[i];				length = curr.length();				System.out.println(String.valueOf(curr.charAt(0)) + (length-2) +String.valueOf(curr.charAt(length-1)) );			}else {				System.out.println(strings[i]);			}		}			} }
