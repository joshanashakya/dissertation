import java.util.*; public class Main{    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int t = in.nextInt();        for (int i = 0; i < t; i++) {            int n = in.nextInt();            char[] s = in.next().toCharArray();            if(s[0] == '2' && s[1] == '0' && s[n - 2] == '2' && s[n - 1] == '0') {                System.out.println("YES");            }            else if (s[0] == '2' && s[n-3] == '0' && s[n - 2] == '2' && s[n - 1] == '0') {                System.out.println("YES");            }            else if (s[0] == '2' && s[1] == '0' && s[2] == '2' && s[n - 1] == '0') {                System.out.println("YES");            }            else if (s[0] == '2' && s[1] == '0' && s[2] == '2' && s[3] == '0') {                System.out.println("YES");            }            else if (s[n-4] == '2' && s[n-3] == '0' && s[n-2] == '2' && s[n-1] == '0') {                System.out.println("YES");            }            else {                System.out.println("NO");            }        }    }}   		    		 		   		     	 			  	
