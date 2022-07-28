import java.util.*;
import java.io.*;

public class  Binary_Number
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int t=1;

		while(t-->0)
		{ 
			int carry=0;
			char a[]=br.readLine().trim().toCharArray();
			long ans=0;
			int n=a.length;

			for(int i=n-1;i>0;i--)
			{
				int val=Integer.parseInt(""+a[i])+carry;
				//pw.println(val);
				if(val==2)
				{
					ans++;
					carry=1;
				}
				else if(val==1)
				{
					ans+=2;
					carry=1;
				}
				else
				{
					ans++;
				}
			}

			int val=Integer.parseInt(""+a[0])+carry;
			if(val==2)
				ans++;

			pw.println(ans);
			
		}
		pw.flush();
	}

	
}
