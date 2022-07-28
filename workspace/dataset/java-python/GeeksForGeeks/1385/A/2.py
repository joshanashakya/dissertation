

# Python 3 implementation of the approach 
  
# Global array declaration 
#global max_Element 
max_Element = 100005
  
sum1 = [0 for i in range(max_Element)] 
sum2 = [0 for i in range(max_Element)] 
sum3 = [0 for i in range(max_Element)] 
  
# Function to find the sum of multiplication of 
# every triplet in the divisors of a number 
def precomputation(arr, n): 
      
    # global max_Element 
    # sum1[x] represents the sum of 
    # all the divisors of x 
    for i in range(1, max_Element, 1): 
        for j in range(i, max_Element, i): 
              
            # Adding i to sum1[j] because i 
            # is a divisor of j 
            sum1[j] += i 
  
    # sum2[x] represents the sum of  
    # all the divisors of x 
    for i in range(1, max_Element, 1): 
        for j in range(i, max_Element, i): 
              
            # Here i is divisor of j and sum1[j] - i 
            # represents sum of all divisors of 
            # j which do not include i so we add 
            # i * (sum1[j] - i) to sum2[j] 
            sum2[j] += (sum1[j] - i) * i 
  
    # In the above implementation we have considered 
    # every pair two times so we have to divide 
    # every sum2 array element by 2 
    for i in range(1, max_Element, 1): 
        sum2[i] = int(sum2[i] / 2) 
  
    # Here i is the divisor of j and we are trying to 
    # add the sum of multiplication of all triplets of 
    # divisors of j such that one of the divisors is i 
    for i in range(1, max_Element, 1): 
        for j in range(i, max_Element, i): 
            sum3[j] += i * (sum2[j] - i * 
                           (sum1[j] - i)) 
  
    # In the above implementation we have considered 
    # every triplet three times so we have to divide 
    # every sum3 array element by 3 
    for i in range(1, max_Element, 1): 
        sum3[i] = int(sum3[i] / 3) 
  
    # Print the results 
    for i in range(n): 
        print(sum3[arr[i]], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    arr = [9, 5, 6] 
    n = len(arr) 
  
    # Precomputing 
    precomputation(arr, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

