

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
    static int MAX = 26; 
      
    // Function to count the number of smaller 
    // strings in A[] for every String in B[] 
    static Vector<Integer> findCount(String a[],  
                                     String b[],  
                                     int n, int m) 
    { 
      
        // Count the frequency of all characters 
        int []freq = new int[MAX]; 
      
        Vector<Integer> smallestFreq = new Vector<Integer>(); 
      
        // Iterate for all possible strings in A[] 
        for (int i = 0; i < n; i++)  
        { 
            String s = a[i]; 
            Arrays.fill(freq, 0); 
              
            // Increase the frequency of every character 
            for (int j = 0; j < s.length(); j++)  
            { 
                freq[s.charAt(j) - 'a']++; 
            } 
      
            // Check for the smallest character's frequency 
            for (int j = 0; j < MAX; j++) 
            { 
      
                // Get the smallest character frequency 
                if (freq[j] > 0)  
                { 
      
                    // Insert it in the vector 
                    smallestFreq.add(freq[j]); 
                    break; 
                } 
            } 
        } 
      
        // Sort the count of all the frequency of 
        // the smallest character in every string 
        Collections.sort(smallestFreq); 
      
        Vector<Integer> ans = new Vector<Integer>(); 
      
        // Iterate for every String in B[] 
        for (int i = 0; i < m; i++)  
        { 
            String s = b[i]; 
      
            // Hash set every frequency 0 
            Arrays.fill(freq, 0); 
      
            // Count the frequency of every character 
            for (int j = 0; j < s.length(); j++)  
            { 
                freq[s.charAt(j) - 'a']++; 
            } 
      
            int frequency = 0; 
      
            // Find the frequency of the smallest character 
            for (int j = 0; j < MAX; j++) 
            { 
                if (freq[j] > 0) 
                { 
                    frequency = freq[j]; 
                    break; 
                } 
            } 
      
            // Count the number of strings in A[] 
            // which has the frequency of the smaller 
            // character less than the frequency of the 
            // smaller character of the String in B[] 
            int [] array = new int[smallestFreq.size()]; 
            int k = 0; 
            for(Integer val:smallestFreq) 
            { 
                array[k] = val; 
                k++; 
            } 
                  
            int ind = lower_bound(array, 0,  
                                  smallestFreq.size(),  
                                  frequency); 
      
            // Store the answer 
            ans.add(ind); 
        } 
        return ans; 
    } 
      
    static int lower_bound(int[] a, int low,  
                           int high, int element) 
    { 
        while(low < high) 
        { 
            int middle = low + (high - low) / 2; 
            if(element > a[middle]) 
                low = middle + 1; 
            else
                high = middle; 
        } 
        return low; 
    }  
      
    // Function to print the answer 
    static void printAnswer(String a[], String b[], 
                            int n, int m) 
    { 
      
        // Get the answer 
        Vector<Integer> ans = findCount(a, b, n, m); 
      
        // Print the number of strings 
        // for every answer 
        for (Integer it : ans)  
        { 
            System.out.print(it + " "); 
        } 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        String A[] = { "aaa", "aa", "bdc" }; 
        String B[] = { "cccch", "cccd" }; 
        int n = A.length; 
        int m = B.length; 
      
        printAnswer(A, B, n, m); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

