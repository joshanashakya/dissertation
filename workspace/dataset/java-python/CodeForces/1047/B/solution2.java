import java.util.*;  public class Practise {     //public static int[][] dp;     public static void main(String[] args) {        //top- down approch        //fibonacci         Scanner sc = new Scanner(System.in); //right most a[i]>=q;//        long[]  dp = new long[100001];//        for(int i=0;i<=100000;i++){//            dp[i]=-1;//        }//        int n = sc.nextInt();      //  int[][] points =new int[n][n];        int maxx=Integer.MIN_VALUE;        int maxy = Integer.MIN_VALUE;        for(int i =0;i<n;i++){            int a =sc.nextInt();            int b =sc.nextInt();            if(maxx<(a+b)){                maxx=a+b;            }        }   //     int ans =Math.max(maxx,maxy);        System.out.println(maxx);     }       private static int CountLeft(int x, int[] arr) {        int l=-1;        int r =arr.length;        while(r>l+1){            int mid=l+(r-l)/2;            if(arr[mid]<=x){                l=mid;             }else                r=mid;         }        return  l;    }     private static int CountRight(int x ,int[] arr) {        int l=-1;        int r=arr.length;        while(r>l+1){            int mid=(l)+(r-l)/2;            if(arr[mid]>=x){                r=mid;            }else                l=mid;        }        return r;      }     private static boolean check(String toString) {        Stack<Character>  st=new Stack<>();        for(int  i=0;i<toString.length();i++){            if(toString.charAt(i)=='('){                st.push(toString.charAt(i));            }else if(st.isEmpty()){                return false;            }else            {                st.pop();            }        }        return st.isEmpty();    }  }  			 		 	 	  	   	   		 		  		