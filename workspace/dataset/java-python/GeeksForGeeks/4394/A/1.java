

// Java program for the above series 
class GFG { 
      
    // Function to find the sum of series 
    static void printSeriesSum(int N) 
    { 
        double sum = 0; 
      
        int a = 1; 
        int cnt = 0; 
      
        // Flag to find the multiplicating 
        // factor.. i.e, by 2 or 3/2 
        boolean flag = true; 
      
        // First term 
        sum += a; 
      
        while (cnt < N) { 
      
            int nextElement; 
      
            // If flag is true, multiply by 2 
            if (flag == true) { 
                nextElement = a * 2; 
                sum += nextElement; 
                flag = !flag; 
            } 
      
            // If flag is false, multiply by 3/2 
            else { 
                nextElement = a * 3 / 2; 
                sum += nextElement; 
                flag = !flag; 
            } 
      
            // Update the previous element 
            // to nextElement 
            a = nextElement; 
            cnt++; 
        } 
      
        // Print the sum 
        System.out.println(sum); 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
      
        int N = 8; 
      
        printSeriesSum(N); 
    } 
} 
// This code is contributed by AnkitRai01 

