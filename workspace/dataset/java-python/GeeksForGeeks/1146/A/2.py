

# Python3 program to find the sum of the 
# series 1 + 1/3 + 1/5 + ... 
  
# Function to find the sum of the 
# given series 
def printSumSeries(N) : 
  
    # Intialise the sum to 0 
    sum = 0; 
  
    for i in range(1, N + 1) : 
  
        # Generate the ith term and 
        # add it to the sum 
        sum += 1.0 / (2 * i - 1); 
  
    # Print the final sum 
    print(sum); 
  
# Driver Code 
if __name__ == "__main__" : 
  
    N = 6; 
  
    printSumSeries(N); 
  
# This code is contributed by AnkitRai01 

