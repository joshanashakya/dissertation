

// Java implementation of the approach  
import java.util.HashMap; 
  
class GFG  
{ 
    static int maxlen = 100; 
  
    // Function to generate all the sub-strings 
    public static void generateSubStrings( 
                       String s, HashMap<String, 
                                         Integer> mpp)  
    { 
  
        // Length of the string 
        int l = s.length(); 
  
        // Generate all sub-strings 
        for (int i = 0; i < l; i++) 
        { 
            String temp = ""; 
            for (int j = i; j < l; j++)  
            { 
                temp += s.charAt(j); 
  
                // Count the occurrence of 
                // every sub-string 
                if (mpp.containsKey(temp))  
                { 
                    int x = mpp.get(temp); 
                    mpp.put(temp, ++x); 
                }  
                else
                    mpp.put(temp, 1); 
            } 
        } 
    } 
  
    // Compute the Binomial Coefficient 
    public static void binomialCoeff(int[][] C)  
    { 
        int i, j; 
  
        // Calculate value of Binomial Coefficient 
        // in bottom up manner 
        for (i = 1; i < 100; i++)  
        { 
            for (j = 0; j < 100; j++) 
            { 
  
                // Base Cases 
                if (j == 0 || j == i) 
                    C[i][j] = 1; 
  
                // Calculate value using previously 
                // stored values 
                else
                    C[i][j] = C[i - 1][j - 1] +  
                              C[i - 1][j]; 
            } 
        } 
    } 
  
    // Function to return the result for a query 
    public static int answerQuery(HashMap<String, 
                                          Integer> mpp,  
                                      int[][] C, int k) 
    { 
        int ans = 0; 
  
        // Iterate for every 
        // unique sub-string 
        for (HashMap.Entry<String,  
                           Integer> entry : mpp.entrySet())  
        { 
  
            // Count the combinations 
            if (entry.getValue() >= k) 
                ans += C[entry.getValue()][k]; 
        } 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String s = "aabaab"; 
  
        // Get all the sub-strings 
        // Store the occurrence of 
        // all the sub-strings 
        HashMap<String,  
                Integer> mpp = new HashMap<>(); 
        generateSubStrings(s, mpp); 
  
        // Pre-computation 
        int[][] C = new int[maxlen][maxlen]; 
        binomialCoeff(C); 
  
        // Queries 
        int[] queries = { 2, 3, 4 }; 
        int q = queries.length; 
  
        // Perform queries 
        for (int i = 0; i < q; i++) 
            System.out.println(answerQuery(mpp, C,  
                                     queries[i])); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

