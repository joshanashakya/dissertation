

# Python 3 implementation of the approach 
  
# Function to return the minimum cost 
def minCost(str1, K): 
    n = len(str1) 
  
    # Initialize result 
    res = 999999999
    count = 0
  
    # To store the frequency of characters 
    # of the string 
    cnt = [0 for i in range(27)] 
  
    # Update the frequencies of the 
    # characters of the string 
    for i in range(n): 
        cnt[ord(str1[i]) - ord('a') + 1] += 1
  
    # Loop to check all windows from a-z 
    # where window size is K 
    for i in range(1, 26 - K + 1, 1): 
        # Starting index of window 
        a = i 
  
        # Ending index of window 
        b = i + K 
        count = 0
        for j in range(1, 27, 1): 
              
            # Check if the string contains character 
            if (cnt[j] > 0): 
                  
                # Check if the character is on left side of window 
                # find the cost of modification for character 
                # add value to count 
                # calculate nearest distance of modification 
                if (j >= a and j >= b): 
                    count = count + (min(j - b, 25 - 
                                         j + a + 1)) * cnt[j] 
  
                # Check if the character is on right side of window 
                # find the cost of modification for character 
                # add value to count 
                # calculate nearest distance of modification 
                elif (j <= a and j <= b): 
                    count = count + (min(a - j, 25 + 
                                             j - b + 1)) * cnt[j] 
  
        # Find the minimum of all costs 
        # for modifying the string 
        res = min(res, count) 
  
    # Loop to check all windows 
    # Here window contains characters 
    # before z and after z of window size K 
    for i in range(26 - K + 1, 27, 1): 
          
        # Starting index of window 
        a = i 
  
        # Ending index of window 
        b = (i + K) % 26
        count = 0
  
        for j in range(1, 27, 1): 
              
            # Check if the string contains character 
            if (cnt[j] > 0): 
                  
                # If characters are outside window 
                # find the cost for modifying character 
                # add value to count 
                if (j >= b and j <= a): 
                    count = count + (min(j - b,  
                                         a - j)) * cnt[j] 
  
        # Find the minimum of all costs 
        # for modifying the string 
        res = min(res, count) 
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    str1 = "abcdefghi"
    K = 2
    print(minCost(str1, K)) 
  
# This code is contributed by 
# Surendra_Gangwar 

