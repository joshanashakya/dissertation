

// Java program to find a number that  
// divides maximum array elements  
import java.util.*; 
class Solution 
{ 
static final int MAXN=100001;  
    
// stores smallest prime factor for every number  
static int spf[]= new int[MAXN];  
    
// Calculating SPF (Smallest Prime Factor) for every  
// number till MAXN.  
// Time Complexity : O(nloglogn)  
static void sieve()  
{  
    spf[1] = 1;  
    for (int i = 2; i < MAXN; i++)  
    
        // marking smallest prime factor for every  
        // number to be itself.  
        spf[i] = i;  
    
    // separately marking spf for every even  
    // number as 2  
    for (int i = 4; i < MAXN; i += 2)  
        spf[i] = 2;  
    
    for (int i = 3; i * i < MAXN; i++) {  
        // checking if i is prime  
        if (spf[i] == i) {  
            // marking SPF for all numbers divisible by i  
            for (int j = i * i; j < MAXN; j += i)  
    
                // marking spf[j] if it is not  
                // previously marked  
                if (spf[j] == j)  
                    spf[j] = i;  
        }  
    }  
}  
    
// A O(log n) function returning primefactorization  
// by dividing by smallest prime factor at every step  
static Vector<Integer> getFactorization(int x)  
{  
    Vector<Integer> ret= new Vector<Integer>();  
    while (x != 1) {  
        int temp = spf[x];  
        ret.add(temp);  
        while (x % temp == 0)  
            x = x / temp;  
    }  
    return ret;  
}  
    
// Function to find a number that  
// divides maximum array elements  
static int maxElement(int A[], int n)  
{  
    // precalculating Smallest Prime Factor  
    sieve();  
    
    // Hash to store frequency of each divisors  
    Map<Integer, Integer> m= new HashMap<Integer, Integer>();  
    
    // Traverse the array and get spf of each element  
    for (int j = 0; j < n; ++j) {  
    
        // calling getFactorization function  
        Vector<Integer> p = getFactorization(A[j]);  
    
        for (int i = 0; i < p.size(); i++)  
            m.put(p.get(i),m.get(p.get(i))==null?0:m.get(p.get(i))+1);  
    }  
    
    int cnt = 0, ans = 10000000;  
    // Returns Set view       
       Set< Map.Entry< Integer,Integer> > st = m.entrySet();     
    
       for (Map.Entry< Integer,Integer> me:st)  
       {  
        if (me.getValue() >= cnt) {  
            cnt = me.getValue();  
            if(ans > me.getKey())  
            ans = me.getKey() ; 
            else
            ans = ans;  
        }  
    }  
    
    return ans;  
}  
    
// Driver program  
public static void main(String args[]) 
{  
    int A[] = { 2, 5, 10 };  
    int n =A.length;  
    
    System.out.print(maxElement(A, n));  
    
  
}  
} 
//contributed by Arnab Kundu 

