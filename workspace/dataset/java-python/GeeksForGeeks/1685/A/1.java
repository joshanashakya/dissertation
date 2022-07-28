

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
static class pair 
{ 
    int first,second; 
  
    public pair(int first, int second)  
    { 
        this.first = first; 
        this.second = second; 
    } 
      
} 
  
// Function to return the count of possible triplets 
static int countTriplets(int n, Vector<pair> points) 
{ 
    Set<pair> pts = new HashSet<pair>(); 
    int ct = 0; 
  
    // Insert all the points in a set 
    for (int i = 0; i < n; i++) 
        pts.add(points.get(i)); 
  
    for (int i = 0; i < n; i++) 
        for (int j = i + 1; j < n; j++)  
        { 
            int x = points.get(i).first + points.get(j).first; 
            int y = points.get(i).second + points.get(j).second; 
  
            // If the mid point exists in the set 
            if (x % 2 == 0 && y % 2 == 0) 
                if (!pts.contains(new pair(x / 2, y / 2))) 
                    ct++; 
        } 
  
    // Return the count of valid triplets 
    return ct; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    Vector<pair> points = new Vector<>(); 
    points.add(new pair(1,1)); 
    points.add(new pair(2,2)); 
    points.add(new pair(3,3)); 
    int n = points.size(); 
    System.out.println(countTriplets(n, points)); 
} 
} 
  
// This code is contributed by Princi Singh 

