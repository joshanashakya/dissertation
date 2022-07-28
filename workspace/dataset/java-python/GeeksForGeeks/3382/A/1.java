

// Java implementation of the approach 
  
class GFG { 
  
    // Function to return the minimum cost 
    static int findCost(String str, int arr[], int n) 
    { 
        long costofC = 0, costofO = 0, 
             costofD = 0, costofE = 0; 
  
        // Traverse the string 
        for (int i = 0; i < n; i++) { 
  
            // Min Cost to remove 'c' 
            if (str.charAt(i) == 'c') 
                costofC += arr[i]; 
  
            // Min Cost to remove subsequence "co" 
            else if (str.charAt(i) == 'o') 
                costofO = Math.min(costofC, costofO + arr[i]); 
  
            // Min Cost to remove subsequence "cod" 
            else if (str.charAt(i) == 'd') 
                costofD = Math.min(costofO, costofD + arr[i]); 
  
            // Min Cost to remove subsequence "code" 
            else if (str.charAt(i) == 'e') 
                costofE = Math.min(costofD, costofE + arr[i]); 
        } 
  
        // Return the minimum cost 
        return (int)costofE; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        String str = "geekcodergeeks"; 
        int arr[] = { 1, 2, 1, 3, 4, 2, 6, 4, 6, 2, 3, 3, 3, 2 }; 
        int n = arr.length; 
        System.out.print(findCost(str, arr, n)); 
    } 
} 
// This code has been contributed by 29AjayKumar 

