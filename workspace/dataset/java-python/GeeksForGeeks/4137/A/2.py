

# Python3 implementation of the approach  
  
# Function to get no of set bits in binary  
# representation of positive integer n  
def countSetBits(n):  
    count = 0
    while (n):  
        count += n & 1
        n >>= 1
    return count  
      
# Function to return the count 
# of valid pairs  
def totalPairs(s1, s2) :  
      
    count = 0;  
  
    arr1 = [0] * 7; arr2 = [0] * 7;  
  
    # Store frequency of number  
    # of set bits for s1  
    for i in range(len(s1)) : 
        set_bits = countSetBits(ord(s1[i]))  
        arr1[set_bits] += 1;  
      
    # Store frequency of number of  
    # set bits for s2  
    for i in range(len(s2)) : 
        set_bits = countSetBits(ord(s2[i]));  
        arr2[set_bits] += 1;  
  
    # Calculate total pairs  
    for i in range(1, 7) :  
        count += (arr1[i] * arr2[i]);  
  
    # Return the count of valid pairs  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    s1 = "geeks";  
    s2 = "forgeeks";  
    print(totalPairs(s1, s2));  
  
# This code is contributed by Ryuga 

