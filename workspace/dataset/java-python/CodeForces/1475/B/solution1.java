import java.io.*;import java.util.*;   public class newyear {	public static void main (String [] args) throws IOException{		 BufferedReader f = new BufferedReader(new InputStreamReader(System.in));	     PrintWriter out = new PrintWriter(System.out);	      StringTokenizer st = new StringTokenizer(f.readLine());	      int t = Integer.parseInt(st.nextToken());	      for (int i = 0; i < t; i++) {	    	  st = new StringTokenizer(f.readLine());		      int a = Integer.parseInt(st.nextToken());		      int k = divides(a);		      int ans = (a - k)/2020 - k;	    	  if (ans >= 0) {	    		  out.println("YES");	    	  }else {	    		  out.println("NO");	    	  }	      }	      out.close();	      }    public static int divides (int num) {    	return num % 2020;}} 	/*import kotlin.math.max fun main(){    var t:Int = readLine()!!.toInt()    for (i in 1..t){        var a:Int = readLine()!!.toInt()        if (divides (a) == 1){            println("YES")        } else {            println("NO")        }    }  }fun divides (num:Int):Int {    if (num > 4078379){        return 1    } else if (num == 0){        return 1    } else if (num < 2020){        return 0    } else {        return max(divides(num - 2020),divides(num - 2021));    }}  	*/
