

// Simple Java program to 
// find the n-th number made 
// of even digits only 
  
class GFG 
{ 
    // function to calculate nth  
    // number made of even digits only 
    static int findNthEvenDigitNumber(int n ) 
    { 
        // variable to note how  
        // many such numbers have  
        // been found till now 
        int count = 0; 
        for (int i = 0 ; ; i++) 
        { 
            int curr = i; 
      
            // bool variable to check if  
            // 1, 3, 5, 7, 9 is there or not 
            boolean isCurrEvenDigit = true ; 
      
            // checking each digit 
            // of the number 
            while (curr != 0) 
            { 
                // If 1, 3, 5, 7, 9 is found  
                // temp is changed to false 
                if (curr % 10 == 1 || curr % 10 == 3 ||  
                    curr % 10 == 5 || curr % 10 == 7 ||  
                    curr % 10 == 9) 
                    isCurrEvenDigit = false; 
                curr = curr / 10; 
            } 
      
            // temp is true it means that it 
            // does not have 1, 3, 5, 7, 9 
            if (isCurrEvenDigit == true) 
                count++; 
      
            // If nth such number 
            // is found return it 
            if (count == n) 
                return i; 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        System.out.println(findNthEvenDigitNumber(2)); 
        System.out.println(findNthEvenDigitNumber(10));  
    } 
} 

