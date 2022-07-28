

/* Java code to determine whether numbers 
1 to N can be divided into two sets 
such that absolute difference between  
sum of these two sets is M and these 
two sum are co-prime*/
class GFG  
{ 
    static int GCD (int a, int b) 
    { 
        return b == 0 ? a : GCD(b, a % b); 
    } 
      
    // function that returns boolean value 
    // on the basis of whether it is possible 
    // to divide 1 to N numbers into two sets 
    // that satisfy given conditions. 
    static boolean isSplittable(int n, int m) 
    { 
          
        // initializing total sum of 1 
        // to n numbers 
        int total_sum = (n * (n + 1)) / 2; 
      
        // since (1) total_sum = sum_s1 + sum_s2 
        // and (2) m = sum_s1 - sum_s2 
        // assuming sum_s1 > sum_s2. 
        // solving these 2 equations to get 
        // sum_s1 and sum_s2 
        int sum_s1 = (total_sum + m) / 2; 
      
        // total_sum = sum_s1 + sum_s2 
        // and therefore 
        int sum_s2 = total_sum - sum_s1; 
      
        // if total sum is less than the absolute 
        // difference then there is no way we 
        // can split n numbers into two sets 
        // so return false 
        if (total_sum < m) 
            return false; 
      
        // check if these two sums are 
        // integers and they add up to 
        // total sum and also if their 
        // absolute difference is m. 
        if (sum_s1 + sum_s2 == total_sum && 
                    sum_s1 - sum_s2 == m) 
      
            // Now if two sum are co-prime 
            // then return true, else return false. 
            return (GCD(sum_s1, sum_s2) == 1); 
  
        // if two sums don't add up to total 
        // sum or if their absolute difference 
        // is not m, then there is no way to 
        // split n numbers, hence return false 
        return false; 
    } 
      
    // Driver Code 
    public static void main(String args[])  
    { 
        int n = 5, m = 7; 
  
        // function call to determine answer 
        if (isSplittable(n, m)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
          
    } 
} 
  
// This code is contributed by Sam007 

