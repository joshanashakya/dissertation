import java.util.ArrayList;import java.util.Arrays;import java.util.List;import java.util.Scanner; public class _0589BallsOfBuma { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		String s=sc.nextLine();		int left=0;		int right=0;		int count=0;		List<Integer> length = new ArrayList<>();		List<Character> letter = new ArrayList<>();				int len=1;		for(int i=0;i<s.length()-1;i++) {			if(s.charAt(i)==s.charAt(i+1)) {				len++;			}			else {			//	System.out.println(len);				length.add(len);				letter.add(s.charAt(i)); 				len=1;				count++;			}			if(i==s.length()-2) {				length.add(len);				letter.add(s.charAt(i+1)); 				count++; 			}		}//		System.out.println(length);//		System.out.println(letter);//		System.out.println(count);		if(count%2==0) {			System.out.println(0);			return;		}		else {			if(length.get(count/2)==1) {				System.out.println(0);				return;			}		}		left=count/2-1;		right=count/2+1;		while(left>=0) {			if(length.get(left)+length.get(right)<=2 || letter.get(left)!=letter.get(right)) {				System.out.println(0);				return;			}			left--;			right++;		}		System.out.println(length.get(count/2)+1);			} }