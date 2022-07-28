

# Python implementation to find the 
# minimum flips required such that 
# alternate subarrays have  
# different parity 
  
# Function to find the minimum 
# flips required in binary array 
def count_flips(a, n, k): 
    min_diff, ans, set = n, 0, False
      
    # Loop to iterate over  
    # the subarrays of size K 
    for i in range(k): 
        # curr_index is used to iterate 
        # over all the subarrays 
        curr_index, segment,\ 
        count_zero, count_one =\ 
                   i, 0, 0, 0
          
        # Loop to iterate over the array 
        # at the jump of K to  
        # consider every parity 
        while curr_index < n: 
              
            # Condition to check if the  
            # subarray is at even position 
            if segment % 2 == 0: 
                # The value needs to be  
                # same as the first subarray 
                if a[curr_index] == 1: 
                    count_zero += 1
                else: 
                    count_one += 1
            else: 
                # The value needs to be  
                # opposite of the first subarray 
                if a[curr_index] == 0: 
                    count_zero += 1
                else: 
                    count_one += 1
            curr_index += k 
            segment+= 1
        ans += min(count_zero, count_one) 
        if count_one<count_zero: 
            set = not set
        min_diff = min(min_diff,\ 
         abs(count_zero-count_one)) 
    # Condition to check if the 1s 
    # in the subarray is odd 
    if set: 
        return ans 
    else: 
        return ans + min_diff 
  
# Driver Code 
if __name__ == "__main__": 
    n, k = 6, 3
    a =[0, 0, 1, 1, 0, 0] 
    print(count_flips(a, n, k)) 

