import java.util.*; public class questionCF {		public static void main(String[] args) { 		Scanner sc = new Scanner(System.in);				int t = sc.nextInt();		HashMap<String, Integer> h = new HashMap<>();		while(t-->0) {			String s = sc.next();			int point=0;			int x = 100*sc.nextInt();			int y = 50*sc.nextInt();						for(int i=1; i<=5; i++) point+=sc.nextInt();						point+=x;			point+=(-y);						h.put(s, point);					}				int max=Integer.MIN_VALUE;	String ans="";		for(String s : h.keySet()) {			if(max<h.get(s)) {				max=h.get(s);				ans = s;			}		}		System.out.println(ans); 			}}		