import java.util.Scanner;public class Main { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int a = sc.nextInt();		int b = sc.nextInt();		int c[] = new int[a];		for(int i=0;i<a;i++) {			c[i] = sc.nextInt();		}		int count = 0;		for(int i = 0;i<a-1;i++) {			while(c[i]==c[i+1]) {				c[i+1] = c[i+1]+b;				count++;			}			while(c[i]>c[i+1]) {				int d = (c[i]-c[i+1])/b;				c[i+1] = c[i+1]+b*(d+1);				count = count+d+1;			}		}		System.out.println(count);	} } 
