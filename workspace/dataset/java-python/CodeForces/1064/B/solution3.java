import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.StringTokenizer; public class test{	    public static void main(String... args) throws NumberFormatException, IOException{        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        int t=Integer.parseInt(br.readLine());        for(int i=0;i<t;i++) {        	long n=Long.parseLong(br.readLine());        	int j=0;        	int count=0;        	while(j<64) {        		if(((n>>j)&1)==1) {        			count++;        		}        		j++;        	}        	System.out.println((long)Math.pow(2, count));        }    } }