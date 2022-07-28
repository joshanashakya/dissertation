

# Python 3 program to calculate 
# minimum cost for candies 
  
# Function to find minimum cost 
# to be incurred 
def findMinCost(arr, n, choc_cost):  
  
    # To reach first station,  
    # initial chocolates required 
    choc_buy = arr[0]  
    curr_choc = 0
  
    # Start traversing 
    for i in range(0,n - 1):  
      
        # Find no. of chocolates lose 
        # or gain 
        choc = arr[i] - arr[i + 1]  
      
        # Add into curr_coc 
        curr_choc += choc  
      
        # if no. of chocolates becomes 
        # negative that means we have 
        # to buy that no. of chocolates 
        if (curr_choc < 0):  
            choc_buy += abs(curr_choc)  
            curr_choc = 0
      
    # Return cost required 
    return choc_buy * choc_cost  
  
  
# Drivers code 
arr = [10, 6, 11, 4, 7, 1]  
n = len(arr) 
  
# Price of each candy 
p = 5
  
print(findMinCost(arr, n, p)) 
  
# This code is contributed by Smitha Dinesh Semwal 

