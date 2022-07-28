

# Python3 program to reach N-th stair 
# by taking a maximum of K leap  
  
def solve(N, K) : 
  
    # elements of combo[] stores the no of   
    # possible ways to reach it by all   
    # combinations of k leaps or less  
    combo = [0] * (N + 1) 
  
    # assuming leap 0 exist and assigning   
    # its value to 1 for calculation  
    combo[0] = 1
  
    # loop to iterate over all   
    # possible leaps upto k;  
    for i in range(1, K + 1) : 
  
        #  in this loop we count all possible   
        # leaps to reach the jth stair with   
        # the help of ith leap or less   
        for j in range(0, N + 1) : 
  
            # if the leap is not more than the i-j   
            if j >= i : 
  
                # calculate the value and   
                # store in combo[j]   
                # to reuse it for next leap   
                # calculation for the jth stair  
                combo[j] += combo[j - i] 
  
  
    # returns the no of possible number   
    # of leaps to reach the top of   
    # building of n stairs   
    return combo[N] 
    
# Driver Code 
if __name__ == "__main__" : 
  
    # N i the no of total stairs   
    # K is the value of the greatest leap  
    N, K = 29, 5
  
    print(solve(N, K)) 
  
# This code is contributed by ANKITRAI1 

