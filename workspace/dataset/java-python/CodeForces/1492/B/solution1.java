import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] p=new int[n];
			for(int i=0;i<n;i++)
			  p[i]=sc.nextInt();
			  HashSet<Integer> set=new HashSet<>();
			ArrayList<Integer> l=new ArrayList<>();
			  int n1=n;
			  int c=0;
		 for(int i=n1-1;i>=0;i--){
		 	if(p[i]!=n){
		 	  set.add(p[i]);
		 		c++;
		 	}
		   else if(p[i]==n){
		 		for(int j=i;j<=i+c;j++)
		 		   l.add(p[j]);
		 		   c=0;
		 		   n--;
		 	   while(set.contains(n))
		 	    n--;
	
		    }
		 }
		   for(int i=0;i<l.size();i++)
		     System.out.print(l.get(i)+" ");
			System.out.println();
		}
		
		
	}
}

