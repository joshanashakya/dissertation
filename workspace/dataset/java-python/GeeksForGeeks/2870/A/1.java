

// Java program to print Number of Words, 
// Vowels and Frequency of Each Character 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class Stringfun  
{ 
    String str = "Geeks for Geeks."; 
  
    void words() 
    { 
        int wCount = 0, uCount = 0, vCount = 0; 
  
        for (int i = 0; i < str.length(); i++)  
        { 
            char c = str.charAt(i); 
  
            switch (c)  
            { 
            case ' ': 
            case '.': 
                wCount++; // more delimiters can be given 
            } 
  
            switch (c)  
            { 
            // program for calculating number of vowels 
            case 'A': 
            case 'E': 
            case 'I': 
            case 'O': 
            case 'U': 
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                vCount++; 
            } 
  
            if (c >= 65 && c <= 90)  
            { 
                uCount++; 
            } 
        } 
  
        System.out.println("Number of words = " + wCount); 
        System.out.println("Number of vowels = " + vCount); 
        System.out.println("Number of upper case characters = "
                                                        + uCount); 
    } 
  
    // Function to calculate the frequency 
    // of each character in the string 
    void frequency() 
    { 
        // Creates an empty TreeMap 
        TreeMap<Character, Integer> hmap =  
                     new TreeMap<Character, Integer>(); 
   
        // Traverse through the given array 
        for (int i = 0; i < str.length(); i++) 
        { 
            Integer c = hmap.get(str.charAt(i)); 
   
            // If this is first occurrence of element  
            if (hmap.get(str.charAt(i)) == null) 
               hmap.put(str.charAt(i), 1); 
   
            // If elements already exists in hash map 
            else
              hmap.put(str.charAt(i), ++c); 
        } 
          
        // Print result 
        for (Map.Entry m:hmap.entrySet()) 
          System.out.println("Character = " + m.getKey() +  
                         " Frequency = " + m.getValue()); 
    } 
  
    // Driver program to run and test above program 
    public static void main(String args[]) throws IOException 
    { 
        Stringfun obj = new Stringfun(); 
        obj.words(); 
        obj.frequency(); 
    } 
} 

