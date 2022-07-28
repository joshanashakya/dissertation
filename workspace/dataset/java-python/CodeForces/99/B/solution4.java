import java.io.*;
import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Iterator; 
public class b88{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float avg = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
		    A.add(sc.nextInt());
		    avg += (float)A.get(i);
		}
		avg = (float)avg/n;
		int count = 0;
		for(int i = 0; i < A.size(); i++){
		    if((float)A.get(i)!=avg){
		        count++;
		    }
		}
		if(count>2){
		    System.out.println("Unrecoverable configuration.");
		}
		else if(count == 0){
		    System.out.println("Exemplary pages.");
		}
		else if( count == 2){
		    ArrayList<Integer> B = new ArrayList<Integer>(A);
		    Collections.sort(B);
		    if(B.get(B.size()-1)-(int)avg ==(int)avg-B.get(0)){
		        System.out.println((B.get(B.size()-1)-(int)avg) +" ml. from cup #"
    		            + (A.indexOf(B.get(0))+1) + " to cup #"+ (A.indexOf(B.get(B.size()-1))+1) +".");
		    }
		    else{
		        System.out.println("Unrecoverable configuration.");
		    }
    		    
		}
	}	
}
