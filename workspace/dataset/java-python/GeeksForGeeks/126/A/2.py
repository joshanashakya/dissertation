

# Python3 implementation to find the number  
# of subsets with equal bitwise AND,  
# OR and XOR values  
  
mod = 1000000007;  
  
# Function to find the number of  
# subsets with equal bitwise AND,  
# OR and XOR values  
def countSubsets(a, n) : 
  
    answer = 0;  
  
    # Traverse through all the subsets  
    for i in range(1 << n) : 
  
        bitwiseAND = -1;  
        bitwiseOR = 0;  
        bitwiseXOR = 0;  
  
        # Finding the subsets with the bits  
        # of 'i' which are set  
        for j in range(n) : 
  
            # Computing the bitwise AND  
            if (i & (1 << j)) : 
                if (bitwiseAND == -1) : 
                    bitwiseAND = a[j];  
                else : 
                    bitwiseAND &= a[j];  
  
                # Computing the bitwise OR  
                bitwiseOR |= a[j];  
  
                # Computing the bitwise XOR  
                bitwiseXOR ^= a[j];  
  
        # Comparing all the three values  
        if (bitwiseAND == bitwiseOR and bitwiseOR == bitwiseXOR) : 
            answer = (answer + 1) % mod;  
      
    return answer;  
  
# Driver code  
if __name__ == "__main__" :  
      
    N = 6;  
    A = [ 1, 3, 2, 1, 2, 1 ];  
  
    print(countSubsets(A, N));  
  
# This code is contributed by AnkitRai01 

