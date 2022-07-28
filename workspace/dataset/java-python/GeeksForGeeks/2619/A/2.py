

# Python program to Find pair with  
# maximum GCD in an array 
import math 
  
# function to find GCD of pair with 
# max GCD in the array 
def findMaxGCD(arr, n) : 
      
    # Computing highest element 
    high = 0
    i = 0
    while i < n : 
        high = max(high, arr[i]) 
        i = i + 1
   
    # Array to store the count of divisors 
    # i.e. Potential GCDs 
    divisors = [0] * (high + 1)  
   
    # Iterating over every element 
    i = 0
    while i < n : 
          
        # Calculating all the divisors 
        j = 1
        while j <= math.sqrt(arr[i]) : 
          
            # Divisor found 
            if (arr[i] % j == 0) : 
          
                # Incrementing count for divisor 
                divisors[j]= divisors[j]+1
                  
                # Element/divisor is also a divisor 
                # Checking if both divisors are 
                # not same 
                if (j != arr[i] / j) : 
                    divisors[arr[i] / j] = divisors[arr[i] / j]  
                                          + 1
              
            j = j + 1
                      
        i = i + 1            
          
    # Checking the highest potential GCD 
    i = high 
    while i >= 1 : 
          
        # If this divisor can divide at least 2 
        # numbers, it is a GCD of at least 1 pair 
        if (divisors[i] > 1) : 
            return i 
        i = i - 1
    return 1
  
# Driver code 
  
# Array in which pair with max GCD 
# is to be found 
arr = [ 1, 2, 4, 8, 8, 12 ] 
   
# Size of array 
n = len(arr) 
  
print findMaxGCD(arr,n) 
  
# This code is contributed by Nikita Tiwari. 

