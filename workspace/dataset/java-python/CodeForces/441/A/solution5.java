import java.util.HashSet;import java.util.Iterator;import java.util.Scanner;import java.util.Set;import java.util.TreeSet; public class _0653ValeraandAntiqueItems { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int n=sc.nextInt();		int v=sc.nextInt();		Set<Integer> sellers= new TreeSet<>();		for(int i=0;i<n;i++) {			int k=sc.nextInt();			for(int j=0;j<k;j++) {				int price=sc.nextInt();				if(price<v) {					sellers.add(i+1);				}			}		}		System.out.println(sellers.size());		Iterator<Integer> it = sellers.iterator();		while(it.hasNext()) {			System.out.print(it.next()+" ");		}	} }
