     import java.util.Scanner;    public class CF800 {        public static void main(String[] args) {            Scanner input=new Scanner(System.in); int x=input.nextInt(); int counter=0; int counter2=1;int [] y=new int[x];for(int i =0; i<y.length;i++){y[i]=input.nextInt();counter++;} for(int c=0;c<counter-1;c++){ if(y[c]!=y[c+1]){ counter2++; } }  System.out.println(counter2);}    }   
