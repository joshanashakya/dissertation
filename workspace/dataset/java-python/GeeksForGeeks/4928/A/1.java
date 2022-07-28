

// Java implementation of the 
// above approach 
class GFG 
{ 
  
    // Function to string into grid form 
    static void gridStr(String str) 
    { 
        int l = str.length(); 
        int k = 0, row, column; 
        row = (int) Math.floor(Math.sqrt(l)); 
        column = (int) Math.ceil(Math.sqrt(l)); 
  
        if (row * column < l) 
        { 
            row = column; 
        } 
  
        char s[][] = new char[row][column]; 
          
        // convert the string into grid 
        for (int i = 0; i < row; i++)  
        { 
            for (int j = 0; j < column; j++)  
            { 
                if(k < str.length()) 
                    s[i][j] = str.charAt(k); 
                k++; 
            } 
        } 
  
        // Printing the grid 
        for (int i = 0; i < row; i++)  
        { 
            for (int j = 0; j < column; j++) 
            { 
                if (s[i][j] == 0)  
                { 
                    break; 
                } 
                System.out.print(s[i][j]); 
            } 
            System.out.println(""); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "GEEKSFORGEEKS"; 
        gridStr(str); 
    } 
} 
  
//This code is contributed by Rajput-Ji 

