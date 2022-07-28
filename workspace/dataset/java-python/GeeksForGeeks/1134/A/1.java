

// Java program of above approach 
class GfG { 
  
// function to obtain the new time  
static void findTime(String T, int K)  
{  
  
    // convert the given time in minutes  
    int minutes = ((T.charAt(0) - '0')  
                    * 10
                + T.charAt(1) - '0')  
                    * 60
                + ((T.charAt(3) - '0')  
                        * 10
                    + T.charAt(4) - '0');  
  
    // Add K to current minutes  
    minutes += K;  
  
    // Obtain the new hour  
    // and new minutes from minutes  
    int hour = (minutes / 60) % 24;  
  
    int min = minutes % 60;  
  
    // Print the hour in appropriate format  
    if (hour < 10)  
    {  
        System.out.print("0" + hour + ":");  
    }  
    else 
    {  
        System.out.print(hour + ":");  
    }  
  
    // Print the minute in appropriate format  
    if (min < 10)  
    {  
        System.out.println("0" + min);  
    }  
    else 
    {  
        System.out.println(min);  
    }  
}  
  
// Driver code  
public static void main(String[] args)  
{  
  
    String T = "21:39";  
    int K = 43;  
    findTime(T, K);  
}  
} 
  
// This code is contributed by Prerna Saini 

