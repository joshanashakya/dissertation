

// Java program to find the sum of given series 
class demo { 
  
    // function to find the sum of given series 
    public static double sumOfTheSeries(int n) 
    { 
       // Computing sum term by term 
        double sum = 0.0; 
        for (int i = 1; i <= n; i++)  
            sum += 1.0 / (i * (i + 1)); 
        return sum; 
    } 
  
    // driver program to test above function 
    public static void main(String args[]) 
    { 
        int n = 10; 
        System.out.println(sumOfTheSeries(n)); 
    } 
} 

