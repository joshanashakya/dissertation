

# Python3 program to find the maximum 
# number of elements divisible by 3 
  
# Function to find the maximum 
# number of elements divisible by 3 
def MaxNumbers(a, n): 
      
    # To store frequency of each number 
    fre = [0 for i in range(3)] 
  
    for i in range(n): 
          
        # Store modulo value 
        a[i] %= 3
  
        # Strore frequency 
        fre[a[i]] += 1
  
    # Add numbers with zero modulo to answer 
    ans = fre[0] 
  
    # Find minimum of elements with modulo 
    # frequency one and zero 
    k = min(fre[1], fre[2]) 
  
    # Add k to the answer 
    ans += k 
  
    # Remove them from frequency 
    fre[1] -= k 
    fre[2] -= k 
  
    # Add numbers possible with 
    # remaining frequency 
    ans += fre[1] // 3 + fre[2] // 3
  
    # Return the required answer 
    return ans 
  
# Driver code 
a = [1, 4, 10, 7, 11, 2, 8, 5, 9] 
  
n = len(a) 
  
# Function call 
print(MaxNumbers(a, n)) 
  
# This code is contributed by Mohit Kumar 

