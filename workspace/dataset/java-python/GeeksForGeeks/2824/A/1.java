

// Java code to find the count of words  
// in a CamelCase sequence  
class solution 
{ 
  
// Function to find the count of words  
// in a CamelCase sequence  
static int countWords(String str)  
{  
    int count = 1;  
  
    for (int i = 1; i < str.length() - 1; i++) {  
        if (str.charAt(i)>=65&&str.charAt(i)<=90)  
            count++;  
    }  
  
    return count;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    String str = "geeksForGeeks";  
  
    System.out.print( countWords(str));  
  
}  
} 
//contributed by Arnab Kundu 

