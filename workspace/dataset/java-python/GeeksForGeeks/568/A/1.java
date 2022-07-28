

// JAVA Code for Probability of getting  
// atleast K heads in N tosses of Coins 
class GFG { 
      
    public static double fact[]; 
       
    // Returns probability of getting at least k 
    // heads in n tosses. 
    public static double probability(int k, int n) 
    { 
        double ans = 0; 
        for (int i = k; i <= n; ++ i) 
       
            // Probability of getting exactly i 
            // heads out of n heads 
            ans += fact[n] / (fact[i] * fact[n-i]); 
       
        // Note: 1 << n = pow(2, n) 
        ans = ans / (1 << n); 
        return ans; 
    } 
       
    public static void precompute() 
    { 
        // Preprocess all factorial only upto 19, 
        // as after that it will overflow 
        fact[0] = fact[1] = 1; 
       
        for (int i = 2; i < 20; ++i) 
            fact[i] = fact[i - 1] * i; 
    } 
       
    // Driver code 
    public static void main(String[] args)  
    { 
        fact = new double[100]; 
        precompute(); 
       
        // Probability of getting 2 head out 
        // of 3 coins 
        System.out.println(probability(2, 3)); 
       
        // Probability of getting 3 head out 
        // of 6 coins 
        System.out.println(probability(3, 6)); 
       
        // Probability of getting 12 head out 
        // of 18 coins 
        System.out.println(probability(12, 18)); 
       
    } 
 } 
// This code is contributed by Arnav Kr. Mandal 

