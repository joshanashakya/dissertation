/******************************************************************************                             Online Java Compiler.                Code, Compile, Run and Debug java program online.Write your code in this editor and press "Run" button to execute it. *******************************************************************************/import java.util.*;public class Main{	public static void main(String[] args) {	    Scanner src=new Scanner(System.in);	    int x=src.nextInt();	    int y=src.nextInt();	    int z=src.nextInt();	            int a=0 , b=0 ;        double min = 1;                     for(int den= (y<=z) ?y :z ; den>0 ; den--){            int num= ((((double)x/y)*den) - 0.5)== ((int)((double)x/y)*den)? ((int)((double)x/y)*den) : (int)Math.round( ((double)x/y)*den ) ;            //if(num==den)num--;            // System.out.println(num);            //     System.out.println(( ((double)x/y)  -  ((double)num/den)) + " "+num+" "+den );                 if(( Math.abs( ((double)x/y)  -  ((double)num/den) ))  <= min){	                a=num;	                b=den;	                //System.out.println(a +" - "+b);	                min=Math.abs((((double)x/y)  -  ((double)num/den)));	            }	            //System.out.println(  (((double)x/y)  -  ((double)num/den))  );                    }        System.out.println(a+"/"+b);	    	}}
