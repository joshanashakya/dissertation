import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class Main {	public static void main(String[] args) throws IOException {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		String s1=br.readLine();		String s2=br.readLine();		String s3=br.readLine();		s1=s1.replaceAll("-|;|_", "").toLowerCase();		s2=s2.replaceAll("-|;|_", "").toLowerCase();		s3=s3.replaceAll("-|;|_", "").toLowerCase();						String[] ss=new String[7];				ss[0]=s1+s2+s3;		ss[1]=s1+s3+s2;		ss[2]=s2+s1+s3;		ss[3]=s2+s3+s1;		ss[4]=s3+s1+s2;		ss[5]=s3+s2+s1;		 		int n=Integer.parseInt(br.readLine());		for(int i=0;i<n;i++)		{			String str=br.readLine();			str=str.replaceAll("-|;|_", "").toLowerCase();			int j;			for(j=0;j<6;j++) {				if(str.equals(ss[j])) {					System.out.println("ACC");					break;				}			}			if(j<6)			{				continue;			}						System.out.println("WA");					}			}}  	    	 		 	  	  			   	 				 	