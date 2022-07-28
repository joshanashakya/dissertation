

# Python3 Program for nth 
# Tribonacci word 
  
# Returns n-th Tribonacci word 
def tribWord(n): 
    Sn_1 = "1"
    Sn_2 = "12"
    Sn_3 = "1213"
    for i in range(3, n+1): 
        tmp = Sn_3 
        Sn_3 += (Sn_2 + Sn_1) 
        Sn_1 = Sn_2 
        Sn_2 = tmp 
  
    return Sn_3 
  
# Driver code 
n = 6
print(tribWord(n)) 
  
# This code is contributed By Anant Agarwal. 

