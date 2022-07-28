

// Java implementation of the above approach 
  
class GFG 
{ 
    // function to count odd sum pair 
    static int count_odd_pair(int n, int a[]) 
    { 
        int odd = 0, even = 0; 
      
        for (int i = 0; i < n; i++) { 
      
            // if number is even 
            if (a[i] % 2 == 0) 
                even++; 
      
            // if number is odd 
            else
                odd++; 
        } 
      
        // count of ordered pairs 
        int ans = odd * even * 2; 
      
        return ans; 
    } 
      
    // function to count even sum pair 
    static int count_even_pair(int odd_sum_pairs, int n) 
    { 
        int total_pairs = (n * (n - 1)); 
        int ans = total_pairs - odd_sum_pairs; 
          
        return ans; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
      
        int n = 6; 
        int []a = { 2, 4, 5, 9, 1, 8 }; 
      
        int odd_sum_pairs = count_odd_pair(n, a); 
      
        int even_sum_pairs = count_even_pair( odd_sum_pairs, n); 
      
        System.out.println("Even Sum Pairs = " + even_sum_pairs); 
              
        System.out.println("Odd Sum Pairs= " + odd_sum_pairs); 
      
          
    } 
  
} 
  
// This code is contributed by ihritik 

