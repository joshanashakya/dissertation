import java.util.*; public class B {     public static void main(String[] args) {    	Scanner sc = new Scanner(System.in);         int tc = sc.nextInt();         for(; tc > 0; tc--) {            int n = sc.nextInt();            n = n * 2;             ArrayList<Integer> a = new ArrayList<Integer>();             for(int i = 0; i < n; ++i) {                a.add(sc.nextInt());            }             Collections.sort(a);            System.out.println(a.get(n/2) - a.get(n/2 - 1));        }    }   }
