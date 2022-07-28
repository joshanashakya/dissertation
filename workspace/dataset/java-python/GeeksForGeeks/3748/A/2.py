

# Python 3 program to print lexicographically 
# permutation array by replacing minimum 
# element of array 
  
# Function to calculate lexicographically  
# permutation in array 
def lexicoSmallestPermuatation(arr, n): 
      
    # Calculate frequency of array elements 
    cnt = [0 for i in range(n + 1)] 
    for i in range(n): 
        cnt[arr[i]] += 1
  
    ele = 1
    replacement = 0
    vis = [0 for i in range(n + 1)] 
    for i in range(n): 
          
        # If count of element is 1, no 
        # need to replace 
        if (cnt[arr[i]] == 1): 
            continue
  
        # Find the element that has not 
        # occurred in array 
        while (cnt[ele]): 
            ele += 1
  
        # If replacement element is greater 
        # than current arr[i] then visit 
        # that element for next iteration 
        if (ele > arr[i] and vis[arr[i]] == 0): 
            vis[arr[i]] = 1; 
  
        else: 
              
            # Decrement count and assign  
            # the element to array 
            cnt[arr[i]] -= 1
            arr[i] = ele 
  
            # Increment the replacement count 
            replacement += 1
  
            # Increment element after assigning 
            # to the array 
            ele += 1
      
    print(replacement) 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 3, 4, 3, 2] 
    sz = len(arr) 
    lexicoSmallestPermuatation(arr, sz) 
      
# This code is contributed by 
# Shashank_Sharma 

