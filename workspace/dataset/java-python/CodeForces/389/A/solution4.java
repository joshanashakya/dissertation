import java.util.Scanner; public class _0714FoxandNumberGame {		static boolean isPrime(int n)    {         // Check if number is less than        // equal to 1        if (n <= 1)            return false;         // Check if number is 2        else if (n == 2)            return true;         // Check if n is a multiple of 2        else if (n % 2 == 0)            return false;         // If not, then just check the odds        for (int i = 3; i <= Math.sqrt(n); i += 2)         {            if (n % i == 0)                return false;        }        return true;    }		static int gcd(int a,int b) {		if(b==0) {			return a;		}		return gcd(b,a%b);	}		public static void main(String[] args) {				Scanner sc= new Scanner(System.in);		int n=sc.nextInt();		int a=sc.nextInt();		int b=0;		for(int i=0;i<n-1;i++) {			 b=sc.nextInt();			a=gcd(a,b);		}		System.out.println(a*n);	} }