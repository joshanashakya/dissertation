

# Python3 implementation of the approach  
  
# Function to check if the bitwise AND  
# of the array elements is even or odd  
def checkEvenOdd(arr, n) : 
  
    for i in range(n) : 
  
        # If at least an even element is present  
        # then the bitwise AND of the  
        # array elements will be even  
        if (arr[i] % 2 == 0) : 
  
            print("Even", end = "");  
            return;  
  
    print("Odd", end = "");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 12, 20, 36, 38 ];  
    n = len(arr);  
  
    checkEvenOdd(arr, n);  
      
# This code is contributed by AnkitRai01 

