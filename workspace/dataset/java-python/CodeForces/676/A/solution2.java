import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.Scanner; public class Nicho {	public static void main (String[] args) throws IOException	{		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		int t = Integer.parseInt(br.readLine());		int[] rong1 = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();		int max=Integer.MIN_VALUE,maxindex=0,min=Integer.MAX_VALUE,minindex=0;		for(int i=0;i<rong1.length;i++) {			if(rong1[i]>max) {				max=rong1[i];				maxindex=i;			}			if(rong1[i]<min) {				min=rong1[i];				minindex=i;			}		}		if(minindex==maxindex) {			System.out.println("0");		}else if(maxindex==0&&minindex==rong1.length-1){			System.out.println(rong1.length-1);		}else if(minindex==0&&maxindex==rong1.length-1){			System.out.println(rong1.length-1);		}		else		if(minindex<maxindex) {			System.out.println(Math.max(rong1.length-minindex-1, maxindex));		}else if(maxindex<minindex) {			System.out.println(Math.max(rong1.length-maxindex-1, minindex));		}	} }