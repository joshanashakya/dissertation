

# Python proagram to find sum 
# of remaining sticks 
  
# Function to calculate  
# sum of remaining sticks 
# after each iteration 
def sum(ar, n): 
  mp = dict() 
  
  for i in ar: 
    if i in mp: 
      mp[i]+= 1
    else: 
      mp[i] = 1
    
  mp = sorted(list(mp.items())) 
    
  sum = 0
    
  for pair in mp: 
    n-= pair[1] 
    sum+= n 
  
  return sum
# Driver code 
def main(): 
  n = 6
  ar = [5, 4, 4, 2, 2, 8] 
  ans = sum(ar, n) 
  print(ans) 
  
  
main() 

