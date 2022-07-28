



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import javafx.util.Pair;

public  class CodeForce {
static	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringBuilder sb = new StringBuilder();

	static boolean flag = false;
	 
	static int next(String [] sr,int ind)
	{
		return Integer.parseInt(sr[ind]);
	}

	public static void main(String[] args) throws IOException {
		
String sr=br.readLine();
char[] arr=sr.toCharArray();
int i=sr.length()-1;
int count=0;
while(i>0)
{
	if(arr[i]=='0')
	{count++;
		
	}
	else
	{int j=i-1;
	while(j>=0&&arr[j]!='0')
	{
		arr[j]='0';j--;
	}
	
	count=count+2;
	
	if(j>=0)
		arr[j]=1;
	else
		{count+=i;System.out.println(count); return;}
		
	}
	

i--;

}
if(arr[0]=='0')
	count++;
System.out.println(count);



	
}


}

