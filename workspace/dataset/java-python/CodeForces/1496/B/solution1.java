import java.util.*;
public class ayaa{
	public static void main(String []args) {
		Scanner sc= new Scanner (System.in);
		int m= sc.nextInt();
		for(int i=0;i<m;i++) {
			int n= sc.nextInt();
			int k= sc.nextInt();
			HashSet<Integer> x= new HashSet<Integer>();
			int max=0;
			for(int j=0;j<n;j++) {
				int t=sc.nextInt();
				if(t>max)
					max=t;
				x.add(t);
			}
			int mex=0;
			while(mex<=max+1) {
				if (!x.contains(mex)) {
					break;
				}
				mex++;
			}
			if(mex>max)
				System.out.println(x.size()+k);
			else {
				if(k>0)
				x.add((mex+max)/2+ ((mex+max)%2));
				System.out.println(x.size());}
			
		}
		
}}


