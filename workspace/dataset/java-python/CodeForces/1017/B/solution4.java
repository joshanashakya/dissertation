import java.math.*;import java.util.*;import java.lang.*;import java.io.*;     public class CodeChef  {  public static  void main(String[] args) throws IOException { 	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    StringBuilder sb=new StringBuilder();    int n=Integer.parseInt(br.readLine());   long a1=0,a0=0,b1=0,b0=0;String sr=br.readLine();String ss=br.readLine();long count=0;for(int i=0;i<n;i++){	if(sr.charAt(i)=='1')	{a1++;	if(ss.charAt(i)=='1')		b1++;			}	if(sr.charAt(i)=='0')	{a0++;	if(ss.charAt(i)=='0')		b0++;			}	  }count+=a1*b0;count+=(a1-b1)*(a0-b0);System.out.println(count);        }                            }
