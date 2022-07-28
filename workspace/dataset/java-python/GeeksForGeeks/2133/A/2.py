

# Python3 program to print all factors combination 
  
# current_factor is current factor to be considered.  
# current_product is current product of factors.      
def factorsListFunc (first, each_prod, n, single_result_list):  
      
    # base case of this recursive function  
    if (first> n or each_prod > n): 
        return
  
    # When current_product is equal to n,  
    # then current contain list of factors 
    # so it will be added to the vect 
    if (each_prod == n) : 
        print(*single_result_list) 
        return
              
    # In this loop we first calculate factors  
    # of n and then it's combination so that  
    # we get the value n in a recursive way .  
    for i in range(first, n):  
        if (i * each_prod > n):  
            break
  
        # if i divides n properly, then it  
        # is factor of n  
        if (n % i == 0): 
              
            # it is added to 'single_result_list' list  
            single_result_list.append(i) 
              
            # Here function is called recursively  
            # and when (i*each_prod) is equal to n  
            # we will store the 'single_result_list' (it is  
            # basically the list containing all  
            # combination of factors) into result_list.  
            factorsListFunc(i, i * each_prod, n,  
                             single_result_list)  
              
            # here we will empty the 'single_result_list'  
            # List so that new combination of factors  
            # get stored in it.  
            single_result_list.remove(single_result_list[-1]) 
  
# Returns a list containing all ways  
# to factorize a number n.          
def factComb(n):  
      
    # making list of lists to store all  
    # possible combinations of factors  
    single_result_list = [] 
      
    # function to calculate all the combinations  
    # of factors  
    factorsListFunc(2, 1, n,single_result_list) 
                      
# Driver Code 
n = 16
  
# calling function for computing 
# vector of vector  
factComb(n) 
  
# This code is contributed by  
# Atul kumar Shrivastava  

