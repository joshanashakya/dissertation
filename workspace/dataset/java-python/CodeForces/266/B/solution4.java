import java.io.*;import java.util.Scanner;public class Solution {	public static void main(String[] args)	{		Scanner sc = new Scanner(System.in);		if (System.getProperty("ONLINE_JUDGE") == null) {			try {				System.setOut(new PrintStream(					new FileOutputStream("output.txt")));				sc = new Scanner(new File("input.txt"));			}			catch (Exception e) {			}		}		//problem code		int len = sc.nextInt();		int pass = sc.nextInt();		sc.nextLine();		String que = sc.nextLine();		StringBuilder sb = new StringBuilder(que);		int i,j;		char temp,temp1;		for(i=0;i<pass;i++){			for(j=0;j<len-1;j++){				temp = sb.charAt(j);				temp1 = sb.charAt(j+1);				if(temp < temp1){					sb.setCharAt(j,temp1);					sb.setCharAt(j+1,temp);					j++;				}			}			//System.out.print(sb);		}		System.out.print(sb);	}}
