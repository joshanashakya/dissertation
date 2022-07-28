

# Python program to count  
# triplets with sum that  
# lies in given range [a, b]. 
  
# Function to find count of  
# triplets having sum less 
# than or equal to val. 
def countTripletsLessThan(arr, n, val): 
  
    # sort the input array. 
    arr.sort() 
  
    # Initialize result 
    ans = 0
  
    j = 0; k = 0
  
    # to store sum 
    sum = 0
  
    # Fix the first element 
    for i in range(0,n-2): 
  
        # Initialize other two  
        # elements as corner  
        # elements of subarray  
        # arr[j+1..k] 
        j = i + 1
        k = n - 1
  
        # Use Meet in the  
        # Middle concept. 
        while j != k : 
            sum = arr[i] + arr[j] + arr[k] 
              
            # If sum of current triplet 
            # is greater, then to reduce it 
            # decrease k. 
            if sum > val: 
                k-=1
  
            # If sum is less than or  
            # equal to given value,  
            # then add possible  
            # triplets (k-j) to result. 
            else : 
                ans += (k - j) 
                j += 1
    return ans 
  
# Function to return 
# count of triplets having 
# sum in range [a, b]. 
def countTriplets(arr, n, a, b): 
      
    # to store count of triplets. 
    res = 0
  
    # Find count of triplets  
    # having sum less than or  
    # equal to b and subtract  
    # count of triplets having  
    # sum less than or equal to a-1. 
    res = (countTripletsLessThan(arr, n, b) -
        countTripletsLessThan(arr, n, a - 1)) 
  
    return res 
  
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 2, 7, 5, 3, 8, 4, 1, 9 ] 
    n = len(arr) 
    a = 8; b = 16
    print(countTriplets(arr, n, a, b)) 
      
# This code is contributed by  
# Harshit Saini 

