

// Java implementation to find the  
// maximum occurence of the subsequence 
// such that the indices of characters 
// are in arithmetic progression 
import java.util.*; 
  
class GFG  
{ 
    // Function to find the  
    // maximum occurence of the subsequence 
    // such that the indices of characters 
    // are in arithmetic progression 
    static int maximumOccurrence(String s) 
    { 
        int n = s.length(); 
       
        // Frequencies of subsequence 
        HashMap<String, Integer> freq = new HashMap<String,Integer>(); 
        int i, j; 
  
        // Loop to find the frequencies  
        // of subsequence of length 1 
        for ( i = 0; i < n; i++) { 
            String temp = ""; 
            temp += s.charAt(i); 
            if (freq.containsKey(temp)){ 
                freq.put(temp,freq.get(temp)+1);  
            } 
            else{ 
                freq.put(temp, 1);  
            } 
        } 
           
        // Loop to find the frequencies  
        // subsequence of length 2  
        for (i = 0; i < n; i++) { 
            for (j = i + 1; j < n; j++) { 
                String temp = ""; 
                temp += s.charAt(i); 
                temp += s.charAt(j); 
                if(freq.containsKey(temp)) 
                    freq.put(temp,freq.get(temp)+1); 
                else 
                    freq.put(temp,1); 
            } 
        } 
        int answer = Integer.MIN_VALUE; 
       
        // Finding maximum frequency 
        for (int it : freq.values()) 
            answer = Math.max(answer, it); 
        return answer; 
    } 
       
    // Driver Code 
    public static void main(String []args) 
    { 
        String s = "xxxyy"; 
       
        System.out.print(maximumOccurrence(s)); 
    } 
} 
  
// This code is contributed by chitranayal 

