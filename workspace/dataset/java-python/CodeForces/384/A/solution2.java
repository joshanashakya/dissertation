import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner in  = new Scanner(System.in);        StringBuilder SB = new StringBuilder();        int n = in.nextInt();        if(n%2==0){            int k = n/2;            System.out.println((k)*n);             for(int i=1;i<=k;i++){                 for (int j = 1; j <= k; j++) {                   SB.append("C.");                 }                SB.append("\r\n");                  for (int j = 1; j <= k; j++) {                    SB.append(".C");                }                SB.append("\r\n");             }        }        else{            int k = n/2;            System.out.println((k+1)*((k)+1)+(k)*(k));            for(int i=1;i<=k;i++){                for (int j = 1; j <= k; j++) {                    SB.append("C.");                }                SB.append("C");                SB.append("\r\n");                for (int j = 1; j <= k; j++) {                    SB.append(".C");                }                SB.append(".");                SB.append("\r\n");            }             for (int j = 1; j <= k; j++) {                SB.append("C.");            }            SB.append("C");            SB.append("\r\n");        }        System.out.println(SB);    }} 	 					  					 				 	    	 		
