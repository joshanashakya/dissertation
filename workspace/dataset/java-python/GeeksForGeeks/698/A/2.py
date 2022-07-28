

# Python3 program to find the ratio of positive, 
# negative, and zero elements in the array. 
  
# Function to find the ratio of 
# positive, negative, and zero elements 
def positiveNegativeZero(arr): 
  
    # Store the array length into the varible len. 
    length = len(arr); 
  
    # Initialize the postiveCount, negativeCount, and 
    # zeroCountby 0 which will count the total number 
    # of positive, negative and zero elements 
    positiveCount = 0; 
    negativeCount = 0; 
    zeroCount = 0; 
  
    # Traverse the array and count the total number of 
    # positive, negative, and zero elements. 
    for i in range(length): 
        if (arr[i] > 0): 
            positiveCount += 1; 
        elif(arr[i] < 0): 
            negativeCount += 1; 
        elif(arr[i] == 0): 
            zeroCount += 1; 
          
    # Print the ratio of positive, 
    # negative, and zero elements 
    # in the array up to four decimal places. 
    print("{0:.4f}".format((positiveCount / length)), end=" "); 
    print("%1.4f "%(negativeCount / length), end=" "); 
    print("%1.4f "%(zeroCount / length), end=" "); 
    print(); 
  
# Driver Code. 
if __name__ == '__main__': 
  
    # Test Case 1: 
    a1 = [ 2, -1, 5, 6, 0, -3 ]; 
    positiveNegativeZero(a1); 
  
    # Test Case 2: 
    a2 = [ 4, 0, -2, -9, -7, 1 ]; 
    positiveNegativeZero(a2); 
      
# This code is contributed by Rajput-Ji 

