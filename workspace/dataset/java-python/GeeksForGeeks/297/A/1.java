

// Java implementation of the above approach 
import java.util.HashMap; 
  
class geeks  
{ 
  
    // Function to calculate the 
    // value of ncr effectively 
    public static int nCr(int n, int r)  
    { 
  
        // Initializing the result 
        int res = 1; 
        for (int i = 1; i <= r; i++)  
        { 
  
            // Multiply and divide simultaneously 
            // to avoid overflow 
            res *= (n - r + i); 
            res /= i; 
        } 
  
        // Return the answer 
        return res; 
    } 
  
    // Function to return the number of sequences 
    // of length N such that their product is M 
    public static int NoofSequences(int N, int M)  
    { 
          
        // Hashmap to store the prime factors of M 
        HashMap<Integer, Integer> prime = new HashMap<>(); 
  
        // Calculate the prime factors of M  
        for (int i = 2; i <= Math.sqrt(M); i++)  
        { 
  
            // If i divides M it means it is a factor 
            // Divide M by i till it could be 
            // divided to store the exponent 
            while (M % i == 0) 
            { 
  
                // Increase the exponent count 
                if (prime.get(i) == null) 
                    prime.put(i, 1); 
                else 
                { 
                    int x = prime.get(i); 
                    prime.put(i, ++x); 
                } 
                M /= i; 
            } 
        } 
  
        // If the number is a prime number 
        // greater than sqrt(M)  
        if (M > 1) 
        { 
            if (prime.get(M) != null)  
            { 
                int x = prime.get(M); 
                prime.put(M, ++x); 
            }  
            else
                prime.put(M, 1); 
        } 
  
        // Initializing the ans 
        int ans = 1; 
  
        // Multiply the answer for every prime factor  
        for (HashMap.Entry<Integer, Integer> entry : prime.entrySet()) 
        { 
  
            // entry.getValue() represents the 
            // exponent of every prime factor 
            ans *= (nCr(N + entry.getValue() - 1, N - 1)); 
        } 
  
        // Return the result 
        return ans; 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        int N = 2, M = 6; 
        System.out.println(NoofSequences(N, M)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

