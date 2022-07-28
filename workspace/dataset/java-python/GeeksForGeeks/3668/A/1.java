

// Java program to find the  
// volume of water wasted 
class GFG 
{ 
      
// Function to calculate amount of wasted water 
static double wastedWater(double V, double M, double N) 
{ 
    double wasted_amt, amt_per_min, time_to_fill; 
  
    // filled amount of water in one minute 
    amt_per_min = M - N; 
  
    // total time taken to fill the tank 
    // because of leakage 
    time_to_fill = V / amt_per_min; 
  
    // wasted amount of water 
    wasted_amt = N * time_to_fill; 
  
    return wasted_amt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    double V, M, N; 
    V = 700; 
    M = 10; 
    N = 3; 
    System.out.println(wastedWater(V, M, N)) ; 
  
    V = 1000; 
    M = 100; 
    N = 50; 
    System.out.println(wastedWater(V, M, N)); 
} 
} 
  
// This Code is Contributed by Code_Mech. 

