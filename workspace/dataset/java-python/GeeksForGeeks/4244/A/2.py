

# Python3 program to find count 
# of rotations with odd value 
  
#function to calculate total odd equivalent 
def oddEquivalent(s, n): 
    count=0
    for i in range(0,n): 
        if (s[i] == '1'): 
            count = count + 1
    return count 
      
#Driver code 
if __name__=='__main__': 
    s = "1011011"
    n = len(s) 
    print(oddEquivalent(s, n))  
  
# this code is contributed by Shashank_Sharma 

