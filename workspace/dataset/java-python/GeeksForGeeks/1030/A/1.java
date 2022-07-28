

// Java code for above given approach 
class GFG  
{ 
  
    static int N = 100005; 
    static int mod = 1000000007; 
  
    // To store the number of divisors  
    static int cnt[] = new int[N]; 
  
    // Function to find the number of divisors  
    // of all numbers in the range 1 to n  
    static void Divisors()  
    { 
  
        // For every number 1 to n  
        for (int i = 1; i < N; i++)  
        { 
  
            // Increase divisors count for every number  
            for (int j = 1; j * i < N; j++)  
            { 
                cnt[i * j]++; 
            } 
        } 
    } 
  
    // Function to find the sum of divisors  
    static int Sumofdivisors(int A, int B, int C)  
    { 
        // To store sum  
        int sum = 0; 
  
        Divisors(); 
  
        for (int i = 1; i <= A; i++)  
        { 
            for (int j = 1; j <= B; j++)  
            { 
                for (int k = 1; k <= C; k++)  
                { 
                    int x = i * j * k; 
  
                    // Count the diviosrs  
                    sum += cnt[x]; 
                    if (sum >= mod)  
                    { 
                        sum -= mod; 
                    } 
                } 
            } 
        } 
  
        return sum; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int A = 5, B = 6, C = 7; 
  
        // Function call  
        System.out.println(Sumofdivisors(A, B, C)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

