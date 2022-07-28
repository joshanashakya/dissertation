

# Python 3 program to find the total  
# number of different staircase that  
# can made from N boxes 
  
# Function to find the total number  
# of different staircase that can  
# made from N boxes 
def countStaircases(N): 
  
    # DP table, there are two states. 
    # First describes the number of boxes 
    # and second describes the step 
    memo = [[0 for x in range(N + 5)] 
               for y in range(N + 5)] 
  
    # Initilize all the elements of 
    # the table to zero 
    for i in range(N + 1): 
        for j in range (N + 1): 
            memo[i][j] = 0
          
    # Base case 
    memo[3][2] = memo[4][2] = 1
  
    for i in range (5, N + 1) : 
        for j in range (2, i + 1) : 
  
            # When step is equal to 2 
            if (j == 2) : 
                memo[i][j] = memo[i - j][j] + 1
              
            # When step is greater than 2 
            else : 
                memo[i][j] = (memo[i - j][j] + 
                              memo[i - j][j - 1]) 
      
    # Count the total staircase 
    # from all the steps 
    answer = 0
    for i in range (1, N + 1): 
        answer = answer + memo[N][i]  
  
    return answer 
  
# Driver Code 
if __name__ == "__main__": 
  
    N = 7
  
    print (countStaircases(N)) 
  
# This code is contributed 
# by ChitraNayal 

