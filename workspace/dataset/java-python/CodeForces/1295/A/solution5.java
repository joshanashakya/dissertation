import java.util.*;import java.io.*;public class Main{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int t = sc.nextInt();		while(t-- > 0) {		   int n = sc.nextInt(), k=0;		   if(n % 2 == 0) {		       n = n / 2;		   } else {		       n -= 3;		       k = 3;		       n = n / 2;		   }		   if(n == 0)		        System.out.println("7");		   else {		        String str = String.format("%0" + n + "d", 0).replace("0", "1");		        if(k != 0)		           str = "7"+str;		        System.out.println(str);      		   }      		}		sc.close();	}}