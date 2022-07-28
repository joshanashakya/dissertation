

# Python 3 implementation of the approach 
  
# Function to return the minimized sum 
def findAnswer(n, arr): 
      
    # Sort the array to pair the elements 
    arr.sort(reverse = False) 
  
    # Variable to hold the answer 
    sum = 0
  
    # Pair smallest with largest, second 
    # smallest with second largest, and  
    # so on 
    for i in range(int(n / 2)): 
        sum += ((arr[i] + arr[n - i - 1]) * 
                (arr[i] + arr[n - i - 1])) 
  
    return sum
  
# Driver code 
if __name__ == '__main__': 
    arr = [53, 28, 143, 5] 
    n = len(arr) 
    print(findAnswer(n, arr)) 
  
# This code is contributed by 
# Surendra_Gangwar 

