import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.HashSet; public class Demo{		public static void main(String args[]) throws NumberFormatException, IOException	{		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));         int n = Integer.parseInt(reader.readLine());                String str = reader.readLine();                int count = 0;                for(int i=0; i<str.length()-1; i++)        {        	if(str.charAt(i) == str.charAt(i+1))        	{        		count++;        	}        }                System.out.println(count);	}}
