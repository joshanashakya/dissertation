

// Java program to check if tower 
// of sight issue occurs or not 
class GFG{ 
  
static class pair 
{  
    int first, second;  
    public pair(int first, int second)   
    {  
        this.first = first;  
        this.second = second;  
    }     
} 
    
// Function to check if point p lies in 
// between the line joining p1 and p2 
static int checkIntersection(pair p1, 
                      pair p2, 
                      pair p) 
{ 
    int val; 
   
    // If parallel to X-axis 
    if (p1.second == p2.second 
        && p1.second == p.second) { 
   
        if (p.first <= Math.max(p1.first, p2.first) 
            && (p.first >= Math.min(p1.first, p2.first))) 
   
            // Point p lies between p1 and p2 
            return 1; 
    } 
   
    // If parallel to Y-axis 
    if (p1.first == p2.first 
        && p1.first == p.first) { 
   
        if (p.second <= Math.max(p1.second, p2.second) 
            && (p.second >= Math.min(p1.second, p2.second))) 
   
            // Point p lies between p1 and p2 
            return 1; 
    } 
   
    // If point p satisfies the equation 
    // of line joining p1 and p2 
    else { 
        val = (p.second - p1.second) 
                  * (p2.first - p1.first) 
              - (p.first - p1.first) 
                    * (p2.second - p1.second); 
   
        if (val == 0) 
            if ((p.first <= Math.max(p1.first, p2.first) 
                 && (p.first >= Math.min(p1.first, p2.first))) 
                && (p.second <= Math.max(p1.second, p2.second) 
                    && (p.second >= Math.min(p1.second, p2.second)))) 
                return 1; 
    } 
   
    return 0; 
} 
   
// Function to check if tower 
// of sight issue occurred 
static void towerOfSight(pair a, 
                  pair b, 
                  pair c, 
                  pair d) 
{ 
    int flag = 0; 
   
    if (checkIntersection(a, c, b) == 1) 
   
        // B lies between AC 
        flag = 1; 
   
    else if (checkIntersection(a, c, d) == 1) 
   
        // D lies between AC 
        flag = 1; 
   
    else if (checkIntersection(b, d, a) == 1) 
   
        // A lies between BD 
        flag = 1; 
   
    else if (checkIntersection(b, d, c) == 1) 
   
        // C lies between BD 
        flag = 1; 
   
    System.out.print(flag==1?"Yes\n":"No\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // Point A 
    pair a = new pair( 0, 0 ); 
   
    // Point B 
    pair b = new pair( 0, -2 ); 
   
    // Point C 
    pair c = new pair( 2, 0 ); 
   
    // Point D 
    pair d = new pair( 0, 2 ); 
   
    towerOfSight(a, b, c, d); 
   
} 
} 
  
// This code is contributed by Rajput-Ji 

