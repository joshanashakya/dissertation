import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.List;import java.util.Scanner; public class _0726Emotes { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int n=sc.nextInt();		int m=sc.nextInt();		int k=sc.nextInt();		List<Long> store = new ArrayList<>();		for(int i=0;i<n;i++) {						store.add(sc.nextLong());		}		Collections.sort(store);		long first=store.get(store.size()-1);		long second=store.get(store.size()-2);		System.out.println((m/(k+1))*1L*((k*first)+second)+(m%(k+1)*first));	} }