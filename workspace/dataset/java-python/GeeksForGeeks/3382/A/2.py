

# Python3 implementation of the approach 
  
# Function to return the minimum cost 
def findCost(str, arr, n): 
    costofC, costofO = 0, 0
    costofD, costofE = 0, 0
  
    # Traverse the string 
    for i in range(n): 
  
        # Min Cost to remove 'c' 
        if (str[i] == 'c'): 
            costofC += arr[i] 
  
        # Min Cost to remove subsequence "co" 
        elif (str[i] == 'o'): 
            costofO = min(costofC, costofO + arr[i]) 
  
        # Min Cost to remove subsequence "cod" 
        elif (str[i] == 'd'): 
            costofD = min(costofO, costofD + arr[i]) 
  
        # Min Cost to remove subsequence "code" 
        elif (str[i] == 'e'): 
            costofE = min(costofD, costofE + arr[i]) 
  
    # Return the minimum cost 
    return costofE 
  
# Driver Code 
if __name__ == '__main__': 
    str = "geekcodergeeks"
    arr = [1, 2, 1, 3, 4, 2, 6, 4, 6, 2, 3, 3, 3, 2] 
    n = len(arr) 
    print(findCost(str, arr, n)) 
  
# This code contributed by PrinciRaj1992  

