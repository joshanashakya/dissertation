

// Java implementation of the above approach 
class GFG { 
  
    // returns the minimum time 
    // required to reach 'X' 
    static long cal_minimum_time(long X) 
    { 
  
        // Stores the minimum time 
        long t = 0; 
        long sum = 0; 
  
        while (sum < X) { 
  
            // increment 't' by 1 
            t++; 
  
            // update the sum 
            sum = sum + t; 
        } 
  
        return t; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        long n = 6; 
        long ans = cal_minimum_time(n); 
        System.out.println("The minimum time required is : " + ans); 
    } 
} 

