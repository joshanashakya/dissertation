

// Java program to find if a number is 
// divisible by 6 or not 
class IsDivisible 
{ 
    // Function to find that number divisible by 6 or not 
    static boolean check(String str) 
    { 
        int n = str.length(); 
       
        // Return false if number is not divisible by 2. 
        if ((str.charAt(n-1) -'0')%2 != 0) 
           return false; 
       
        // If we reach here, number is divisible by 2. 
        // Now check for 3. 
       
        // Compute sum of digits 
        int digitSum = 0; 
        for (int i=0; i<n; i++) 
            digitSum += (str.charAt(i)-'0'); 
       
        // Check if sum of digits is divisible by 3 
        return (digitSum % 3 == 0); 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        String str = "1332"; 
        if(check(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}  

