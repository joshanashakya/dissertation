import java.util.*;  public class Main {    private static Scanner in = new Scanner(System.in);     public static void main(String[] args) {//        int[] arr = new int[4001];//        arr[1] = 0;//        arr[2] = 1;//        int j = 2;//        for(int i = 3; i < 4001; i++){//            arr[i] = arr[i - 1];//            if((int)Math.pow(2,j) == i){//                arr[i] = 2*arr[i-1]+1;//            }//        }         int w = in.nextInt();        int h = in.nextInt(); //        int minn = Math.min(w,h);         System.out.println((long)(w*w-w%2)*(h*h-h%2)/16);     }}   		 					 	 		 	 		    	     		
