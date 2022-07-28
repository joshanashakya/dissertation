

# Python3 implementation of the approach  
  
# Function to find the required subsequence  
def findSubSeq(arr, n) : 
  
    # Sort the array  
    arr.sort();  
  
    # Keep a count of the length of the  
    # subsequence and the previous element  
    # Set the initial values  
    count = [1] * n;  
    prev = [-1] * n;  
  
    # Maximum length of the subsequence and  
    # the last element  
    max = 0;  
    maxprev = -1;  
  
    # Run a loop for every element  
    for i in range(n) : 
  
        # Check for all the divisors  
        for j in range(i - 1, -1, -1) : 
  
            # If the element is a divisor and the length  
            # of subsequnce will increase by adding  
            # j as previous element of i  
            if (arr[i] % arr[j] == 0 and 
                count[j] + 1 > count[i]) : 
  
                # Increase the count  
                count[i] = count[j] + 1;  
                prev[i] = j;  
  
        # Update the max count  
        if (max < count[i]) : 
            max = count[i];  
            maxprev = i;  
              
    # Get the last index of the subsequence  
    i = maxprev;  
    while (i >= 0) : 
  
        # Print the element  
        if (arr[i] != -1) : 
            print(arr[i], end = " ");  
  
        # Move the index to the previous element  
        i = prev[i];  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4, 5 ];  
    n = len(arr);  
  
    findSubSeq(arr, n);  
      
# This code is contributed by AnkitRai01 

