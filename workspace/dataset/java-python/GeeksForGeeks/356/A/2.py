

# Python3 program to remove minimum elements to  
# make the given array good  
  
# Function to remove minimum elements to  
# make the given array good  
def MinRemove(a, n, k) :  
  
    # To store count of each subsequence  
    cnt = [0] * k  
  
    for i in range(n) : 
        # Increase the count of subsequence [0]  
        if (a[i] == 0) : 
            cnt[0] += 1;  
  
        # If Previous element subsequence count  
        # is greater than zero then increment  
        # subsequence count of current element  
        # and increment subsequence count of  
        # the previous element.  
        elif (cnt[a[i] - 1] > 0) : 
            cnt[a[i] - 1] -= 1;  
            cnt[a[i]] += 1;  
  
    # Return the required answer  
    return n - (k * cnt[k - 1]);  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 0, 1, 2, 3, 4, 0,  
                1, 0, 1, 2, 3, 4 ]  
    k = 5;  
  
    n = len(a);  
  
    # Function call  
    print(MinRemove(a, n, k));  
      
# This code is contributed by AnkitRai01 

