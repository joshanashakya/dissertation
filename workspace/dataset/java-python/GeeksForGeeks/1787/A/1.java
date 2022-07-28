

// Java implementation of the above approach  
class GFG  
{ 
      
    // Function to return the lowest power  
    // of 2 close to given positive number  
    static int powOfPositive(int n)  
    {  
        // Floor function is used to determine  
        // the value close to the number  
        int pos = (int)Math.floor((Math.log(n)/Math.log(2)));  
        return (int)Math.pow(2, pos);  
    }  
      
    // Function to return the lowest power  
    // of 2 close to given negative number  
    static int powOfNegative(int n)  
    {  
        // Ceil function is used for negative numbers  
        // as -1 > -4. It would be opposite  
        // to positive numbers where 1 < 4  
        int pos = (int)Math.ceil((Math.log(n)/Math.log(2)));  
        return (int)(-1 * Math.pow(2, pos));  
    }  
      
    // Function to find the highest power of 2  
    static void highestPowerOf2(int n)  
    {  
      
        // To check if the given number  
        // is positive or negative  
        if (n > 0)  
        {  
            System.out.println(powOfPositive(n));  
        }  
        else 
        {  
            // If the number is negative,  
            // then the ceil of the positive number  
            // is calculated and  
            // negative sign is added  
            n = -n;  
            System.out.println(powOfNegative(n));  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    { 
        int n = -24;  
        highestPowerOf2(n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

