

// Java implementation of the above approach  
class GfG 
{ 
  
    // Function to find the bitwise AND of  
    // all the binary strings  
    static String strBitwiseAND(String[] arr, int n)  
    {  
        String res = "";  
      
        // To store the largest and the smallest  
        // string's size, We need this to add  
        // '0's in the resultant string  
        int smallest_size = Integer.MAX_VALUE;  
        int largest_size = Integer.MIN_VALUE;  
      
        // Reverse each string  
        // Since we need to perform AND operation  
        // on bits from Right to Left  
        for (int i = 0; i < n; i++) 
        {  
              
            StringBuilder temp = new StringBuilder(); 
            temp.append(arr[i]); 
            arr[i] = temp.reverse().toString(); 
      
            // Update the respective length values  
            smallest_size = Math.min(smallest_size, arr[i].length());  
            largest_size = Math.max(largest_size, arr[i].length());  
        }  
      
        // Traverse bits from 0 to smallest string's size  
        for (int i = 0; i < smallest_size; i++)  
        {  
            boolean all_ones = true;  
      
            for (int j = 0; j < n; j++)  
            {  
      
                // If at this bit position, there is a 0  
                // in any of the given strings then AND  
                // operation on current bit position  
                // will be 0  
                if (arr[j].charAt(i) == '0')  
                {  
      
                    all_ones = false;  
                    break;  
                }  
            }  
      
            // Add resultant bit to result  
            res += (all_ones ? '1' : '0');  
        }  
      
        // Add 0's to the string.  
        for (int i = 0; i < largest_size - smallest_size; i++)  
            res += '0';  
      
        // Reverse the string  
        // Since we started from LEFT to RIGHT  
        StringBuilder temp = new StringBuilder(); 
        temp.append(res); 
        res = temp.reverse().toString(); 
      
        // Return the resultant string  
        return res;  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        String arr[] = { "101", "110110", "111" };  
        int n = arr.length;  
      
        System.out.println(strBitwiseAND(arr, n)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

