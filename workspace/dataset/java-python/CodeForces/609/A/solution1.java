import java.util.*; public class Main{	public static void main (String[] args)	{		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int m = sc.nextInt();	    int Count = 0;		ArrayList<Integer> lst = new ArrayList<Integer>();		for (int i = 0; i < n; i++){		    lst.add(sc.nextInt());		}		Collections.sort(lst);		n--;		while (m>0){		    m -= lst.get(n);		    n--;		    Count++;		}		System.out.println(Count);	}}  	 	 	 	 	 		   	 	 					 		
