

# Python 3 implementation of the approach 
  
# Function to print the maximum length  
# sub-sequence 
def maxLengthSubSeq(a, n): 
      
    # Arrays to store the values to be printed 
    temp = [0 for i in range(n)] 
    print1 = [0 for i in range(n)] 
    y = 0
  
    for i in range(0, n, 1): 
        j = 0
        x = 0
  
        # Store the first value into  
        # the temp array 
        temp[j] = a[x] 
        j += 1
  
        # Index of the next element 
        x = a[x] + x 
  
        # Iterate till index is in range  
        # of the array 
        while (x < n): 
            temp[j] = a[x] 
            j += 1
            x = a[x] + x 
          
        # If the length (temp) > the length  
        # (print) then copy the contents of  
        # the temp array into the print array 
        if (y < j): 
            for k in range(0, j, 1): 
                print1[k] = temp[k] 
                y = j 
              
    # Print the contents of the array 
    for i in range(0, y, 1): 
        print(print1[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    a = [1, 2, 3, 4, 5] 
    n = len(a) 
    maxLengthSubSeq(a, n) 
  
# This code is contributed by  
# Surendra_Gangwar 

