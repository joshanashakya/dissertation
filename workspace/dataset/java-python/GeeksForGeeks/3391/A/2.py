

# Python3 implementation of the approach  
  
# Function to return the minimum  
# deletions required  
def MinDeletion(a, n) : 
  
    # To store the frequency of  
    # the array elements  
    map = dict.fromkeys(a, 0);  
  
    # Store frequency of each element  
    for i in range(n) :  
        map[a[i]] += 1;  
  
    # To store the minimum deletions required  
    ans = 0;  
  
    for key,value in map.items() : 
  
        # Value  
        x = key;  
  
        # It's frequency  
        frequency = value;  
  
        # If number less than or equal  
        # to it's frequency  
        if (x <= frequency) : 
  
            # Delete extra occurrences  
            ans += (frequency - x);  
  
        # Delete every occurrence of x  
        else : 
            ans += frequency;  
  
    return ans;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 2, 3, 2, 3, 4, 4, 4, 4, 5 ]; 
    n = len(a);  
  
    print(MinDeletion(a, n));  
  
# This code is contributed by AnkitRai01 

