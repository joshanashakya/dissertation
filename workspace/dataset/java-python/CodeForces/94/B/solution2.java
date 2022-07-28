import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class CodeForce  {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	static int next(String[] sr, int ind) {
		if(sr[ind].equals("S")||sr[ind].equals("F"))
			return 1000;
		return Integer.parseInt(sr[ind]);
	}

	public static void main(String[] args) throws IOException {
		
		int m=Integer.parseInt(br.readLine());
		int[][] gf=new int[5][5];
		for(int i=0;i<m;i++)
		{
			String[] sr=br.readLine().split(" ");
			int a=next(sr,0);
			int b=next(sr,1);
			gf[a-1][b-1]=1;
			gf[b-1][a-1]=1;
			
		}
		for(int i=0;i<5;i++)
		for(int j=0;j!=i&&j<5;j++)
			for(int k=0;k!=i&k!=j&&k<5;k++ )
			{
				if(gf[i][j]==1&&gf[j][k]==1&&gf[i][k]==1)
					{System.out.println("WIN");return;}
				else if(gf[i][j]==0&&gf[i][k]==0&&gf[j][k]==0)
				{ System.out.println("WIN");return;}
			}
		System.out.println("FAIL");
		
	}
}

