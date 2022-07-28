

# Python3 program for  
# the above approach  
  
# Function to calculate  
# min swaps to make  
# binary strings equal  
def minSwaps(s1, s2) :  
  
    c0 = 0; c1 = 0;  
  
    for i in range(len(s1)) : 
          
        # Count of zero's  
        if (s1[i] == '0' and s2[i] == '1') : 
            c0 += 1;  
      
        # Count of one's  
        elif (s1[i] == '1' and s2[i] == '0') : 
            c1 += 1;  
  
    # As discussed above  
    ans = c0 // 2 + c1 // 2;  
  
    if (c0 % 2 == 0 and c1 % 2 == 0) : 
        return ans;  
      
    elif ((c0 + c1) % 2 == 0) : 
        return ans + 2;  
  
    else : 
        return -1;  
  
# Driver code  
if __name__ == "__main__" :  
  
    s1 = "0011"; s2 = "1111";  
      
    ans = minSwaps(s1, s2);  
  
    print(ans);  
  
# This code is contributed by AnkitRai01 

