import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
 
public class Main 
{ 
    public static void ans(int []arr,int sum,int n){
        if(sum%n!=0){
            System.out.println("Unrecoverable configuration.");
            return;
        }
        int equal=sum/n;
        int inc=0,dec=0;
        for(int i=0;i<n;i++){
            if(arr[i]>equal)
            inc++;
            else if(arr[i]<equal)
            dec++;
        }
        if (inc==0 && dec==0){
             System.out.println("Exemplary pages.");
            return;
        }
        else if(inc==1 && dec==1){
            int a=0,b=0,ia=0,ib=0;
            for(int i=0;i<n;i++){
            if(arr[i]>equal){
            a=arr[i]-equal;
            ia=i;
            }
            else if(arr[i]<equal){
            b=equal-arr[i];
            ib=i;
            }
        }
        if(a==b){
             System.out.println(a+" ml. from cup #"+(ib+1)+" to cup #"+(ia+1)+".");
            return;
           
        }else{
            System.out.println("Unrecoverable configuration.");
            return;
        }
        }else{
             System.out.println("Unrecoverable configuration.");
            return;
        }
        
    }
    public static void main(String[] args) throws IOException 
    { 
  
       BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
         int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum=sum+arr[i];
        }
        ans(arr,sum,n);
}}
 
    
