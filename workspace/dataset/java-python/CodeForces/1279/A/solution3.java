import java.util.*; public class Absolutezero {      public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t=sc.nextInt();        for(int i=1;i<=t;i++){            int r=sc.nextInt();            int g=sc.nextInt();            int b=sc.nextInt();            int[] ar=new int[3];            ar[0]=r;            ar[1]=g;            ar[2]=b;            Arrays.sort(ar);            if((ar[0]+ar[1])>=(ar[2]-1)){                System.out.println("Yes");            }else {                System.out.println("No");            }           }       } }
