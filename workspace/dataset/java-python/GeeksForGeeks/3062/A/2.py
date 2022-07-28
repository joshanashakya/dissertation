

# Python3 implementation of the approach 
  
MAX = 25;  
  
# Function to return the minimized sum  
def getMinSum(arr, n) : 
    bits_count = [0]* MAX
    max_bit = 0; sum = 0; ans = 0;  
  
    # To store the frequency  
    # of bit in every element  
    for d in range(n) : 
        e = arr[d]; f = 0;  
        while (e > 0) : 
            rem = e % 2;  
            e = e // 2;  
            if (rem == 1) : 
                bits_count[f] += rem;  
                  
            f += 1 
              
        max_bit = max(max_bit, f);  
      
  
    # Finding element X  
    for d in range(max_bit) : 
        temp = pow(2, d);  
          
        if (bits_count[d] > n // 2) : 
            ans = ans + temp;  
  
  
    # Taking XOR of elements and finding sum  
    for d in range(n) :  
        arr[d] = arr[d] ^ ans;  
        sum = sum + arr[d];  
      
    return sum 
      
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 3, 5, 7, 11, 15 ];  
    n = len(arr);  
  
    print(getMinSum(arr, n)) 
  
# This code is contributed by Ryuga 

