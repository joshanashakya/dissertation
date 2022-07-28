

# Python3 implementation of the approach 
  
MOD= 1000000007
  
# Function to return the total 
# requried sub-sequences 
def solve(test): 
  
    size = len(test) 
    total = 0
  
    # Find ways for all values of x 
    for i in range(9): 
        x = i 
  
        # x+1 
        y = i + 1
        newtest="" 
  
        # Removing all unnecessary digits 
        for j in range(size): 
            if (ord(test[j]) == x + 48 or ord(test[j]) == y + 48): 
                newtest += test[j] 
  
  
        if (len(newtest) > 0): 
            size1 = len(newtest) 
  
            # Prefix Sum Array for X+1 digit 
            prefix=[0 for i in range(size1)] 
  
            for j in range(size1): 
                if (ord(newtest[j]) == y + 48): 
                    prefix[j]+=1
  
            for j in range(1,size1): 
                prefix[j] += prefix[j - 1] 
  
            count = 0
            firstcount = 0
  
            # Sum of squares 
            ss = 0
  
            # Previous sum of all possible pairs 
            prev = 0
  
            for j in range(size1): 
                if (ord(newtest[j]) == x + 48): 
                    count+=1
                    firstcount+=1
  
                else: 
  
                    ss += count * count 
  
                    # To find sum of multiplication of all 
                    # possible pairs 
                    pairsum = (firstcount * firstcount - ss) // 2
                    temp = pairsum 
  
                    # To prevent overcounting 
                    pairsum -= prev 
                    prev = temp 
  
                    secondway = prefix[size1 - 1] 
                    if (j != 0): 
                        secondway -= prefix[j - 1] 
  
                    answer = count * (count - 1)* secondway * (secondway - 1) 
                    answer //= 4
                    answer += (pairsum * secondway * (secondway - 1)) // 2
  
                    # Adding ways for all possible x 
                    total += answer 
                    count = 0
  
    return total 
  
# Driver code 
test = "13134422"
print(solve(test)) 
  
# This code is contributed by mohit kumar 29 

