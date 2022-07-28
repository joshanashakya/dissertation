import java.util.Scanner; import static java.lang.Math.max; // https://codeforces.com/problemset/problem/855/Bpublic class Marvolo_Gaunt {     int n,i;    long p, q, r;    long sum = Long.MIN_VALUE;     Scanner sc = new Scanner(System.in);    long []PMax;    long []a;    long []SMax;      void input()    {        n = sc.nextInt();        p = sc.nextLong();        q = sc.nextLong();        r = sc.nextLong();        a= new long[n];        PMax = new long[n];        SMax = new long[n];         //System.out.println("Enter the elements");        for (i = 0; i < n; i++) {            a[i] = sc.nextLong();        }       }     void initial_pref() {        PMax[0] = p * a[0];         for (int i = 1; i < n; i++) {            PMax[i] = max(PMax[i - 1], p * a[i]);        }     }     void inital_Suf() {        SMax[n - 1] = r* a[n - 1];         for (i = n - 2; i >= 0; i--) {            SMax[i] = max(SMax[i + 1], r * a[i]);        }    }     long final_sum()    {        for (i = 0; i < n - 1; i++)        {             sum = max(sum, (PMax[i] + q * a[i] + SMax[i]));            sum=max(sum,(p*a[i]+q*a[i]+r*a[i]));           }         sum=max(sum,(p*a[0]+q*a[0]+r*a[0]));        sum=max(sum,(p*a[n-1]+q*a[n-1]+r*a[n-1]));           return sum;     }     public static void main(String[] args) {        Marvolo_Gaunt ob= new Marvolo_Gaunt();         ob.input();        ob.initial_pref();        ob.inital_Suf();        long ans= ob.final_sum();         System.out.println(ans);     }}              
