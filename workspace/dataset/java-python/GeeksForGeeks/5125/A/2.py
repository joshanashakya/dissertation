

# Python 3 implementation of the  
# above approach 
  
# Function to find minimum number of  
# eliminations such that sum of all  
# adjacent elements is even 
def min_elimination(n, arr): 
    countOdd = 0
  
    # Stores the new value 
    for i in range(n): 
          
        # Count odd numbers 
        if (arr[i] % 2): 
            countOdd += 1
  
    # Return the minimum of even and 
    # odd count 
    return min(countOdd, n - countOdd) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 7, 9] 
    n = len(arr) 
  
    print(min_elimination(n, arr)) 
  
# This code is contributed by 
# Surendra_Gangwar 

