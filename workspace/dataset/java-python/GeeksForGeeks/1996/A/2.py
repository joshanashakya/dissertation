

# Pytho3 implementation of the above approach 
  
# function to count odd sum pair 
def count_odd_pair( n,  a): 
  
    odd = 0 
    even = 0 
  
    for i in range(0,n):  
  
        # if number is even 
        if ( a[ i] % 2 == 0): 
             even=even+1
  
        # if number is odd 
        else: 
             odd=odd+1
      
  
    # count of ordered pairs 
    ans =  odd *  even * 2 
  
    return  ans  
  
  
# function to count even sum pair 
def count_even_pair( odd_sum_pairs,  n): 
  
    total_pairs = ( n * ( n - 1))  
    ans =  total_pairs -  odd_sum_pairs  
    return ans  
  
  
# Driver code 
  
n = 6 
a = [2, 4, 5, 9, 1, 8]  
  
odd_sum_pairs = count_odd_pair( n,  a)  
  
even_sum_pairs = count_even_pair( odd_sum_pairs,  n)  
  
print("Even Sum Pairs =", even_sum_pairs) 
print("Odd Sum Pairs=", odd_sum_pairs) 
      
# This code is contributed by ihritik 

