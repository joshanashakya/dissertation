import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class test{    public static void main(String... args) throws NumberFormatException, IOException{        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st=new StringTokenizer(br.readLine());        int n=Integer.parseInt(st.nextToken());        int k=Integer.parseInt(st.nextToken());        int start=1;        int end=k+1;        int i=0;        while(i<n) {        	if(i<=k && i%2==0) {        		System.out.print(start+" ");        		start++;        		i++;        	}        	else if(i<=k && i%2!=0) {        		System.out.print(end+" ");        		end--;        		i++;        	}        	else {        		System.out.print((i+1)+" ");        		i++;        	}        }    }}
