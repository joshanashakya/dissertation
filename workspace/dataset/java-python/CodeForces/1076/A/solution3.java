import java.util.*;public class _1076A {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        String s = sc.next();        char c='\u0000';        int f = 0;        for (int i = 0; i < n-1; i++) {            char ch = s.charAt(i);            char ch2 = s.charAt(i+1);            if(ch>ch2)            {                 c=ch;                 f=1;                 break;            }        }        if(f==0)            c=s.charAt(n-1);        f=0;        for (int i = 0; i < n; i++) {            if (f == 0 && s.charAt(i) == c) {                f = 1;                continue;            }            System.out.print(s.charAt(i));        }    }}