

// Java program to print the season 
// name based on the month number 
  
import java.util.*; 
public class Seasons { 
  
    public static void findSeason(int M) 
    { 
  
        // Checks out the season according 
        // to the month number entered by the user 
        switch (M) { 
        case 12: 
        case 1: 
        case 2: 
            System.out.println("WINTER"); 
            break; 
        case 3: 
        case 4: 
        case 5: 
            System.out.println("SPRING"); 
            break; 
        case 6: 
        case 7: 
        case 8: 
            System.out.println("SUMMER"); 
            break; 
        case 9: 
        case 10: 
        case 11: 
            System.out.println("AUTUMN"); 
            break; 
        default: 
            // Handles the condition if number entered 
            // is not among the valid 12 months 
            System.out.println("Invalid Month number"); 
            break; 
        } 
    } 
  
    // Driver Code 
    public static void main(String abc[]) 
    { 
        int M = 5; 
        System.out.println("For Month number: "
                           + M); 
        findSeason(M); 
  
        M = 10; 
        System.out.println("For Month number: "
                           + M); 
        findSeason(M); 
    } 
} 

