

# Python3 implementation of  
# above approach 
  
# function to count odd product pair 
def count_odd_pair(n, a): 
    odd = 0
    even = 0
    for i in range(0,n): 
          
        # if number is even 
        if a[i] % 2==0: 
            even=even+1
        # if number is odd 
        else: 
            odd=odd+1
      
    # count of ordered pairs 
    ans = odd * (odd - 1) 
    return ans 
  
# function to count even product pair 
def count_even_pair(odd_product_pairs, n): 
    total_pairs = (n * (n - 1)) 
    ans = total_pairs - odd_product_pairs 
    return ans 
  
#Driver code 
if __name__=='__main__': 
    n = 6
    a = [2, 4, 5, 9, 1 ,8] 
  
    odd_product_pairs = count_odd_pair(n, a) 
    even_product_pairs = (count_even_pair 
                       (odd_product_pairs, n)) 
  
    print("Even Product Pairs = "
          ,even_product_pairs) 
    print("Odd Product Pairs= "
          ,odd_product_pairs) 
  
# This code is contributed by  
# Shashank_Sharma 

