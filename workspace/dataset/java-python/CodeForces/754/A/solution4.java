import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.StringTokenizer; public class test{	    public static void main(String... args) throws NumberFormatException, IOException{        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        int n=Integer.parseInt(br.readLine());        int[] a=new int[n+1];        int[] sum=new int[n+1];        StringTokenizer st=new StringTokenizer(br.readLine());        for(int i=1;i<=n;i++) {        	a[i]=Integer.parseInt(st.nextToken());        	sum[i]=sum[i-1]+a[i];        }        boolean[] boundary=new boolean[n+1];        int l=1;        int count=0;        for(int i=1;i<=n;i++) {        	if(sum[i]-sum[l-1]==0) {        		continue;        	}        	else {        		int j=i+1;        		while(j<=n && a[j]==0) {        			j++;        		}        		i=j-1;        		boundary[i]=true;        		l=i+1;        		count++;        	}        }       if(!boundary[n]) {    	   System.out.println("NO");       }       else {    	   System.out.println("YES");    	   System.out.println(count);           int left=1;           for(int i=1;i<=n;i++) {        	   if(boundary[i]) {        		   System.out.println(left+" "+i);        		   left=i+1;        	   }           }       }    } }