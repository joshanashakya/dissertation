

# Python3 program to find the maximum sum of strictly 
# increasing subarrays 
  
# Returns maximum sum of strictly increasing 
# subarrays 
def maxsum_SIS(arr, n): 
    # Initialize max_sum be 0 
    max_sum = 0
   
    # Initialize current sum be arr[0] 
    current_sum = arr[0]  
   
    # Traverse array elements after first element. 
    for i in range(1,n): 
        # update current_sum for strictly increasing subarray 
        if (arr[i-1] < arr[i]): 
            current_sum = current_sum + arr[i] 
   
   
        else: 
            # strictly increasing subarray break 
            # update max_sum and current_sum  
            max_sum = max(max_sum, current_sum) 
            current_sum = arr[i] 
   
    return max(max_sum, current_sum) 
   
# driver program 
def main(): 
    arr = [1, 2, 2, 4] 
    n = len(arr) 
   
    print("Maximum sum : " , maxsum_SIS(arr , n)), 
  
if __name__ == '__main__': 
    main() 
      
# This code is contributed by 29AjayKumar 

