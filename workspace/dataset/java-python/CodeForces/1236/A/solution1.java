import java.util.*; public class Main{       public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int t = scan.nextInt();		while(t>0){		    int a = scan.nextInt();		    int b = scan.nextInt();		    int c = scan.nextInt();		    t--;		    		    if(b==0){		        System.out.println(0);		    }		    else{		        if(b>=c/2){		            int count_two = c/2;		            int r_b = b-count_two;		            if(a>=r_b/2){		                 int count_one = r_b/2;		                 System.out.println(3*(count_one+count_two));		            }		            else{		                int count_one = a;		                System.out.println(3*(count_one+count_two));		            }		        }		        		        else{		            int count_two = b;		            int count_one = 0;		            System.out.println(3*(count_one+count_two));		        }		    }		    		}	}}
