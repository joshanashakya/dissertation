import java.util.*; public class questionA2OJ { 	public static void main(String[] args) {				Scanner sc = new Scanner(System.in);		int a[] = new int[5]; int sum=0;		for(int i=0; i<5; i++) {			a[i]=sc.nextInt();  sum+=a[i];		}				HashMap<Integer, Integer> h = new HashMap<>();		for(int i=0; i<5; i++) {			int ch = a[i];			if( !h.containsKey(ch) ) h.put(ch, 1);			else {				int v = h.get(ch);				h.put(ch, v+1);			}		}		int max=0, t=0;		for(int ch : h.keySet()) { 			if( h.get(ch) >=3 ) 				max = Math.max(max, 3*ch);			else if( h.get(ch) ==2 ) 				max = Math.max(max, 2*ch);					}		System.out.println(sum-max);							}}
