

# Python 3 program to find absolute difference of  
# elements at even and odd index positions separately 
  
# Function to calculate absolute difference 
def EvenOddAbsoluteDifference(arr, n): 
    even = 0
    odd = 0
  
    for i in range(0, n, 1): 
          
        # Loop to find even, odd absolute  
        # difference 
        if (i % 2 == 0): 
            even = abs(even - arr[i]); 
        else: 
            odd = abs(odd - arr[i]); 
  
    print("Even Index absolute difference :", even) 
    print("Odd Index absolute difference :", odd) 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 5, 6] 
    n = len(arr) 
  
    EvenOddAbsoluteDifference(arr, n) 
      
# This code is contributed by 
# Sahil_shelangia 

