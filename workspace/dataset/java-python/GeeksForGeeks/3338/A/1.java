

// JAVA program to convert the given string 
import java.util.*; 
  
class GFG 
{ 
      
    // Function to find the minimum number of 
    // operations to convert the given string 
    static void minOperation(String S, int N, int K) 
    { 
        // Check if N is divisible by K 
        if (N % K != 0) 
        { 
            System.out.println("Not Possible"); 
        } 
        else
        { 
            // Array to store frequency of characters 
            // in given string 
            int [] count = new int[26]; 
              
            for (int i = 0; i < N; i++) 
            { 
                count[(S.charAt(i) - 97)]++; 
            } 
          
            int E = N / K; 
          
            Vector<Integer> greaterE = new Vector<>();  
            Vector<Integer> lessE = new Vector<>();  
          
            for (int i = 0; i < 26; i++)  
            { 
          
                // Two arrays with number of operations 
                // required 
                if (count[i] < E) 
                    lessE.add(E - count[i]); 
                else
                    greaterE.add(count[i] - E); 
            } 
          
            Collections.sort(greaterE); 
            Collections.sort(lessE); 
          
            int mi = Integer.MAX_VALUE; 
          
            for (int i = 0; i <= K; i++) 
            { 
          
                // Checking for all possibility 
                int set1 = i; 
                int set2 = K - i; 
          
                if (greaterE.size() >= set1 &&  
                            lessE.size() >= set2)  
                { 
          
                    int step1 = 0; 
                    int step2 = 0; 
          
                    for (int j = 0; j < set1; j++) 
                        step1 += greaterE.get(j); 
          
                    for (int j = 0; j < set2; j++) 
                        step2 += lessE.get(j); 
          
                    mi = Math.min(mi, Math.max(step1, step2)); 
                } 
            } 
          
            System.out.println(mi); 
        } 
  
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        String S = "accb"; 
        int N = S.length(); 
        int K = 2; 
      
        minOperation(S, N, K); 
    } 
} 
  
// This code is contributed by ihritik 

