

# Python3 Implementation to print all the  
# Maximal Increasing Sub-array of array  
  
# Function to print each of maximal  
# contiguous increasing subarray  
def printmaxSubseq(arr, n) : 
      
    # Loop to iterate through the array and print  
    # the maximal contiguous increasing subarray.  
    for i in range(n - 1) : 
          
        # Condition to check whether the element at i, is  
        # greater than its next neighbouring element or not.  
        if (arr[i] < arr[i + 1]) : 
            print(arr[i], end = " ");  
        else : 
            print(arr[i]); 
              
    print(arr[n - 1]); 
      
# Driver function  
if __name__ == "__main__" :  
  
    arr = [ 9, 8, 11, 13, 10, 15, 14, 16, 20, 5 ];  
    n = len(arr);  
    printmaxSubseq(arr, n);  
  
# This code is contributed by AnkitRai01 

