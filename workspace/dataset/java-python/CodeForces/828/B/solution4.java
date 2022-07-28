   import java.io.*;import java.math.*;import java.security.*;import java.text.*;import java.util.*;import javafx.util.Pair; public  class CodeForce {static	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));static StringBuilder sb = new StringBuilder(); 	static boolean flag = false;	 	static int next(String [] sr,int ind)	{		return Integer.parseInt(sr[ind]);	} 	public static void main(String[] args) throws IOException {		String[] sr=br.readLine().split(" ");	int n=next(sr,0);	int m=next(sr,1);	Pair[] p=new Pair[4];	int[][] arr=new int[n][m];	for(int i=0;i<n;i++)		{String s=br.readLine();				for(int j=0;j<m;j++)			{if(s.charAt(j)=='W')			 arr[i][j]=0;			else arr[i][j]=1;}		}		int minV=Integer.MAX_VALUE;		int minH=Integer.MAX_VALUE;		int maxV=-1;		int maxH=-1;		int tot=0;	for(int i=0;i<n;i++)	for(int j=0;j<m;j++)		{			if(arr[i][j]==1)			{tot++;if(i<minV)				minV=i;			 if(i>maxV)				maxV=i;			if(j<minH)				minH=j;			 if(j>maxH)				maxH=j;			}			}						if(tot==0)			{				System.out.println("1");				return;			}						int height=maxV-minV+1;			int width=maxH-minH+1;			int size=Math.max(height,width);			if(size>Math.min(n, m))				{System.out.println("-1");			return;}						System.out.println(size*size-tot);																							   	  						}	}      
