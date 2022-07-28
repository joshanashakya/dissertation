

      
# A simple Python3 Program to count all subarrays having 
# XOR of elements as given value m 
   
# Simple function that returns count of subarrays 
# of arr with XOR value equals to m 
def subarrayXor(arr, n, m): 
    ans = 0 # Initialize ans 
   
    # Pick starting po i of subarrays 
    for i in range(0,n): 
          
        xorSum = 0 # Store XOR of current subarray 
   
        # Pick ending po j of subarray for each i 
        for j  in range(i,n): 
            # calculate xorSum 
            xorSum = xorSum ^ arr[j] 
   
            # If xorSum is equal to given value, 
            # increase ans by 1. 
            if (xorSum == m): 
                ans+=1
    return ans 
   
# Driver program to test above function 
def main(): 
    arr = [ 4, 2, 2, 6, 4 ] 
    n = len(arr) 
    m = 6
   
    print("Number of subarrays having given XOR is "
         , subarrayXor(arr, n, m)) 
  
if __name__ == '__main__': 
    main() 
      
#this code contributed by 29AjayKumar 

