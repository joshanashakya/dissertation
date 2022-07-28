

// Java program to get right angle triangle, given  
// hypotenuse and area of triangle 
public class GFG { 
  
// limit for float comparison  
    final static double eps = (double) 1e-6; 
  
// Utility method to get area of right angle triangle,  
// given base and hypotenuse  
    static double getArea(double base, double hypotenuse) { 
        double height = Math.sqrt(hypotenuse * hypotenuse - base * base); 
        return 0.5 * base * height; 
    } 
  
// Prints base and height of triangle using hypotenuse  
// and area information  
    static void printRightAngleTriangle(int hypotenuse, int area) { 
        int hsquare = hypotenuse * hypotenuse; 
  
        // maximum area will be obtained when base and height  
        // are equal (= sqrt(h*h/2))  
        double sideForMaxArea = Math.sqrt(hsquare / 2.0); 
        double maxArea = getArea(sideForMaxArea, hypotenuse); 
  
        // if given area itself is larger than maxArea then no  
        // solution is possible  
        if (area > maxArea) { 
            System.out.print("Not possible"); 
            return; 
        } 
  
        double low = 0.0; 
        double high = sideForMaxArea; 
        double base = 0; 
  
        // binary search for base  
        while (Math.abs(high - low) > eps) { 
            base = (low + high) / 2.0; 
            if (getArea(base, hypotenuse) >= area) { 
                high = base; 
            } else { 
                low = base; 
            } 
        } 
  
        // get height by pythagorean rule  
        double height = Math.sqrt(hsquare - base * base); 
        System.out.println(Math.round(base) + " " + Math.round(height)); 
    } 
  
// Driver code to test above methods  
    static public void main(String[] args) { 
        int hypotenuse = 5; 
        int area = 6; 
  
        printRightAngleTriangle(hypotenuse, area); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

