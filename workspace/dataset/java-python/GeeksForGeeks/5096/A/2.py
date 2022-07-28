

# Python3 code to count pairs whose  
# sum is divisible by '4' 
  
# Function to count pairs whose  
# sum is divisible by '4' 
def count4Divisibiles( arr , n ): 
      
    # Create a frequency array to count  
    # occurrences of all remainders when  
    # divided by 4 
    freq = [0, 0, 0, 0] 
      
    # Count occurrences of all remainders 
    for i in range(n): 
        freq[arr[i] % 4]+=1
          
    #If both pairs are divisible by '4' 
    ans = freq[0] * (freq[0] - 1) / 2
      
    # If both pairs are 2 modulo 4 
    ans += freq[2] * (freq[2] - 1) / 2
      
    # If one of them is equal 
    # to 1 modulo 4 and the 
    # other is equal to 3  
    # modulo 4 
    ans += freq[1] * freq[3] 
      
    return int(ans) 
  
# Driver code 
arr = [2, 2, 1, 7, 5] 
n = len(arr) 
print(count4Divisibiles(arr, n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

