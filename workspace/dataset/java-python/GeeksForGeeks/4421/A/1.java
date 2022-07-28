

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate the number of 
// square areas of size K*K 
static int subgrids(int N, int Z, int row[], 
                    int col[], int r, int d) 
{ 
    // Row array and column array to 
    // store the lengths of differences 
    // between consecutive rows/columns 
    Vector<Integer> conrow = new Vector<Integer>(); 
    Vector<Integer> concol = new Vector<Integer>(); 
  
    int K = (int) Math.sqrt(Z); 
  
    // Fill the conrow vector 
    conrow.add(row[0] - 0 - 1); 
    conrow.add(N + 1 - row[r - 1] - 1); 
    for (int i = 1; i < r; i++) 
    { 
        conrow.add(row[i] - row[i - 1] - 1); 
    } 
  
    // Fill the concol vector 
    concol.add(col[0] - 0 - 1); 
    concol.add(N + 1 - col[d - 1] - 1); 
    for (int i = 1; i < d; i++) 
    { 
        concol.add(col[i] - col[i - 1] - 1); 
    } 
  
    int row_size = conrow.size(); 
    int col_size = concol.size(); 
  
    // To store the required answer 
    int answer = 0; 
  
    // Every pair of row size and column size 
    // would result in an unblocked region 
    for (int i = 0; i < row_size; i++) 
    { 
        for (int j = 0; j < col_size; j++) 
        { 
            int total = (concol.get(j) / K) *  
                        (conrow.get(i) / K); 
            answer += (total); 
        } 
    } 
    return answer; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 8, Z = 4; 
    int row[] = { 4, 6 }; 
    int col[] = { 3, 8 }; 
    int r = row.length; 
    int d = col.length; 
  
    System.out.print(subgrids(N, Z, row, col, r, d)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

