

# Python implementation of the above implementation 
  
# Function to return the count 
# of minimum elements such that  
# the sum of those elements is > S. 
def countNumber(N, S): 
  
    countElements = 0; 
    currentSum = 0
  
    currSum = 0; 
  
    # Loop from N to 1 to add the numbers 
    # and check the condition. 
    while (currSum <= S) : 
        currSum += N; 
        N = N - 1; 
        countElements=countElements + 1; 
      
    return countElements; 
  
# Driver code 
N = 5; 
S = 11; 
count = countNumber(N, S); 
print(count) ; 
  
# This code is contributed by Shivi_Aggarwal 

