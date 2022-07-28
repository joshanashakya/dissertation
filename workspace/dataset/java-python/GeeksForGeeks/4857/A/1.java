

// Java program to illustrate  
// the above problem  
class GFG 
{ 
  
// function to get the minimum length of  
// the shorter side of the triangle  
static void shortestLength(int n, int x[],  
                           int y[])  
{  
    int answer = 0;  
  
    // traversing through each  
    // points on the plane  
    int i = 0;  
    while (n != 0 && i < x.length) 
    {  
        // if sum of a points is greater 
        // than the previous one, the  
        // maximum gets replaced  
        if (x[i] + y[i] > answer)  
            answer = x[i] + y[i];  
  
        i++;  
    }  
  
    // print the length  
    System.out.println("Length -> " + answer );  
    System.out.println("Path -> " +  
                       "( 1, " + answer + " )" +  
                       "and ( " + answer + ", 1 )");  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    // initialize the number of points  
    int n = 4;  
  
    // points on the plane  
    int x[] = new int[] { 1, 4, 2, 1 };  
    int y[] = new int[] { 4, 1, 1, 2 };  
  
    shortestLength(n, x, y);  
}  
} 
  
// This code is contributed  
// by Prerna Saini 

