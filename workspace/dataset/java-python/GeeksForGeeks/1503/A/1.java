

// Java implementation of the approach 
import java.util.*; 
public class GFG { 
  
    // Function to return the frequency array 
    // for the given string 
    static int[] getFrequencies(String str) 
    { 
        int freq[] = new int[26]; 
        for (int i = 0; i < str.length(); i++) { 
            freq[str.charAt(i) - 'a']++; 
        } 
        return freq; 
    } 
  
    // Function to return the required count 
    static int countMinParts(String str) 
    { 
  
        int n = str.length(); 
        int freq[] = getFrequencies(str); 
        List<Integer> oddFreq = new ArrayList<>(); 
        List<Integer> evenFreq = new ArrayList<>(); 
  
        int i, sumEven = 0; 
  
        for (i = 0; i < 26; i++) { 
            if (freq[i] == 0) 
                continue; 
  
            // Add frequencies of the even appearing  
            // characters 
            if (freq[i] % 2 == 0) 
                evenFreq.add(freq[i]); 
  
            // Count of the characters that appeared  
            // odd number of times 
            else
                oddFreq.add(freq[i]); 
        } 
  
        for (i = 0; i < evenFreq.size(); i++) { 
            sumEven += evenFreq.get(i); 
        } 
  
        // If there are no characters with odd frequency 
        if (oddFreq.size() == 0) 
            return 1; 
  
        // If there are no characters with even frequency 
        if (sumEven == 0) { 
  
            // Only a single character with odd frequency 
            if (oddFreq.size() == 1) 
                return 1; 
  
            // More than 1 character with odd frequency 
            // string isn't a palindrome 
            return 0; 
        } 
  
        i = 0; 
  
        // All odd appearing characters can also contribute to 
        // the even length palindrome if one character 
        // is removed from the frequency leaving it as even 
        while (i < oddFreq.size()) { 
  
            // If k palindromes are possible where k 
            // is the number of characters with odd frequency 
            if ((sumEven / 2) % oddFreq.size() == 0) 
                return oddFreq.size(); 
  
            // Current character can no longer be an element 
            // in a string other than the mid character 
            if (oddFreq.get(i) == 1) { 
                i++; 
                continue; 
            } 
  
            // If current character has odd frequency > 1 
            // take two characters which can be used in 
            // any of the parts 
            sumEven += 2; 
  
            // Update the frequency 
            oddFreq.set(i, oddFreq.get(i) - 2); 
        } 
  
        // If not possible, then every character of the  
        // string will act as a separate palindrome 
        return n; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        String s = "noonpeep"; 
  
        System.out.println(countMinParts(s)); 
    } 
} 
  
// This code is contributed by chitranayal 

