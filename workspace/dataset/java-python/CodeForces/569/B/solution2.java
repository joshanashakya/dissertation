import java.util.*; import java.io.*; public class Main {	public static void main (String[] args) {	    Scanner input = new Scanner(System.in);		int n = input.nextInt();		TreeSet<Integer> remainNumber = new TreeSet<>();		TreeSet<Integer> checkingNumber = new TreeSet<>();		StringBuilder ans = new StringBuilder();		for (int i=1; i<=n; i++)		remainNumber.add(i);		int a[] = new int[n];				for (int i=0; i<n; i++)		{		    a[i] = input.nextInt();		    remainNumber.remove(a[i]);		    		}		for (int i=0;i<n ;i++ )		{		    int len = checkingNumber.size();		    if(a[i]<=n)		    checkingNumber.add(a[i]);		    if(len==checkingNumber.size())		    {		        ans.append(remainNumber.pollFirst()+" ");		        		    }		    else		    {		        ans.append(a[i]+" ");		    }		}				System.out.println(ans);					}}
