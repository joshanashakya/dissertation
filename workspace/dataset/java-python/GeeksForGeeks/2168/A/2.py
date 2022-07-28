

# Python3 implementation of the approach  
  
# Function to find the valid permutation  
def getPermutation(a, n) :  
  
    # Find the array from the cumulative sum  
    ans = [0] * n;  
    ans[0] = a[0];  
    for i in range(1, n) :  
        ans[i] = a[i] - a[i - 1];  
  
    # To mark the occurrence of an element  
    present = [0] * (n + 1);  
      
    for i in range(n) : 
  
        # If current element has already  
        # been seen previously  
        if (present[ans[i]]) : 
            print("-1", end = "");  
            return;  
  
        # Mark the current element's occurrence  
        else : 
            present[ans[i]] = True;  
  
    # Print the required permutation  
    for i in range(n) : 
        print(ans[i], end = " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 2, 3, 6 ];  
    n = len(a);  
  
    getPermutation(a, n);  
      
# This code is contributed by AnkitRai01 

