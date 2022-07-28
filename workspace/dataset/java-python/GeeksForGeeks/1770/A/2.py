

# Python 3 program to find the maximum  
# distance covered using n bikes 
  
# Returns maximum distance that can be  
# traveled by n bikes and given fuel 
# in every bike 
def maxDistance(n, fuel): 
      
    # dist_covered is the result  
    # of this function 
    dist_covered = 0
  
    while (n > 0): 
          
        # after ever fuel/n km we are  
        # discarding one bike and filling  
        # all the other bikes with fuel/n  
        # liters of fuel i.e. to their 
        # maximum limit (100 litre) 
        dist_covered = dist_covered + (fuel / n) 
          
        # reduce number of bikes 
        n = n - 1
  
    return dist_covered 
  
# Driver Code 
if __name__ =='__main__': 
    n = 3
      
    # number of bikes 
    fuel = 100
    print("Maximum distance possible with",  
       n, "bikes is", maxDistance(n, fuel)) 
  
# This code is contributed by 
# Surendra_Gangwar 

