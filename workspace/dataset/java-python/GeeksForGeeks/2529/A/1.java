

// Java implementation to find 
// Autobiographical numbers with length N 
  
import java.util.*; 
import java.lang.Math; 
  
public class autobio { 
    public static boolean isAutoBio(int num) 
    { 
        String autoStr; 
  
        int index, number, i, j, cnt; 
  
        // Converting the integer 
        // number to string 
        autoStr = Integer.toString(num); 
  
        for (i = 0; i < autoStr.length(); i++) { 
  
            // Extracting each character 
            // from each index one by one 
            // and converting into an integer 
            index = Integer.parseInt(autoStr.charAt(i) + ""); 
  
            // initialize count as 0 
            cnt = 0; 
  
            for (j = 0; j < autoStr.length(); j++) { 
                number = Integer.parseInt(autoStr.charAt(j) + ""); 
  
                // Check if it is equal to the 
                // index i if true then 
                // increment the count 
                if (number == i) 
  
                    // It is an 
                    // Autobiographical 
                    // number 
                    cnt++; 
            } 
  
            // Return false if the count and 
            // the index number are not equal 
            if (cnt != index) 
  
                return false; 
        } 
  
        return true; 
    } 
  
    // Function to print autobiographical number 
    // with given number of digits 
    public static void findAutoBios(double n) 
    { 
        // both the boundaries are taken double, so as 
        // to satisfy Math.pow() function's signature 
        double high, low; 
  
        int i, flag = 0; 
  
        // Left boundary of interval 
        low = Math.pow(10.0, n - 1); 
  
        // Right boundary of interval 
        high = Math.pow(10.0, n) - 1.0; 
  
        for (i = (int)low; i <= (int)high; i++) 
  
            if (isAutoBio(i)) { 
                flag = 1; 
                System.out.print(i + ", "); 
            } 
  
        // Flag = 0 implies that the number 
        // is not an autobiographical no. 
        if (flag == 0) 
  
            System.out.println("There is no Autobiographical Number"
                               + "with " + (int)n + " digits"); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        double N = 0; 
        findAutoBios(N); 
  
        N = 4; 
        findAutoBios(N); 
    } 
} 

