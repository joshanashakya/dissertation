

// Java Program to calculate speed  
// distance and time 
  
class GFG 
{ 
    // Function to calculate speed 
    static double cal_speed(double dist, double time) 
    { 
        System.out.print("\n Distance(km) : " + dist) ; 
        System.out.print("\n Time(hr) : " + time) ; 
                  
        return dist / time; 
    } 
      
    // Function to calculate distance traveled 
    static double cal_dis(double speed, double time) 
    { 
        System.out.print("\n Time(hr) : " + time) ; 
        System.out.print("\n Speed(km / hr) : " + speed) ; 
                  
        return speed * time; 
    } 
      
    // Function to calculate time taken 
    static double cal_time(double dist, double speed) 
    { 
        System.out.print("\n Distance(km) : "+ dist) ; 
        System.out.print("\n Speed(km / hr) : " + speed) ; 
                  
        return speed * dist ; 
    } 
      
    // Driver code  
    public static void main (String[] args) 
    { 
        // Calling function cal_speed() 
        System.out.println("\n The calculated Speed(km / hr) is : "+ 
                    cal_speed(45.9, 2.0 ));  
      
        // Calling function cal_dis() 
        System.out.println("\n The calculated Distance(km) : "+ 
                    cal_dis(62.9, 2.5));  
          
        // Calling function cal_time() 
        System.out.println("\n The calculated Time(hr) : "+ 
                cal_time(48.0, 4.5)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

