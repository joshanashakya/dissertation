import java.util.Scanner; public class Test3 {     public static void main(String[] args) {        int n;        double R, r;        double eps=1e-10;        double PI=Math.acos(-1);        Scanner in = new Scanner(System.in);        while (in.hasNext()){            n = in.nextInt();            R = in.nextInt();            r = in.nextInt();            if(n==1)            {                if(R>=r)                    System.out.println("YES");                else                    System.out.println("NO");                continue;            }            double tmp=Math.asin(r/(R-r));            if(PI/tmp-n>-eps)                System.out.println("YES");            else                System.out.println("NO");        }     }}    	  	   			 		     		 	  	