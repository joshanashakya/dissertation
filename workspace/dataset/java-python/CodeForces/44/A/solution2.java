import java.util.*; public class P3 {	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);	int t = sc.nextInt();	Map<String, Integer>map  = new HashMap();			int c=0;	while(t-->0){		String breed = sc.next();		String color=sc.next();		String m=breed+'.'+color;			if(!map.containsKey(m)) {			map.put(m,1);			c++;		}		}	System.out.println(c);	}}