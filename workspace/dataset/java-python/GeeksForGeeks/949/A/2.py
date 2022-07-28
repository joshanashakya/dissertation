

# Python program to print the number of  
# subarrays such that all elements are  
# greater than K 
  
# Function to count number of subarrays 
def countSubarrays(a, n, x): 
    count = 0
    number = 0
      
    # Iterate in the array 
    for i in range(n): 
          
        # check if array element greater 
        # then X or not 
        if (a[i] > x): 
            count += 1
        else: 
            number += (count) * (count + 1) / 2
            count = 0
              
    # After iteration complete check for 
    # the last set of subarrays 
    if (count): 
        number += (count) * (count + 1) / 2
    return int(number) 
  
# Driver Code 
if __name__ == '__main__': 
    a = [3, 4, 5, 6, 7, 2, 10, 11] 
    n = len(a) 
    k = 5
    print(countSubarrays(a, n, k)) 
  
# This code is contributed by 29AjayKumar 

