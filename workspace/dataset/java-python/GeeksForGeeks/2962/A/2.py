

# Python3 program to count ways to divide 
# a string in two parts a and b such that 
# b/pow(10, p) == a 
  
def calculate( N ): 
    length = len(N) 
    l = int((length) / 2) 
    count = 0
      
    for i in range(l + 1): 
          
        # substring representing int a 
        s = N[0: 0 + i] 
          
        # no of digits in a 
        l1 = len(s) 
          
        # consider only most significant 
        # l1 characters of remaining  
        # string for int b 
        t = N[i: l1 + i] 
          
        # if any of a or b contains  
        # leading 0s discard this  
        try: 
            if s[0] == '0' or t[0] == '0': 
                continue
        except: 
            continue
          
        # if both are equal 
        if s == t: 
            count+=1
    return count 
      
# driver code to test above function 
N = str("2202200") 
print(calculate(N)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

