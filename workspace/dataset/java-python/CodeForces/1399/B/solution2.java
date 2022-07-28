import java.util.*;
import java.io.*;
 
public class Main{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0) {
			int x=sc.nextInt();
			
			int candies[]=new int[x];
			
			int oranges[]=new int[x];
			
			int mincandies=Integer.MAX_VALUE;
			int minoranges=Integer.MAX_VALUE;
			for(int i=0;i<x;i++) {
				candies[i]=sc.nextInt();
				mincandies=Math.min(candies[i], mincandies);
			}
			for(int i=0;i<x;i++) {
				oranges[i]=sc.nextInt();
				minoranges=Math.min(oranges[i], minoranges);
			}
			long tot=0;
			for(int i=0;i<x;i++) {
				if(candies[i]>mincandies|oranges[i]>minoranges) {
					tot+=(Math.min(candies[i]-mincandies, oranges[i]-minoranges));
					tot+=(Math.max(candies[i]-mincandies, oranges[i]-minoranges)-Math.min(candies[i]-mincandies, oranges[i]-minoranges));
				}
			}
			System.out.println(tot);
			
			
			
		
		
		}
	}
};
