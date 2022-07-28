

# Python 3 implementation 
# to find product of 
# digits of elements 
# at k-th level 
  
# Function to find 
# product of digits 
# of elements at 
# k-th level 
def productAtKthLevel(tree, k): 
  
    level = -1
          
        # Initialize result 
    product = 1 
    n = len(tree) 
  
    for i in range(0, n):  
  
        # increasing level number 
        if (tree[i] == '('): 
            level+=1
  
        # decreasing level number 
        elif (tree[i] == ')'): 
            level-=1
  
        else: 
            # check if current level is 
            # the desired level or not 
            if (level == k): 
                product *= (int(tree[i]) - int('0')) 
          
      
  
    # required product 
    return product 
  
  
# Driver program 
tree = "(0(5(6()())(4()(9()())))(7(1()())(3()())))"
k = 2
  
print(productAtKthLevel(tree, k)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

