

# Python3 implementation of the approach  
  
# Function to find the count of equal  
# elements to the right - count of equal  
# elements to the left for each of the element  
def right_left(a, n) :  
  
    # Maps to store the frequency and same  
    # elements to the left of an element  
    total = dict.fromkeys(a, 0); 
    left = dict.fromkeys(a, 0);  
  
    # Count the frequency of each element  
    for i in range(n) : 
        if a[i] not in total : 
            total[a[i]] = 1
        total[a[i]] += 1;  
  
    for i in range(n) : 
  
        # Print the answer for each element  
        print(total[a[i]] - 1 - (2 * left[a[i]]), 
                                      end = " ");  
  
        # Increment it's left frequency  
        left[a[i]] += 1;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, 2, 3, 2, 1 ];  
    n = len(a);  
  
    right_left(a, n);  
  
# This code is contributed by AnkitRai01 

