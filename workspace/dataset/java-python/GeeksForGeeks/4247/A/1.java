

// Java program to check if 
// two strings are identical 
import java.util.*; 
  
class GFG { 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
  
        // Get the strings which is to be checked 
        String string1 = in.nextLine(); 
        System.out.println("Enter the first string: "
                           + string1); 
  
        // Get the strings which is to be checked 
        String string2 = in.nextLine(); 
        System.out.println("Enter the second string :"
                           + string2); 
  
        // Check if both strings are equal 
        System.out.println("\nAre both strings same: "); 
  
        if (string1.equals(string2) == true) { 
            System.out.println("Yes"); 
        } 
        else { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by aishwarya.27 

