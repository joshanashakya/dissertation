

# Python 3 implementation of  
# above approach 
  
# Function to find the number 
# of partitions of N 
def partitions(n): 
  
    p = [0] * (n + 1) 
  
    # Base case 
    p[0] = 1
  
    for i in range(1, n + 1): 
        k = 1
        while ((k * (3 * k - 1)) / 2 <= i) : 
            p[i] += ((1 if k % 2 else -1) * 
                    p[i - (k * (3 * k - 1)) // 2]) 
  
            if (k > 0): 
                k *= -1
            else: 
                k = 1 - k 
  
    return p[n] 
  
# Driver code 
if __name__ == "__main__": 
    N = 20
    print(partitions(N)) 
  
# This code is contributed  
# by ChitraNayal 

