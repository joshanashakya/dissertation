

# Python3 program to find the location of  
# an str in an array of strings which is sorted  
# and has empty strings between strings.  
  
# Compare two string equals are not  
def compareStrings(str1, str2):  
   
    i = 0 
    while i < len(str1) - 1 and str1[i] == str2[i]:  
        i += 1 
    if str1[i] > str2[i]:  
        return -1 
  
    return str1[i] < str2[i] 
   
# Main function to find string location  
def searchStr(arr, string, first, last):  
   
    if first > last: 
        return -1 
  
    # Move mid to the middle  
    mid = (last + first) // 2 
  
    # If mid is empty , find closet non-empty string  
    if len(arr[mid]) == 0:  
       
        # If mid is empty, search in both sides of mid  
        # and find the closest non-empty string, and  
        # set mid accordingly.  
        left, right = mid - 1, mid + 1 
        while True:  
           
            if left < first and right > last:  
                return -1
                  
            if right <= last and len(arr[right]) != 0:  
                mid = right  
                break 
               
            if left >= first and len(arr[left]) != 0:  
                mid = left  
                break 
               
            right += 1 
            left -= 1
  
    # If str is found at mid  
    if compareStrings(string, arr[mid]) == 0:  
        return mid  
  
    # If str is greater than mid  
    if compareStrings(string, arr[mid]) < 0:  
        return searchStr(arr, string, mid+1, last)  
  
    # If str is smaller than mid  
    return searchStr(arr, string, first, mid-1)  
   
# Driver Code  
if __name__ == "__main__":  
   
    # Input arr of Strings.  
    arr = ["for", "", "", "", "geeks", "ide", "",  
                    "practice", "" , "", "quiz", "", ""]  
  
    # input Search String  
    string = "quiz" 
    n = len(arr)  
  
    print(searchStr(arr, string, 0, n-1))  
      
# This code is contributed by Rituraj Jain 

