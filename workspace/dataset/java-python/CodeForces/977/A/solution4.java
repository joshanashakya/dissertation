import java.util.*;public class Main{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);        String str = sc.nextLine();        int n = Integer.parseInt(str.substring(0, str.indexOf(" ")));        int k = Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()));        for (int i=1; i<=k ; i++) {            if (n%10 != 0) {                n = n-1;            }            else {                n = n/10;            }        }        System.out.println(n);    }}
