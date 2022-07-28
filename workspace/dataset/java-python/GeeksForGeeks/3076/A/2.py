

ans = 1
mod = 1000000007 * 120
  
for i in range(0, 5) : 
    ans = (ans * (55555 - i)) % mod  
      
ans = int(ans / 120) 
  
print("Answer using shortcut: ", ans) 
  
# This code is contributed by Smitha. 

