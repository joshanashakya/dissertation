

// Java program to find whether a number 
// is power-isolated or not 
class GFG 
{ 
      
static void checkIfPowerIsolated(int num) 
{ 
    int input = num; 
    int count = 0; 
    int[] factor= new int[num+1]; 
  
    // for 2 as prime factor 
    if(num % 2 == 0) 
    { 
        while(num % 2 == 0) 
        { 
            ++count; 
            num/=2; 
        }  
        factor[2] = count; 
    } 
  
    // for odd prime factor 
    for (int i = 3; i*i <= num; i += 2) 
    { 
        count = 0; 
        while(num % i == 0) 
        {  
            ++count; 
            num /= i; 
        } 
        if(count > 0) 
            factor[i] = count; 
    } 
          
    if(num > 1) 
        factor[num] = 1; 
          
    // calculate product of powers and prime factors  
    int product = 1; 
    for(int i = 0; i < num + 1; i++)  
    { 
        if(factor[i] > 0) 
            product = product * factor[i] * i; 
    } 
          
    // check result for power-isolation 
    if (product == input) 
        System.out.print("Power-isolated Integer\n"); 
    else
        System.out.print("Not a Power-isolated Integer\n"); 
} 
  
// Driver code  
public static void main(String[] args) 
{ 
    checkIfPowerIsolated(12); 
    checkIfPowerIsolated(18); 
    checkIfPowerIsolated(35); 
} 
} 
  
// This code is contributed by Code_Mech. 

