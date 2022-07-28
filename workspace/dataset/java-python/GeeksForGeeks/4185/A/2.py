

# Python3 implementation of the approach 
  
# Function to return the count of pairs 
# from arr with the given sum 
def pairs_count(arr, n, sum): 
      
    # To store the count of pairs 
    ans = 0
  
    # Sort the given array 
    arr = sorted(arr) 
  
    # Take two pointers 
    i, j = 0, n - 1
  
    while (i < j): 
          
        # If sum is greater 
        if (arr[i] + arr[j] < sum): 
            i += 1
  
        # If sum is lesser 
        elif (arr[i] + arr[j] > sum): 
            j -= 1
              
        # If sum is equal 
        else: 
              
            # Find the frequency of arr[i] 
            x = arr[i] 
            xx = i 
            while (i < j and arr[i] == x): 
                i += 1
  
            # Find the frequency of arr[j] 
            y = arr[j] 
            yy = j 
            while (j >= i and arr[j] == y): 
                j -= 1
  
            # If arr[i] and arr[j] are same 
            # then remove the extra number counted 
            if (x == y): 
                temp = i - xx + yy - j - 1
                ans += (temp * (temp + 1)) // 2
            else: 
                ans += (i - xx) * (yy - j) 
  
    # Return the required answer 
    return ans 
  
# Driver code 
arr = [1, 5, 7, 5, -1] 
n = len(arr) 
sum = 6
  
print(pairs_count(arr, n, sum)) 
  
# This code is contributed by Mohit Kumar 

