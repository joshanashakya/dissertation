

# Python 3 program to minimum changes required  
# in an array for k distinct elements. 
MAX = 100005
  
# Function to minimum changes required  
# in an array for k distinct elements. 
def Min_Replace(arr, n, k): 
    arr.sort(reverse = False) 
  
    # Store the frequency of each element 
    freq = [0 for i in range(MAX)] 
      
    p = 0
    freq[p] = 1
      
    # Store the frequency of elements 
    for i in range(1, n, 1): 
        if (arr[i] == arr[i - 1]): 
            freq[p] += 1
        else: 
            p += 1
            freq[p] += 1
  
    # Sort frequencies in descending order 
    freq.sort(reverse = True) 
      
    # To store the required answer 
    ans = 0
    for i in range(k, p + 1, 1): 
        ans += freq[i] 
          
    # Return the required answer 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 7, 8, 2, 3, 2, 3] 
      
    n = len(arr) 
      
    k = 2
      
    print(Min_Replace(arr, n, k)) 
      
# This code is contributed by 
# Surendra_Gangwar 

