

# Python 3 implementation of the approach 
  
# Function to return the minimum cost to make  
# the configuration of both the strings same 
def findCost(s1, s2, a, b, c, d, n): 
    cost = 0
  
    # Iterate and find the cost 
    for i in range(n): 
        if (s1[i] == s2[i]): 
            continue
        else: 
              
            # Find the minimum cost 
            if ((s1[i] == '1' and s2[i] == '2') or 
                (s2[i] == '1' and s1[i] == '2')): 
                cost += min(d, min(a, b + c)) 
            elif ((s1[i] == '2' and s2[i] == '3') or
                  (s2[i] == '2' and s1[i] == '3')): 
                cost += min(d, min(b, a + c)) 
            elif ((s1[i] == '1' and s2[i] == '3') or
                  (s2[i] == '1' and s1[i] == '3')): 
                cost += min(d, min(c, a + b)) 
    return cost 
  
# Driver Code 
if __name__ == '__main__': 
    s1 = "121"
    s2 = "223"
    a = 2
    b = 3
    c = 4
    d = 10
    n = len(s1) 
    print(findCost(s1, s2, a, b, c, d, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

