import java.util.*;import java.math.*;public class StrangeBirthday{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int runs = sc.nextInt();			while(runs-->0)			{				int n = sc.nextInt();				int m = sc.nextInt();				int[] friends = new int[n];				int[] presents = new int[m];				for(int i = 0;i<n;i++)					friends[i] = sc.nextInt();				for(int i = 0;i<m;i++)					presents[i] = sc.nextInt();				Arrays.sort(friends);				int dex = 0;				long out = 0;				for(int i = n-1;i>=0;i--)				{					int pCost = presents[dex];					int cash = presents[friends[i]-1];					if(pCost<cash)					{						out+= pCost;						dex++;					}					else					{						out+=cash;					}				}				System.out.println(out);			}		}}