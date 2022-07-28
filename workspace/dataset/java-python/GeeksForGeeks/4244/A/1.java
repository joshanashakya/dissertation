

// Java program to find count of rotations  
// with odd value. 
  
class solution 
{ 
static int oddEquivalent(String s, int n) 
{ 
  
int count = 0;  
// function to calculate total odd decimal  
// equivalent  
for (int i = 0; i < n; i++)  
    {  
        if(s.charAt(i) == '1')  
            count++;  
    }  
    return count; 
} 
  
// Driver code 
public static void main(String ar[]) 
{ 
  
String s = "1011011";  
int n = s.length();  
System.out.println(oddEquivalent(s, n));  
  
} 
} 
//This code is contributed  
//By Surendra_Gangwar 

