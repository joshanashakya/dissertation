import java.util.*;  public class Main {      public static void main(String[] args) {        int n,l=0,r;        int[] a = new int[1020];        Scanner in = new Scanner(System.in);        r = n = in.nextInt();        a[0] = 0;        for (int i = 1; i <= n; i++) {            a[i] = in.nextInt();        }         while (a[l]==l&&l<=n) l ++;        while (a[r]==r&&r>=1) r --;         if (l==n+1&&r==0) {            System.out.println("0 0");            return;        }        for (int i = l; i < r; i ++) {            if (a[i]<a[i+1]) {                System.out.println("0 0");                return;            }        }        System.out.println(l+" "+r);    }  } 	      			    	  	 	 	 	  	