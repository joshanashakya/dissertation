import java.awt.Label;import java.util.*; public class JavaApplication23 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);         boolean check = true;        int n, m, index = 0;        n = in.nextInt();        m = in.nextInt();         String[] a = new String[n];        int integer[] = new int[n];         while (n != 0) {            a[index] = in.next();            for (int i = 0; i < a[index].length() - 1; i++) {                if (a[index].charAt(i) != a[index].charAt(i + 1)) {                    check = false;                    break;                }            }            index++;            n--;        }        if (check) {            ConvertStringToInteger(a, integer);            for (int i = 1; i < integer.length - 1; i++) {                    if (!(integer[i - 1] != integer[i] && integer[i] != integer[i + 1])) {                        check = false;                        break;                    }            }         }         if (check) {            System.out.println("YES");        } else {            System.out.println("NO");        }    }     public static void ConvertStringToInteger(String[] a, int[] num) {        for (int i = 0; i < a.length; i++) {            for (int j = 0; j < a[i].length(); j++) {                num[i] += (int) a[i].charAt(j);            }        }    }}   		 	  			  						 	 		    		
