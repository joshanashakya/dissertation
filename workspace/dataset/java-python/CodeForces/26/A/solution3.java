import java.util.Arrays;import java.util.Scanner; public class AlmostPrime {     public static void main(String[] args) {         Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        System.out.println(func(n));    }     public static int func(int n)    {     int prime[] = new int[n+1];     int pf[] = new int[n+1];     Arrays.fill(prime,1);     Arrays.fill(pf,0);int ct=0;      for(int i=2;i<=n;i++)     {         if(prime[i]==1)         {             for(int j=i+i;j<=n;j=j+i)             {                 prime[j]=0;                 pf[j] += 1;             }         }          if(pf[i]==2)             ct++;     }        return ct;     }}
