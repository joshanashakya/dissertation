import java.util.HashSet;import java.util.Scanner; public class problem112 { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		HashSet<String> set = new HashSet<>();		int n = sc.nextInt();		sc.nextLine();		for(int i=0;i<n;i++)		{			set.add(sc.nextLine());		}       System.out.println(set.size());	} }
