

# Python3 program for the above approach 
  
# Function to find the sum of series 
def printSeriesSum(N) : 
      
    sum = 0; 
  
    for i in range(1, N + 1) : 
  
        # Generate the ith term and 
        # add it to the sum if i is 
        # even and subtract if i is 
        # odd 
        if (i & 1) : 
            sum += i / (i + 1); 
       
        else : 
            sum -= i / (i + 1); 
      
  
    # Print the sum 
    print(sum); 
  
# Driver Code 
if __name__ == "__main__" : 
  
    N = 10; 
  
    printSeriesSum(N); 
     
    # This code is contributed by Yash_R 

