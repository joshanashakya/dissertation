import java.util.*; public class ICPC {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int m = sc.nextInt();        int k = sc.nextInt();        boolean[][] ar = new boolean[n][m];        for (int i = 0; i < n; i++) {             for (int j = 0; j < m; j++) {                ar[i][j] = false;            }        }        List<Integer> list = new ArrayList<>();        List<Integer> list1 = new ArrayList<>();         for (int i = 0; i < k; i++) {            int n1 = sc.nextInt() - 1;            int n2 = sc.nextInt() - 1;            list.add(n1);            list1.add(n2);            /*ar[n1][n2] = true;            int x1 = n1;            int y1 = n2 + 1;             int x2 = n1 + 1;            int y2 = n2;             int x3 = n1 + 1;            int y3 = n2 + 1;             if (x1 <= (n - 1) && x2 <= (n - 1) && x3 <= (n - 1) && y1 <= (n - 1) && y2 <= (n - 1) && y3 <= (n - 1) && ar[x1][y1] && ar[x2][y2] && ar[x3][y3]) {                System.out.println(k + 1);                return;            }              int x4 = n1;            int y4 = n2 - 1;             int x5 = n1 + 1;            int y5 = n2;             int x6 = n1 + 1;            int y6 = n2 - 1;             if (x4 <= (n - 1) && x5 <= (n - 1) && x6 <= (n - 1) && y4 >= (0) && y5 >= 0 && y6 >= (0) && ar[x4][y4] && ar[x5][y5] && ar[x6][y6]) {                System.out.println(k + 1);                return;            }             int x7 = n1;            int y7 = n2 + 1;             int x8 = n1 - 1;            int y8 = n2;             int x9 = n1 - 1;            int y9 = n2 + 1;             if (x7 <= (n - 1) && x8 >= (0) && x9 >= (0) && y7 <= (n - 1) && y8 <= (n - 1) && y9 <= (n - 1) && ar[x7][y7] && ar[x8][y8] && ar[x9][y9]) {                System.out.println(k + 1);                return;            }             int x10 = n1;            int y10 = n2 - 1;             int x11 = n1 - 1;            int y11 = n2;             int x12 = n1 - 1;            int y12 = n2 - 1;             if (x10 <= (n - 1) && x11 >= (0) && x12 >= (0) && y10 >= (0) && y11 <= (n - 1) && y12 >= (0) && ar[x10][y10] && ar[x11][y11] && ar[x12][y12]) {                System.out.println(k + 1);                return;            }*/          }        for (int i = 0; i < k; i++) {            int n1 = list.get(i);            int n2 = list1.get(i);             ar[n1][n2] = true;            int x1 = n1;            int y1 = n2 + 1;             int x2 = n1 + 1;            int y2 = n2;             int x3 = n1 + 1;            int y3 = n2 + 1;            //System.out.println(x1+" "+y1+"   "+x2+" "+y2+"   "+x3+" "+y3+"   ");            //System.out.println(x1<=(n-1)) +" "+ x2<=(n-1)+" "+ x3<=(n-1) +" "+ y1<=(n-1)+" "+ y2<=(n-1)+" "+y3<=(n-1)+" "+ar[x1][y1] +" "+ar[x2][y2] +" "+ ar[x3][y3] );             if (x1<=(n-1) && x2<=(n-1) && x3<=(n-1) && y1<=(m-1) && y2<=(m-1) && y3<=(m-1) && ar[x1][y1] && ar[x2][y2] && ar[x3][y3] ) {                System.out.println(i + 1);                return;            }              int x4 = n1;            int y4 = n2 - 1;             int x5 = n1 + 1;            int y5 = n2;             int x6 = n1 + 1;            int y6 = n2 - 1;             if (x4<=(n-1) && x5<=(n-1) && x6<=(n-1) && y4>=(0) && y5<=(m-1) && y6>=(0) && ar[x4][y4] && ar[x5][y5] && ar[x6][y6]) {                System.out.println(i + 1);                return;            }             int x7 = n1;            int y7 = n2 + 1;             int x8 = n1 - 1;            int y8 = n2;             int x9 = n1 - 1;            int y9 = n2 + 1;             if (x7<=(n-1) && x8>=(0) && x9>=(0) && y7<=(m-1) && y8<=(m-1) && y9<=(m-1) && ar[x7][y7] && ar[x8][y8] && ar[x9][y9]) {                System.out.println(i + 1);                return;            }             int x10 = n1;            int y10 = n2 - 1;             int x11 = n1 - 1;            int y11 = n2;             int x12 = n1 - 1;            int y12 = n2 - 1;             if (x10<=(n-1) && x11>=(0) && x12>=(0) && y10>=(0) && y11<=(m-1) && y12>=(0) && ar[x10][y10] && ar[x11][y11] && ar[x12][y12]) {                System.out.println(i + 1);                return;            }          }        System.out.println(0 );      }     public List<Integer> getDivisors(int n) {        List<Integer> list = new ArrayList<>();        for (int d = 2; d * d <= n; d++) {            while (n % d == 0) {                list.add(d);                n /= d;            }        }        if (n > 1) {            list.add(n);        }        return list;    }     public int gcd(int n1, int n2) {        int gcd = 1;        for (int i = 1; i <= n1 && i <= n2; ++i) {            // Checks if i is factor of both integers            if (n1 % i == 0 && n2 % i == 0)                gcd = i;        }         // int lcm = (n1 * n2) / gcd;        return gcd;    }}  	         			 	  		 	 	   		