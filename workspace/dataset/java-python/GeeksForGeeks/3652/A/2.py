

# Python3 program to count ways to choose 
# triplets such that the distance  
# between the farthest points <= L  
  
# Returns the number of triplets with  
# distance between farthest points <= L  
def countTripletsLessThanL(n, L, arr): 
      
    # sort to get ordered triplets so that  
    # we can find the distance between  
    # farthest points belonging to a triplet 
    arr.sort() 
  
    ways = 0
  
    # generate and check for all possible  
    # triplets: {arr[i], arr[j], arr[k]} 
    for i in range(n): 
        for j in range(i + 1, n): 
            for k in range(j + 1, n): 
  
                # Since the array is sorted the  
                # farthest points will be a[i]  
                # and a[k]; 
                mostDistantDistance = arr[k] - arr[i] 
                if (mostDistantDistance <= L): 
                    ways += 1
  
    return ways 
  
# Driver Code 
if __name__ == "__main__": 
  
    # set of n points on the X axis 
    arr = [1, 2, 3, 4 ] 
  
    n = len(arr) 
    L = 3
    ans = countTripletsLessThanL(n, L, arr) 
    print ("Total Number of ways =", ans) 
  
# This code is contributed by ita_c 

