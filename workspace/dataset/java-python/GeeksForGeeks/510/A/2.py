

# Python implementation of the above approach 
  
# Function to prthe series 
def printSeries(N): 
  
    ith_term = 0; 
  
    # Generate the ith term and 
    # prit 
    for i in range(1,N+1): 
  
        ith_term = 0; 
        if(i % 2 == 0): 
            ith_term = 2 * i * i + 1; 
        else: 
            ith_term = 2 * i * i - 1; 
        print(ith_term,end= ", "); 
      
# Driver Code 
if __name__ == '__main__': 
    N = 7; 
  
    printSeries(N); 
      
# This code is contributed by Princi Singh 

