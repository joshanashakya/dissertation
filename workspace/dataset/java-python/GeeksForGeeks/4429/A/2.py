

# Python3 implementation of the approach  
  
# Function to find the maximum length array  
def maxLengthArr(x, y) : 
  
    # To store if an element is  
    # already taken or not  
    ex = [0] * (1 << x); 
      
    # To store visited numbers 
    ex[0] = 1; 
    pre = [0]; 
      
    # For all possible values of pre[] 
    for i in range(1, (1 << x)) : 
          
        # If it is already taken 
        if (ex[i ^ y]) : 
            continue; 
              
        pre.append(i); 
        ex[i] = 1; 
          
    # Not possible 
    if (len(pre) == 1) : 
        print("-1", end = ""); 
        return; 
          
    # Print the array constructing it 
    # from the prefix-xor array 
    for i in range(1, len(pre)) : 
        print(pre[i] ^ pre[i - 1], end = " ");  
  
# Driver code 
if __name__ == "__main__" : 
      
    X = 3; Y = 5; 
    maxLengthArr(X, Y);  
  
# This code is contributed by AnkitRai01 

