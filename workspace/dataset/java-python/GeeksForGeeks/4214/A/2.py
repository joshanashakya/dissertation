

# Python3 program to find number of subarrays  
# such that XOR of one half is equal to the other  
  
# Function to find number of subarrays  
# such that XOR of one half is equal  
# to the other  
def findSubarrCnt(arr, n) : 
      
    # Variables to store answer 
    # and current XOR's  
    ans = 0; XOR = 0;  
  
    # Array to store prefix XOR's  
    prefix = [0] * n;  
  
    for i in range(n) :  
  
        # Calculate XOR until this index  
        XOR = XOR ^ arr[i];  
  
        # Store the XOR in prefix array  
        prefix[i] = XOR;  
      
    # Create groups for odd indexes and  
    # even indexes  
    oddGroup = dict.fromkeys(prefix, 0)  
    evenGroup = dict.fromkeys(prefix, 0) 
  
    # Initialize occurrence of 0 in oddGroup  
    # as 1 because it will be used in case   
    # our subarray has l = 0  
    oddGroup[0] = 1;  
  
    for i in range(n) : 
  
        if (i & 1) : 
  
            # Check the frequency of current  
            # prefix XOR in oddGroup and add  
            # it to the answer  
            ans += oddGroup[prefix[i]];  
  
            # Update the frequnecy  
            oddGroup[prefix[i]] += 1;  
          
        else :  
  
            # Check the frequency of current  
            # prefix XOR in evenGroup and add  
            # it to the answer  
            ans += evenGroup[prefix[i]];  
  
            # Update the frequnecy  
            evenGroup[prefix[i]] += 1;  
  
    return ans;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    N = 6;  
  
    arr = [ 3, 2, 2, 3, 7, 6 ];  
  
    print(findSubarrCnt(arr, N));  
  
# This code is contributed by Ryuga 

