

// Java program to split array in groups of 3 
class GFG  
{ 
  
    // Function to print the groups after 
    // splitting array in groups of 3 
    static void printGroups(int n, int a[])  
    { 
        int ct[] = new int[7], grps = n / 3, i; 
  
        // Count occurrence of each element 
        for (i = 0; i < n; i++) 
        { 
            ct[a[i]]++; 
        } 
  
        // Check if it is possible to form the groups 
        if (ct[1] != grps || (ct[4] + ct[6]) != grps 
            || (ct[2] + ct[3]) != grps || ct[4] > ct[2])  
        { 
            System.out.print(-1); 
            return; 
        } 
  
        // Print groups that end at 4 
        for (i = 0; i < ct[4]; i++)  
        { 
            System.out.print("1 2 4\n"); 
        } 
  
        // Print groups that end at 6, with 2 
        // in the middle 
        for (i = 0; i < ct[2] - ct[4]; i++)  
        { 
            System.out.print("1 2 6\n"); 
        } 
          
        // Print groups that have a 3 in the middle 
        for (i = 0; i < ct[3]; i++) 
        { 
            System.out.print("1 3 6\n"); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n = 6; 
        int a[] = {2, 2, 1, 1, 4, 6}; 
  
        printGroups(n, a); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

