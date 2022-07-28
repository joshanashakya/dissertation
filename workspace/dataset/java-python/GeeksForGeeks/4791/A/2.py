

# Python3 implementation of the approach 
kN = 1000000; 
  
# Function to return the maximum 
# number of people that can be killed 
def maxPeople(p): 
  
    # Storing the sum beforehand so that 
    # it can be used in each query 
    sums = [0] * kN; 
    sums[0] = 0; 
    for i in range(1, kN): 
        sums[i] = (i * i) + sums[i - 1]; 
  
    # lower_bound returns an iterator  
    # pointing to the first element  
    # greater than or equal to your val 
    it = lower_bound(sums, 0, kN, p); 
    if (it > p): 
  
        # Previous value 
        it -= 1; 
  
    # Returns the index in array upto which 
    # killing is possible with strength P 
    return it; 
  
def lower_bound(a, low, high, element): 
    while(low < high): 
        middle = int(low + (high - low) / 2); 
        if(element > a[middle]): 
            low = middle + 1; 
        else: 
            high = middle; 
    return low; 
  
# Driver code 
if __name__ == '__main__': 
    p = 14; 
    print(maxPeople(p)); 
  
# This code contributed by Rajput-Ji 

