import java.util.*;public class Main{	public static void main(String[] args) {	    Scanner sc = new Scanner(System.in);	    int t,s,x;	    boolean f = false;	    t = sc.nextInt();	    s = sc.nextInt();	    x = sc.nextInt();	    while(t <= x){	        if(t == x || t+s == x || t+s+1 == x){	            System.out.println("YES");	            f = true;	            break;	        }	        t += s;	    }	    if(!f)	        System.out.println("NO");	    	}}