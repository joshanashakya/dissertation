

// Java program to find number formed by 
// corner digits of powers. 
import java.io.*; 
import java.util.*; 
   
public class GFG { 
      
    static List<Integer> power = new ArrayList<Integer>(); 
    // Find next power by multiplying N  
    // with current power 
    static void nextPower(Integer N) 
    { 
        Integer carry = 0; 
       
        for (int i = 0; i < power.size(); i++) 
        { 
            Integer prod = (power.get(i) * N) + carry ; 
       
            // Store digits of Power one by one. 
            power.set(i,prod % 10); 
       
            // Calculate carry. 
            carry = prod / 10 ; 
        } 
       
        while (carry >= 1) 
        { 
            // Store carry in Power array. 
            power.add(carry % 10); 
            carry = carry / 10 ; 
        } 
    } 
       
    // Prints number formed by corner digits of 
    // powers of N. 
    static void printPowerNumber(int X, int N) 
    { 
           
        // Storing N raised to power 0 
        power.add(1); 
       
        // Initializing empty result 
        List<Integer> res = new ArrayList<Integer>(); 
       
        // One by one compute next powers and 
        // add their corner digits. 
        for (int i = 1; i <= X; i++) 
        { 
            // Call Fucntion that store power 
            // in Power array. 
            nextPower(N) ; 
       
            // Store unit and last digits of 
            // power in res. 
            res.add(power.get(power.size() - 1)); 
            res.add(power.get(0)); 
        } 
       
        for (int i = 0 ; i < res.size(); i++) 
            System.out.print(res.get(i)) ; 
    } 
       
    // Driver Code 
    public static void main(String args[]) 
    { 
        Integer N = 19 , X = 4; 
        printPowerNumber(X, N); 
    } 
} 
   
// This code is contributed by Manish Shaw 
// (manishshaw1) 

