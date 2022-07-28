

# Python3 implementation to find the 
# minimum of the maximum difference 
# of the adjacent elements after  
# removing K elements from the array 
import sys 
  
INT_MAX = sys.maxsize; 
INT_MIN = -(sys.maxsize - 1) 
  
# Function to find the minimum  
# of the maximum difference of the 
# adjacent elements after removing 
# K elements from the array 
def minimumAdjacentDifference(a, n, k) : 
  
    # Intialising the  
    # minimum difference 
    minDiff = INT_MAX; 
  
    # Traversing over subsets  
    # in iterative manner 
    for i in range( 1<<n) :  
          
        # Number of elements to  
        # be taken in the subset 
        # ON bits of i represent  
        # elements not to be removed 
        cnt = bin(i).count('1'); 
  
        # If the removed  
        # set is of size k 
        if (cnt == n - k) : 
              
            # Creating the new array 
            # after removing elements 
            temp = []; 
            for j in range(n) : 
                if ((i & (1 << j)) != 0) : 
                    temp.append(a[j]); 
              
            # Maximum difference of adjacent 
            # elements of remaining array 
            maxDiff = INT_MIN; 
              
            for j in range(len(temp) - 1) : 
                maxDiff = max(maxDiff, temp[j + 1] - temp[j]); 
            
            minDiff = min(minDiff, maxDiff); 
       
    return minDiff; 
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 5; 
    k = 2; 
  
    a = [ 3, 7, 8, 10, 14 ]; 
  
    print(minimumAdjacentDifference(a, n, k)); 
    
# This code is contributed by AnkitRai01 

