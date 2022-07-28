

# Python 3 code to find the lexicographically 
# smallest string 
  
def lexSmallest(a, n): 
  
    # Sort strings using above compare() 
    a.sort(reverse = True) 
  
    # Concatenating sorted strings 
    answer = "" 
    for i in range( n): 
        answer += a[i] 
  
    return answer 
  
# Driver code 
if __name__ == "__main__": 
      
    a = [ "c", "cb", "cba" ] 
    n = len(a) 
    print(lexSmallest(a, n)) 
  
# This code is contributed by ita_c 

