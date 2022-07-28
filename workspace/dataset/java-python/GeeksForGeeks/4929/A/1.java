

// Java implementation of the approach 
public class GFG { 
  
    // Function to return the cost to make str a Panagram 
    static int costToPanagram(String str, int cost[]) 
    { 
  
        int i, n = str.length(); 
        int occurrences[] = new int[26]; 
  
        // Count the occurrences of each lowercase character 
        for (i = 0; i < n; i++) 
            occurrences[str.charAt(i) - 'a']++; 
  
        // To store the total gain 
        int gain = 0; 
        for (i = 0; i < 26; i++) { 
  
            // If some character is missing, it has to be added 
            // at twice the cost 
            if (occurrences[i] == 0) 
                gain -= (2 * cost[i]); 
  
            // If some character appears more than once 
            // all of its occurrences except 1 
            // can be traded for some gain 
            else if (occurrences[i] > 1) 
                gain += (cost[i] * (occurrences[i] - 1)); 
        } 
  
        // If gain is more than the cost 
        if (gain >= 0) 
            return 0; 
  
        // Return the total cost if gain < 0 
        return (gain * -1); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int cost[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                       1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }; 
        String str = "geeksforgeeks"; 
  
        System.out.println(costToPanagram(str, cost)); 
    } 
} 

