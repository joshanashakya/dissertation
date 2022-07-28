

// Java program to find sum of given series 
class demo { 
  
    // function to find sum of given series 
    public static double sumOfTheSeries(int n) 
    { 
        // type -casting n/n+1 from int to double 
        return(double)n / (n + 1); 
    } 
  
    // driver program to test above function 
    public static void main(String args[]) 
    { 
        int n = 10; 
        System.out.println(sumOfTheSeries(n)); 
    } 
} 

