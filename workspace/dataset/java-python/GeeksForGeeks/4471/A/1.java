

// Java implementation of the approach 
  
class GFG { 
  
    // returns the gcd after all updates 
    // in the array 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
  
        return gcd(b % a, a); 
    } 
  
    static void print_gcd_online(int n, int m,  
                    int[][] query, int[] arr) 
    { 
  
        // stores the gcd of the initial array elements 
        int max_gcd = 0;  
  
        int i = 0; 
        for (i = 0; i < n; i++) // calculates the gcd 
            max_gcd = gcd(max_gcd, arr[i]); 
  
        // performing online queries 
        for (i = 0; i < m; i++) { 
  
            query[i][0]--; // index is 1 based 
  
            // divide the array element  
            arr[query[i][0]] /= query[i][1]; 
   
            // calculates the current gcd 
            max_gcd = gcd(arr[query[i][0]], max_gcd);  
  
            // print the gcd after each step 
            System.out.println(max_gcd); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 3; 
        int m = 3; 
        int[][] query = new int[m][2]; 
        int[] arr = new int[] { 36, 24, 72 }; 
        query[0][0] = 1; 
        query[0][1] = 3; 
        query[1][0] = 3; 
        query[1][1] = 12; 
        query[2][0] = 2; 
        query[2][1] = 4; 
  
        print_gcd_online(n, m, query, arr); 
    } 
} 

