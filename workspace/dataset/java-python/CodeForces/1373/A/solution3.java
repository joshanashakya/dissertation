import java.util.*;import java.io.*; public class Main {	private static final int N= (int) 1e3+10;    public static void main(String[] args) throws IOException {		int t;		//StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));		StreamTokenizer cin = new StreamTokenizer(System.in);		cin.nextToken();t=(int)cin.nval;		while(t-->0)		{			long a,b,c;			cin.nextToken();			a=(int)cin.nval;			cin.nextToken();			b=(int)cin.nval;			cin.nextToken();			c=(int)cin.nval;			if(a<c)			{				System.out.print("1 ");			}			else			{				System.out.print("-1 ");			}			if(a*b>c)			{				System.out.println(b);			}			else			{				System.out.println("-1");			}		} 	} }
