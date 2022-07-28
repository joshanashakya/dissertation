

# Python3 implementation to remove 
# all the anagram strings 
  
# Function to remove the anagram string 
def removeAnagrams(arr, N): 
  
    # vector to store the final result 
    ans = [] 
  
    # data structure to keep a mark 
    # of the previously occured string 
    found = dict() 
  
    for i in range(N): 
  
        word = arr[i] 
  
        # Sort the characters 
        # of the current string 
        word = " ".join(sorted(word)) 
  
        # Check if current is not 
        # present inside the hashmap 
        # Then push it in the resultant vector 
        # and insert it in the hashmap 
        if (word not in found): 
  
            ans.append(arr[i]) 
            found[word] = 1
  
    # Sort the resultant vector of strings 
    ans = sorted(ans) 
  
    # Print the required array 
    for i in range(len(ans)): 
        print(ans[i], end=" ") 
  
# Driver code 
if __name__ == '__main__': 
    arr=["geeks", "keegs","code", "doce"] 
    N = 4
  
    removeAnagrams(arr, N) 
  
# This code is contributed by mohit kumar 29 

