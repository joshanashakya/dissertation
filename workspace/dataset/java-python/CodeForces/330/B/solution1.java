import java.util.*; public class RoadConstruction_B { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc  = new Scanner(System.in);		int n = sc.nextInt();		int m = sc.nextInt();		Set<Integer> s = new HashSet<>();		for(int i = 0; i<m; i++) {			s.add(sc.nextInt());			s.add(sc.nextInt());		}		int k = 0;		for(int i = 1;i<=n; i++) {			if(!s.contains(i)) {				k = i;				break;			}		}		System.out.println(n-1);		for(int i = 1; i<=n; i++) {			if(i==k) {				continue;			}			else {				System.out.println(k+" "+i);			}					}				 	} }
